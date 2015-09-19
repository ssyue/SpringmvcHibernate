package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.bean.Student;

@Controller
public class StudentController {
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String student() {
		System.out.println("==student()=");
		return "student";
	}
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student,ModelMap model){
		model.addAttribute("name",student.getName());
		model.addAttribute("age",student.getAge());
		model.addAttribute("id",student.getId());
		return "result";
	}
}
