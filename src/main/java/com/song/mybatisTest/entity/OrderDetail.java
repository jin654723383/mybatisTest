package com.song.mybatisTest.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderDetail {
    
    private String detailId;
    
    private String orderId;
    
    private String productId;
    
    private String productName;
    
    private BigDecimal productPrice;
    
    private Integer productQuantity;
    
    private String productIcon;
    
    private LocalDateTime createTime;
    
    
}
