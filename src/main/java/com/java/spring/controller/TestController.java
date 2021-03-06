package com.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.service.TestServiceInterface;

@Controller
public class TestController {
	
	@Autowired
	TestServiceInterface tsi;
	
	@RequestMapping("/test")
	public ModelAndView test(ModelAndView mav){
		mav.setViewName("test");
		mav.addObject("data", tsi.test());
		return mav;
	}
}
