package com.org.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/StudentFallback")
    public Mono<String> studentServiceFallBack() {
        return Mono.just("Student Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/collegeFallback")
    public Mono<String> collegeServiceFallBack() {
        return Mono.just("College Service is taking too long to respond or is down. Please try again later");
    }
    
    @RequestMapping("/feignFallback")
    public Mono<String> feignServiceFallBack() {
        return Mono.just("Feign Service is taking too long to respond or is down. Please try again later");
    }
}
