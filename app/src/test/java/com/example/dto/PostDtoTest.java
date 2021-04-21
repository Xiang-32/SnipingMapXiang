package com.example.realestateproj.dto;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class PostDtoTest {
    @Test
    public void PostDtoTest() throws Exception {
        LocalDateTime dateTime = LocalDateTime.now();
        PostDto postDto = new PostDto();
        postDto.setPostId(12);
        postDto.setCreateDate(dateTime);
        postDto.setUpdateDate(dateTime);
        postDto.setFirstAddr("Sorae1");
        postDto.setRoadAddr("Sorae2");
        postDto.setSecondAddr("Sorae3");
        postDto.setSubAddr("Sorae4");
        postDto.setThirdAddr("Sorae5");
        postDto.setAuthor("Client");
        postDto.setCategory("Anger");
        postDto.setContent("Hello");
        postDto.setFindCnt(123);
        postDto.setGrade(1234);
        postDto.setTitle("Im Xiang");
        postDto.setTransactionType("Unknown");

        assertEquals(12, postDto.getPostId());
        assertEquals(dateTime,postDto.getCreateDate());
        assertEquals(dateTime,postDto.getUpdateDate());
        assertEquals("Sorae1",postDto.getFirstAddr());
        assertEquals("Sorae2",postDto.getRoadAddr());
        assertEquals("Sorae3",postDto.getSecondAddr());
        assertEquals("Sorae4",postDto.getSubAddr());
        assertEquals("Sorae5",postDto.getThirdAddr());
        assertEquals("Client",postDto.getAuthor());
        assertEquals("Anger",postDto.getCategory());
        assertEquals("Hello",postDto.getContent());
        assertEquals(123,postDto.getFindCnt());
        assertEquals(1234,postDto.getGrade());
        assertEquals("Im Xiang", postDto.getTitle());
        assertEquals("Unknown", postDto.getTransactionType());
    }

}