package com.shrek.example.service;

import com.shrek.example.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MyApplication.class)
public class StudentServiceTest {

	@Autowired
	private StudentService studentService;
	
	@Test
	public void test() {
		JSONObject jsonObject =new JSONObject();
		//studentService.listStudent(jsonObject);
	}

}
