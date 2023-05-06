package com.facebook.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacebookController {
	@GetMapping("/Login")
public String login()
{
	return "Login Successful";
}
}
