package com.example.demoporject;

import java.net.ConnectException;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceClass {

	@Retryable(value = Exception.class, maxAttempts = 4, backoff = @Backoff(value = 20000))
	public String callAnotherApi() {
		System.out.println("nish retrying");
		RestTemplate rest = new RestTemplate();
		String r = null;

		r = rest.getForObject("http://localhost:8081/hihi?name=lombokbro", String.class);

		return r;
	}

	@Recover
	public String recover() {
		System.out.println("nish was here");
		return "api is down".toUpperCase() + " boro boro ";
	}

}
