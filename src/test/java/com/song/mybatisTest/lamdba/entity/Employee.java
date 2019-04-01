package com.song.mybatisTest.lamdba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 金松广
 * @title: Employee
 * @projectName mybatisTest
 * @description:
 * @date 2019/3/30 15:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer id;

	private String name;

	private Integer age;

	private double salary;
}
