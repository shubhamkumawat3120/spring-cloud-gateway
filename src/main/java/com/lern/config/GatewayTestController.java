package com.lern.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class GatewayTestController {
	
	@GetMapping("/test")
	public Mono<String> getTest(){
		return Mono.just("Spring cloud gatway runing fine!");
	}

}
