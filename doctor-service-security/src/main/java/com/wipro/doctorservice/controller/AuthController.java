package com.wipro.doctorservice.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.wipro.doctorservice.dto.AuthRequest;
import com.wipro.doctorservice.service.JwtService;

@RestController
@RequestMapping("/auth")

public class AuthController {
	@Autowired
	private JwtService jwtService;
	
	@PostMapping("/token")
	public String generateToken(@RequestBody AuthRequest authRequest) {
		return jwtService.generateToken(authRequest.getUsername());
	}
	@GetMapping("/test")
	public String test() {
		return "Auth Working";
	}

}
