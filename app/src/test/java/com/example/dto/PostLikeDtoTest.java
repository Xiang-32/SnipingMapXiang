package com.example.realestateproj.dto;

import junit.framework.TestCase;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PostLikeDtoTest {

    @Test
    public void postlikeTest() throws Exception {
        LocalDateTime dateTime = LocalDateTime.now();

        PostLikeDto postLikeDto = new PostLikeDto();
        postLikeDto.setUserId(1541);
        postLikeDto.setCreateDate(dateTime);
        postLikeDto.setPostId(9306);
        postLikeDto.setUpdateDate(dateTime);
        postLikeDto.setLikeId(1195);

        assertEquals(1541, postLikeDto.getUserId());
        assertEquals(9306, postLikeDto.getPostId());
        assertEquals(dateTime, postLikeDto.getCreateDate());
        assertEquals(dateTime,postLikeDto.getUpdateDate());
        assertEquals(1195,postLikeDto.getLikeId());

    }

}