package com.song.mybatisTest.lamdba;

import com.song.mybatisTest.lamdba.entity.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author 金松广
 * @title: TestLambda
 * @projectName mybatisTest
 * @description:
 * @date 2019/3/30 15:09
 */
public class TestLambda {

	List<Employee> employeeList = Arrays.asList(
			new Employee(101,"张三",18,9999.99),
			new Employee(102,"李四",59,6666.66),
			new Employee(103,"王五",28,333.33),
			new Employee(104,"赵六",8,7777.77),
			new Employee(105,"田七",38,5555.55));
	@Test
	public void test1(){
		Collections.sort(employeeList,(e1,e2) -> {
			if(e1.getAge() == e2.getAge()){
				return e1.getName().compareTo(e2.getName());
			}else {
				return Integer.compare(e1.getAge(),e2.getAge());
			}
		});

		employeeList.stream().forEach(System.out::println);
	}

	/**
	 * 字符串转大写
	 */
	@Test
	public void test2(){
		MyFunction mf = (str) -> str.toUpperCase();
		String value = mf.getValue("abcd");
		System.out.println(value);
	}

	@Test
	public void test3(){
		MyFunction mf = (str) -> str.substring(2,5);
		String value = mf.getValue("Hello world");
		System.out.println(value);
	}

	@Test
	public void test4(){

	}

}
