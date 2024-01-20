package com.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.consumeraddtion.AdditionConsumer;

@RestController
@RequestMapping("/multiService")
public class MultiController {
	@Value("${config.test}")
	private String config;
	
	@Autowired
	private AdditionConsumer addcon;
	
	@GetMapping("/getResult")
	public String getmulti() {
		return addcon.getAdditionData();
	}

}