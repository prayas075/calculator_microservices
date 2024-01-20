package com.info.addtionController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/additionService")
@RefreshScope
public class AddditionController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${config.test}")
	private String config;
	
	@GetMapping("/getResult")
	public String getAddition() {
		System.out.println("AdditionResult "+port+" "+config);
		return "AdditionResult "+port+" "+config;
	}

}
