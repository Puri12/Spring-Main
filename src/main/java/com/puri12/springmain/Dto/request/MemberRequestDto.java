package com.puri12.springmain.Dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {

    @NotBlank(message = "{nickname.notnull}")
    @Size(min = 4,max = 12, message = "{nickname.size}")
    @Pattern(regexp = "^[a-z]*$")
    private String nickname;

    @NotBlank(message = "{password.notnull}")
    @Size(min = 8,max = 20, message = "{password.size}")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,20}$", message = "{password.pattern}")
    private String password;

    @NotBlank
    private String passwordConfirm;
}
