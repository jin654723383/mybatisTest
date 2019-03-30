package com.song.mybatisTest;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.song.mybatisTest.entity.OrderDetail;
import com.song.mybatisTest.mapper.OrderDetailMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan(basePackages = "com.song.mapper")
public class OrderDetailMapperTest {
    
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    
    private SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession openSession = sqlSessionFactory.openSession();
        
        return openSession;
    }

    @Test
    public void testList() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("1001");
        orderDetail.setOrderId("1001");
        orderDetail.setProductId("1001");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(3.2));
        orderDetail.setProductQuantity(100);
        
        orderDetailMapper.list(orderDetail);
        Assert.assertNotNull(orderDetail);       
    }
    
    @Test
    public void test1() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        
    }

}
