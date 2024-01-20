package com.info.additionconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("ADDITION-SERVICE")

public interface AdditionConsumer {
	
        @GetMapping("/additionService/getResult")
		public String getAddition();
}
