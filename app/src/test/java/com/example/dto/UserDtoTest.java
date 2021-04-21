package com.example.realestateproj.dto;

import junit.framework.TestCase;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserDtoTest{

    @Test
    public void GetterSetter테스트() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setName("Xiang");
        userDto.setEmail("ssang@naver.com");
        userDto.setPassword("asdf");
        userDto.setUserId(1);
        userDto.setAuth("USER");

        assertEquals("ssang@naver.com", userDto.getEmail());
        assertEquals(1,userDto.getUserId());
        assertEquals("Xiang",userDto.getName());
        assertEquals("asdf", userDto.getPassword());
        assertEquals("USER",userDto.getAuth());

    }


//    @Test
//    public void Builder테스트() throws Exception {
//        UserDto userDto = UserDto.builder()
//                .email("cef5787@naver.com")
//                .password("1231232")
//                .build();
//
//        assertEquals("cef5787@naver.com", userDto.getEmail());
//    }
}