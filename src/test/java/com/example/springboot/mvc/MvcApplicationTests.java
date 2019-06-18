package com.example.springboot.mvc;

import com.example.springboot.mvc.chain.*;
import com.example.springboot.mvc.dto.CommendParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MvcApplicationTests {

	//@Test
	public void contextLoads() {

	}

	public static void main(String []args){
		CommendParam commendParam = new CommendParam();

		Handler start = new Start();
		start.setNext(new AAA())
				.setNext(new BBB()).
				setNext(new CCC());
		start.done(commendParam);
	}

}
