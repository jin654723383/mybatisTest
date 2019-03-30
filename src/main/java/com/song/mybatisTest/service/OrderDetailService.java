package com.song.mybatisTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.song.mybatisTest.entity.OrderDetail;
import com.song.mybatisTest.mapper.OrderDetailMapper;

@Service
@Transactional
public class OrderDetailService {
    
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    
    public List<OrderDetail> list(OrderDetail orderDetail) {
        return  orderDetailMapper.list(orderDetail);
    }
}
