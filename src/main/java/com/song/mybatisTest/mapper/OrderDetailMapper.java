package com.song.mybatisTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.song.mybatisTest.entity.OrderDetail;

@Mapper
public interface OrderDetailMapper {
    
    List<OrderDetail> list(OrderDetail orderDetail);
}
