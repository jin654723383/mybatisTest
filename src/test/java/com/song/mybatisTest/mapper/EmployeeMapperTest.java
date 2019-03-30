package com.song.mybatisTest.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.management.openmbean.OpenMBeanOperationInfo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.song.mybatisTest.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeMapperTest {

    private SqlSessionFactory getSessionFaction() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory;
    }

    @Test
    public void testGetById() {

        fail("Not yet implemented");
    }

    @Test
    public void testListByLastNameAndGender() throws IOException {
        SqlSessionFactory sessionFaction = getSessionFaction();
        
        SqlSession openSession = sessionFaction.openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            List<Employee> employeeList = mapper.listByLastNameAndGender("jerry", 0);
            log.info("employeeList = {}", employeeList);
        }finally {
            openSession.close();
        }
        
    }
    @Test
    public void testSave() throws IOException {

        SqlSessionFactory sessionFaction = getSessionFaction();

        SqlSession openSession = sessionFaction.openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee(null, "lff", "lff@163.com", 1);

            Integer result = mapper.save(employee);
            log.info("result = {}", result);
            log.info("employee = {}",employee);
            
            openSession.commit();
        } finally {
            openSession.close();
        }
    }

    @Test
    public void testUpdateById() throws IOException {

        SqlSessionFactory sessionFaction = getSessionFaction();
        SqlSession openSession = sessionFaction.openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee(10, "tran", "tran@qq.com", 1);
            Boolean result = mapper.updateById(employee);
            log.info("result = {}", result);
            openSession.commit();
        } finally {
            openSession.close();
        }
    }

    @Test
    public void testDeleteById() throws IOException {

        SqlSessionFactory sessionFaction = getSessionFaction();
        SqlSession openSession = sessionFaction .openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            mapper.deleteById(7);
            openSession.commit();
        }finally {
            openSession.close();
        }
        
    }

}
