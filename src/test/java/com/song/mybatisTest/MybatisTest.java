package com.song.mybatisTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.song.mybatisTest.entity.Employee;
import com.song.mybatisTest.mapper.EmployeeMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试mybatis <B>文件名称：</B>MybatisTest.java<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 * <B>版权声明：</B>(C)2019-2015<BR>
 * <B>公司部门：</B>研发部<BR>
 * <B>创建时间：</B>2019年3月13日<BR>
 * 
 * @author 金松广
 * @version
 */
@Slf4j
public class MybatisTest {

    private SqlSession getOpeanSession() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession openSession = sqlSessionFactory.openSession();

        return openSession;
    }

    @Test
    public void test1() throws IOException {

        SqlSession openSqlSession = getOpeanSession();
        EmployeeMapper mapper = openSqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.getById(1);
        log.info("employee = {}", employee);
    }

}
