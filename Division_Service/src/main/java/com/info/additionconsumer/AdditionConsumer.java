package com.info.additionconsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdditionConsumer {
	@Autowired
	private DiscoveryClient discoveryClient;

	public ResponseEntity<String> getAddData() {
		List<ServiceInstance> instances = discoveryClient.getInstances("ADDITION-SERVICE");
		ServiceInstance serviceInstance = instances.get(0);
	 String url=serviceInstance.getUri()+"/additionService/getResult";
	 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++"+url);
	 RestTemplate rest=new RestTemplate();
	 ResponseEntity<String> forEntity = rest.getForEntity(url,String.class);
	 System.out.println(forEntity);
	 return forEntity;

	}
}
