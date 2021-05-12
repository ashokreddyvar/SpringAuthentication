package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/con")
public class HelloController {
	@GetMapping("/get")
	@ResponseBody
	public String  sayHello() {
		return "hello ojas";
		
	}
	

}
