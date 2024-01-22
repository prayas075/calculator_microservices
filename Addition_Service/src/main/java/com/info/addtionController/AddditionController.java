package com.info.addtionController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addition")
@RefreshScope
public class AddditionController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${config.test}")
	private String config;
	
	@GetMapping("/getResult/{num1}/{num2}")
	public String getAddition(@PathVariable Integer num1,@PathVariable Integer num2) {
		Integer c;
		c=num1+num2;
		System.out.println(c);
		return "AdditionResult "+c;
	}

}
