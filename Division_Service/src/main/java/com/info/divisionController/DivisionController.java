package com.info.divisionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.additionconsumer.AdditionConsumer;

@RestController
@RequestMapping("/division")
public class DivisionController {
	@Autowired
	private AdditionConsumer additionConsumer;
	@Value("${config.test}")
	private String config;


	@GetMapping("/getResult")
	public String getDivition(@PathVariable Integer num1,@PathVariable Integer num2) {
		Integer c;
		c=num1/num2;
		System.out.println(c);
		return "DivitionResult "+c;
	}

}
