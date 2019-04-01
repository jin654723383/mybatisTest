package com.song.mybatisTest.lamdba;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * @author 金松广
 * @title: TestLambda3
 * @projectName mybatisTest
 * @description:
 *  java8内置的四大核心接口
 *  Consumer<T> 消费型接口
 *      void accept(T t)
 *  Supplier<T> ：供给型接口
 *          T get();
 *  Function<T,R>:函数型接口
 *          R apply(T t)
 *  Predicate<T> :段言型接口
 *          boolean test(T t)
 * @date 2019/3/30 16:34
 */
public class TestLambda3 {


	@Test
	public void getRandom(){
		//1.math
		for(int i = 0; i < 10; i++){
			/*System.out.print(Math.random()+",");*/
			System.out.print((int)(100 + Math.random() * (900)));
			System.out.print(",");

		}
		//2
		/*for (int i = 0; i < 10; i++){
			Random ra = new Random();
			System.out.println(ra.nextInt(1000));
		}*/
	}
}
