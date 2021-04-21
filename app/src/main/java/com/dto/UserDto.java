package com.example.realestateproj.dto;

import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class UserDto {

    private long UserId;
    private String Auth;
    @Email(message = "이메일 형식에 맞지 않습니다!")
    private String Email;

    @NotEmpty(message = "공백불가")
    private String Name;

    private String Password;


    @Builder
    public UserDto(long userId, String auth, String email, String name, String password) {
        UserId = userId;
        Auth = auth;
        Email = email;
        Name = name;
        Password = password;
    }
}