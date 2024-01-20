package com.info.consumeraddtion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdditionConsumer {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	public String getAdditionData() {

		// Always choose Single instance instead complete list
		ServiceInstance choose = loadBalancerClient.choose("ADDITION-SERVICE");
		// Create url

		String url = choose.getUri() + "/additionService/getResult";
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> res = rest.getForEntity(url, String.class);
		return res.getBody();

	}

}
