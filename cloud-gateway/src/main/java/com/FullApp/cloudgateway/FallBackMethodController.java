package com.FullApp.cloudgateway;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public ResponseEntity<String> userServiceFallBackMethod() {
		return new ResponseEntity<>("User Service Taking Longer Than Expected."+"Please Try Again.",HttpStatus.INTERNAL_SERVER_ERROR) ;
	}
	 
	@GetMapping("/departmentServiceFallBack")
	public ResponseEntity<String> departmentServiceFallBackMethod() {
		return new ResponseEntity<>("Department Service Taking Longer Than Expected."+"Please Try Again.",HttpStatus.INTERNAL_SERVER_ERROR) ;
	}
}
