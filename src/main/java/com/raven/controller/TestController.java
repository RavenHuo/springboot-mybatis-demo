package com.raven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test")
	public String testPage() {
		return "/test";
	}
	
	@RequestMapping("/userTest")
	public String userTest() {
		return "/Users";
	}
}
