package com.example.SahilProjectTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import  com.example.SahilProjectTest.vo.RequestClass;
import com.example.SahilProjectTest.vo.ResponseClass;

@RestController	
public class StudentController {
	
	
	@PostMapping("/bfhl")
	public ResponseClass method1(RequestClass requestBody){
		ResponseClass responseClass = new ResponseClass();
		System.out.println("requestBody "+requestBody.toString());
		if(!requestBody.getTemp().isEmpty()) {
			for(int i=0;i<requestBody.getTemp().size();i++) {
			 	if(requestBody.getTemp().get(i).chars().allMatch(Character::isDigit)) {
			 		responseClass.getNumbers().add(requestBody.getTemp().get(i));
			 	}else {
			 		responseClass.getAlphabets().add(requestBody.getTemp().get(i));
			 	}
			}

		}
		 	responseClass.setEmail("john@xyz.com");
		 	responseClass.setOll_number("ABCD123");
		 	responseClass.setStatus("true");
		 	responseClass.setUser_id("john_doe_17091999");

		 
		return responseClass;
	}

}
