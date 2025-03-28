package kr.or.human.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human.service.Empservice;

@Controller
public class empController {
	@Autowired
	Empservice empServiceimpl;
	
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	@ResponseBody
	public List listEmp() {
		
		List list = empServiceimpl.select();
		System.out.println(list);
		return list;
	}
	@RequestMapping("/home")
	public String empview() {
		
		
		
		return "home";
	}
}
