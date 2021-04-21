package com.example.realestateproj.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PostDto {
    private long PostId;
    private LocalDateTime CreateDate;
    private LocalDateTime UpdateDate;
    private String FirstAddr;
    private String RoadAddr;
    private String SecondAddr;
    private String SubAddr;
    private String ThirdAddr;
    private String Author;
    private String Category;
    private String Content;
    private long FindCnt;
    private int Grade;
    private String Title;
    private String TransactionType;
}
