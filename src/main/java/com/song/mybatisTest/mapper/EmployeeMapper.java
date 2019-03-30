package com.song.mybatisTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.song.mybatisTest.entity.Employee;

public interface EmployeeMapper {
    
    public Employee getById(Integer id);
    /**
     * 根据lastName和gender查询
     * 
     * @param lastName
     * @param getnder
     * @return
     */
    public List<Employee> listByLastNameAndGender(@Param("lastName") String lastName,@Param("gender")Integer gender);
    
    public Integer save(Employee employee);
    
    public Boolean updateById(Employee employee);
    
    public void deleteById(Integer id);

}
