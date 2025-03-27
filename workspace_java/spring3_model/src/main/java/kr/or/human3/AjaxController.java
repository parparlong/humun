package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	@RequestMapping("/ajax1")
	public String ajax1(
//			@RequestParam("id") // json으로 보낸건 
								// @RequestParam 이나 request.getPrarmeter로 받을 수 없다.
			
			@RequestBody		//@RequestBody json을 파싱해줌 
//			String id			//잘안씀 된긴하는대 햇갈림
			MemberDTO dto
			
			) {
		
		System.out.println("dto :"+ dto);
		
		return "ajax";
	}
	
	@RequestMapping("/ajax2")
	@ResponseBody //클라이언트에게 직접 데이터를 전송하는 데 사용
	public String ajax2(
			@RequestBody		
			MemberDTO dto			
			) {
		
		System.out.println("dto : "+dto);
		
		return "ajax";
	}
	
	@RequestMapping("/ajax3")
	@ResponseBody
	public MemberDTO ajax3(
			@RequestBody		
			MemberDTO dto			
			) {
		
		System.out.println("dto : "+dto);
		
		return dto;
	}
	
	
	
	@RequestMapping("/ajax4")
	@ResponseBody
	public List ajax4(
			@RequestBody
			MemberDTO dto
			) {
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		System.out.println("list : "+list);
		System.out.println("dto.getId() : "+dto.getId());
		System.out.println("dto.getPw() : "+dto.getPw());
		return list;
	}
	
}
