package kr.or.human3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.human3.dto.WebttonDTO;
import kr.or.human3.service.WebtoonService;


@Controller
public class WebttonController {

	@Autowired
	WebtoonService webtoonService;
	


	@RequestMapping("/Webttoon")
	public String Webttoon(Model model) {
		List list = webtoonService.getList();
		model.addAttribute("list",list);
		
		
		return "Webttoon";
	}
	
	//아작스로 데이터 들어모면 해당 함수 실행하고 어차피 위에꺼실행하면 가니까 
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String Webttooninsert(@RequestBody WebttonDTO dto ) {
		System.out.println("dto-------------"+dto);
		List list = new ArrayList();
		list.add(dto);
		
		 webtoonService.insert(dto);
		
		
		return "Webttoon";
	}
	

	
}
