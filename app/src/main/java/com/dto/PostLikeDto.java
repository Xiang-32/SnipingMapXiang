package com.example.realestateproj.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PostLikeDto {
    private long LikeId;
    private LocalDateTime CreateDate;
    private LocalDateTime UpdateDate;
    private long PostId;
    private long UserId;
}
