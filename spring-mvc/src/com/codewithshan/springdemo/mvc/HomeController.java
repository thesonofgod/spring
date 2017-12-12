package com.codewithshan.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Controller class Step 1
public class HomeController {

	@RequestMapping("/")	
	public String showPage(){
		return "main-menu";
	}
}
