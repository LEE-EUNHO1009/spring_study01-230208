package com.eunocompany.test.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//hello 요청이오면 실행되는 메서드
	@RequestMapping(value = "/hello")
	public String hello() {
		
		return "test";
	}
	//good 요청이오면 실행되는 메서드
	@RequestMapping(value = "/good")
	public String good() {
		
		return "good";
	}
	
}
