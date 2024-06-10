package com.anish.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anish.entity.Student;

@Controller
public class HomeController {
	
	@Autowired
	private Student student;
	
	@RequestMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("id", 10);
		model.addAttribute("name", "Anish");
		
		List<String> subject=new ArrayList<>();
		subject.add("Hindi");
		subject.add("Englisg");
		subject.add("Mathmatic");
		subject.add("Physics");
		subject.add("Chemistry");
		
		model.addAttribute("subject", subject);
		
		return "home";
	}
	
	@RequestMapping("/payment")
	public ModelAndView payment(ModelAndView mv) {
		
		student.setId(101);
		student.setName("Chandan Singh");
		student.setFee(50000.00);
		
		mv.addObject("student", student);
		mv.setViewName("payment");
		return mv;
	}

}
