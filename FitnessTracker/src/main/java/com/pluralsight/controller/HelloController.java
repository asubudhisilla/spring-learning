/**
 * 
 */
package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author amar_bcool
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting.html")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting","Hello World!!!");
		return "hello";
	}

}