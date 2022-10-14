package com.puri12.springmain.service;

import com.puri12.springmain.models.Member;
import com.puri12.springmain.models.UserDetailsImpl;
import com.puri12.springmain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
  private final MemberRepository memberRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Member> member = memberRepository.findByNickname(username);
    return member
            .map(UserDetailsImpl::new)
            .orElseThrow(() -> new UsernameNotFoundException(username + "을 가진 사용자를 찾을 수 없습니다."));
  }
}
