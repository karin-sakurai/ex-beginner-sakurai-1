package com.example.demo;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("result")
	public String result(Integer shohin1,Integer shohin2,Integer shohin3) {
		application.setAttribute("shohin1", shohin1);
		application.setAttribute("shohin2", shohin2);
		application.setAttribute("shohin3", shohin3);
		application.setAttribute("total",(shohin1+shohin2+shohin3));
		application.setAttribute("tax", ((shohin1+shohin2+shohin3)*1.1));
		return "exam03-result";
	}
}
