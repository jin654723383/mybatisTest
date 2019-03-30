package com.song.mybatisTest.action;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.mybatisTest.entity.OrderDetail;
import com.song.mybatisTest.service.OrderDetailService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("orderDetail")
@Slf4j
public class OrderDetailAction {
    
    @Autowired
    private OrderDetailService orderDetailService;
    
    @GetMapping
    public void list() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("1001");
        orderDetail.setOrderId("1001");
        orderDetail.setProductId("1001");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(Double.toString(3.2)));
        orderDetail.setProductQuantity(100);
        List<OrderDetail> list = orderDetailService.list(orderDetail );
        log.info("list = {}",list);
    }
    
}
