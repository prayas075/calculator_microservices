package com.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.additionconsumer.AdditionConsumer;

@RestController
@RequestMapping("/subtraction")
public class SubController {
	@Autowired
	private AdditionConsumer additionConsumer;
	
	@Value("${config.test}")
	private String config;

	@GetMapping("/getResult")
	public String getSubstraction(@PathVariable Integer num1,@PathVariable Integer num2) {
		Integer c;
		c=num1-num2;
		System.out.println(c);
		return "SubstractionResult "+c;
	}

}
