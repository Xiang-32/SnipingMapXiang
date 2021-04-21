package com.example.realestateproj.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PropertyInfoDto {
    private long PropertyInfoId;
    private LocalDateTime CreateDate;
    private LocalDateTime UpdateDate;
    private double Latitude;
    private double Longtitude;
    private long PostId;


}
