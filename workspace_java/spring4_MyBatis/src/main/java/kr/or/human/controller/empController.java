package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value="/empselct",method=RequestMethod.GET)
	public String listEmp(Model model) {
		
		List<EmpDTO> list = empServiceimpl.select();
		System.out.println("list"+list);
		
		model.addAttribute("list",list);
		return "emp";
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
	
	@RequestMapping(value="/detailEmp",method=RequestMethod.GET)
	public String oneEmpno2(@ModelAttribute EmpDTO empDTO , Model model) {
		
		EmpDTO dto = empServiceimpl.selectOneEmpno2(empDTO);
		System.out.println("---------------------------");
		System.out.println("controller empDTO "+ empDTO);
		System.out.println("---------------------------");
		model.addAttribute("dto",dto);
		
		return "detailEmp";
	}
	
	@RequestMapping(value="/modifyEmp",method=RequestMethod.GET)
	public String modifyEmp(@ModelAttribute EmpDTO empDTO , Model model) {
		
		EmpDTO dto = empServiceimpl.selectOneEmpno2(empDTO);
		model.addAttribute("dto",dto);
		return "modifyEmp";
	}
	
	
	
//	@RequestMapping(value="/updateEmp",method=RequestMethod.PUT)
//	public ResponseEntity<Integer> updateEmp(@RequestBody EmpDTO empDTO ) {
//		
//		
////		String result = Integer.toString(empServiceimpl.updateEmp(empDTO));
//		//empServiceimpl.updateEmp(empDTO); 타입이 integer이다 문제는 
//		//Unknown return value type: java.lang.Integer "알 수 없는 반환 값 타입: java.lang.Integer"
//		//해결방법 리턴타입을 ResponseEntity<Integer> 수정후 리턴이 1이면 1을 보내고 0이면 0을보낸다
//		Integer result = empServiceimpl.updateEmp(empDTO);
//		System.out.println("result = "+result);
//		
//		if(result > 0) {
//			return ResponseEntity.ok(1);		
//			http상태코드가 200이면 1을 보내고
//		}else {
//			return ResponseEntity.ok(0);
//			http상태코드가 200이안되면 0을 보냄 
//		}
//	}
	
	@ResponseBody
	@RequestMapping(value="/updateEmp",method=RequestMethod.PUT)
	public int updateEmp(@RequestBody EmpDTO empDTO ) {
		
		int result = empServiceimpl.updateEmp(empDTO);
		System.out.println("result = "+result);
	
			return result;		
	}
	
	
	@RequestMapping(value="/creatEmp",method=RequestMethod.GET)
	public String creatEmp() {
		
		return "creatEmp";
	}
	
	@ResponseBody
	@RequestMapping(value="/insertEmp",method=RequestMethod.POST)
	public int insertEmp(@RequestBody EmpDTO empDTO ) {
		
		int result = empServiceimpl.insertEmp(empDTO);
		System.out.println(" insertEmp result = "+result);
	
			return result;		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteEmp(Model model) {
		
		List<EmpDTO> list = empServiceimpl.select();
		System.out.println("list"+list);
		
		model.addAttribute("list",list);
		return "delete";
	}
	
	@ResponseBody
	@RequestMapping(value="/deleteEmp",method=RequestMethod.DELETE)
	public int deleteEmp(@RequestBody EmpDTO empDTO ) {
		
		int result = empServiceimpl.deleteEmp(empDTO);
		System.out.println(" deleteEmp result = "+result);
	
			return result;		
	}
	
//	model = list 를 담는 그릇 
//	@ModelAttribute DTO를 담는 그릇
//	@RequestBody json형태로 전달인자로 받는것을 DTO에 받아줌
//	@ResponseBody ViewResolver를 거치지 않고 나가게해줌
//	@RequestParam 브라우저에서 form형태로 데이터를 전송하거나 컨트롤러에 
	
}
