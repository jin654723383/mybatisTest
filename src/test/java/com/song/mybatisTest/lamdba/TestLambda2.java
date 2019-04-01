package com.song.mybatisTest.lamdba;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author 金松广
 * @title: TestLambda2
 * @projectName mybatisTest
 * @description:
 * @date 2019/3/30 11:03
 */
@Slf4j
public class TestLambda2 {

	@Test
	public void test1(){
		Runnable runable = new Runnable(){

			@Override
			public void run() {
				System.out.println("Hello World");
			}
		};

		runable.run();
		log.info("---------------------");
		Runnable r2 = () -> System.out.println("Hello Lambda");
		r2.run();
	}

	@Test
	public void test2(){
		Consumer<String> cu = (x) -> log.info("Hello {}",x);
		cu.accept("测试Consumer抽象接口");
	}

	@Test
	public void test3(){
		Comparator<Integer> co = (x,y) -> Integer.compare(x,y);
		int compare = co.compare(1, 2);
		log.info("compare = {}",compare);
	}

	@Test
	public void test4(){
		Function<Integer,Integer> fn = (x) -> x*x;
		Integer num = fn.apply(100);
		log.info("num = {}",num);
	}
}
