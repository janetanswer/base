package com.brightstar.http.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.brightstar.http.server.controller.get.json.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokTest {

	
	@Test
	public void test() {
		Person request = new Person("key",9,true);
		System.out.println("start");
		System.out.println(request.getName());
		System.out.println(request.toString());
	}

}
