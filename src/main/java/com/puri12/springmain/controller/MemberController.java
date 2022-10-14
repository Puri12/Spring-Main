package com.puri12.springmain.controller;

import com.puri12.springmain.Dto.request.MemberRequestDto;
import com.puri12.springmain.Dto.response.ResponseDto;
import com.puri12.springmain.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MemberController {

  private final MemberService memberService;

  @PostMapping(value = "/member/signup")
  public ResponseDto<?> signup(@RequestBody @Valid MemberRequestDto requestDto) {
    return memberService.createMember(requestDto);
  }
}
