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

		Handler start = new Start(commendParam);
		start.setNext(new AAA(commendParam))
				.setNext(new BBB(commendParam)).
				setNext(new CCC(commendParam));
		start.support(commendParam);
	}

}
