package com.info.divisionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.additionconsumer.AdditionConsumer;

@RestController
@RequestMapping("/divisionService")
public class DivisionController {
	@Autowired
	private AdditionConsumer additionConsumer;
	@Value("${config.test}")
	private String config;

	@GetMapping("/getResult")
	public ResponseEntity<String> getDivition() {
		return additionConsumer.getAddData();
	}

}
