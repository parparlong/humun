package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human.dto.EmpDTO;
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
	

	@RequestMapping(value="/empOne",method=RequestMethod.GET)
	public String oneEmp() {
		EmpDTO dto = empServiceimpl.selectOneEmp();
		System.out.println("---------------------------");
		System.out.println("controller dto "+ dto);
		System.out.println("---------------------------");

		return "emp";
	}
	
	@RequestMapping(value="/empOneno",method=RequestMethod.GET)
	public String oneEmpno(@RequestParam("empno") int empno ) {
		EmpDTO dto = empServiceimpl.selectOneEmpno(empno);
		System.out.println("---------------------------");
		System.out.println("controller dto "+ dto);
		System.out.println("---------------------------");
		
		return "emp";
	}
	
	@RequestMapping(value="/empOneno2",method=RequestMethod.GET)
	public String oneEmpno2(@ModelAttribute EmpDTO empDTO ) {
		
		EmpDTO dto = empServiceimpl.selectOneEmpno2(empDTO);
		System.out.println("---------------------------");
		System.out.println("controller empDTO "+ empDTO);
		System.out.println("---------------------------");
		
		return "home";
	}
}
