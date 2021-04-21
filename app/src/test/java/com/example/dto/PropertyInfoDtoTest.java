package com.example.realestateproj.dto;

import junit.framework.TestCase;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PropertyInfoDtoTest {
    @Test
    public void PropertyInfoTest()  {
        LocalDateTime dateTime = LocalDateTime.now();
        PropertyInfoDto propertyInfoDto = new PropertyInfoDto();
        propertyInfoDto.setCreateDate(dateTime);
        propertyInfoDto.setUpdateDate(dateTime);
        propertyInfoDto.setLatitude(15.234);
        propertyInfoDto.setLongtitude(125.23);
        propertyInfoDto.setPostId(12490432);
        propertyInfoDto.setPropertyInfoId(195283);


        assertEquals(dateTime, propertyInfoDto.getCreateDate());
        assertEquals(dateTime, propertyInfoDto.getUpdateDate());
        assertEquals(12490432, propertyInfoDto.getPostId());
        assertEquals(195283, propertyInfoDto.getPropertyInfoId());
        assertEquals(15.234, propertyInfoDto.getLatitude(),0.0);
        assertEquals(125.23,propertyInfoDto.getLongtitude(),0.0);

    }

}