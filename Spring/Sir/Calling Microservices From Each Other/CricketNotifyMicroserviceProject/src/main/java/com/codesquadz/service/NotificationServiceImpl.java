package com.codesquadz.service;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	private static final String CRICKET_SERVICE_ID = "cricket";

	@Override
	@HystrixCommand(fallbackMethod = "getMatchDetailsByIdFallback")
	public Properties getMatchDetailsById(int matchId) {
			
		System.out.println("Calling the underlying service");
		
		List<ServiceInstance> cricketServiceInstances = discoveryClient.getInstances(CRICKET_SERVICE_ID);
		
		if (cricketServiceInstances.isEmpty()) {
			System.out.println("No cricket service found for ID : {}");
			throw new RuntimeException("No cricket service found");
		}

		ServiceInstance cricketServiceInstance = cricketServiceInstances.get(0);
		
		String url = cricketServiceInstance.getUri().toString() + "/" + matchId;
		
		ResponseEntity<Properties> response = restTemplate.exchange(url, HttpMethod.GET, null, Properties.class);
		
		

		Properties matchDetails = response.getBody();
		matchDetails.setProperty("source", url);
		System.out.println("Found match:{} for matchId:{} from underlying cricket service");

		return matchDetails;

	}


	public Properties getMatchDetailsByIdFallback(int matchId) {
		System.out.println("HYSTRIX FALLBACK METHOD IS INVOKED");
		Properties properties = new Properties();
		properties.setProperty("source", "getMatchDetailsByIdFallback");
		properties.setProperty("matchDetails", "NOT FOUND");
		return properties;
	}
}