package com.org.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.feign.dto.UserResponse;

@Service
@FeignClient(url ="https://jsonplaceholder.typicode.com/",name = "USER-CLIENT")
public interface UserClient  {
     
	@GetMapping("/users")
	public List<UserResponse> getAllUser();
}
