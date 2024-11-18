package com.basicAuth.sb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestControllerClass {
	
	@GetMapping(value = "firstmethod")
	public ResponseEntity<String> successMethod(){
		String output = "Authentication working well";
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
	
	@GetMapping(value = "secondmethod")
	public ResponseEntity<String> anotherSuccess(){
		String output = "Second Authentication also working well";
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
}
