package com.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.consumeraddtion.AdditionConsumer;

@RestController
@RequestMapping("/multiplication")
public class MultiController {
	@Value("${config.test}")
	private String config;
	
	@Autowired
	private AdditionConsumer addcon;
	
	@GetMapping("/getResult")
	public String getMultiplication(@PathVariable Integer num1,@PathVariable Integer num2) {
		Integer c;
		c=num1*num2;
		System.out.println(c);
		return "MultiplicationResult "+c;
	}

}