package kr.or.human5.comtroller;

import java.net.HttpCookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human5.dto.MemberDTO;

@Controller
public class mesComtroller {
	
	String id = "admin";
	String pw = "1234";
	String name = "관리자";
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginCheck")
	public String loginCheck(MemberDTO dto
		,HttpServletRequest req) {
		
		if(dto.getId().equals(this.id)
				&& dto.getPw().equals(this.pw)) {
			dto.setName(this.name);
			
			//세션에 담기 
			HttpSession session = req.getSession();
			session.setAttribute("dto", dto);
			
		
			
			//main으로 이동
			return "redirect:main";
		}else {
			//실패시 login으로 이동
			return "redirect:login?msg=2";	
		}
		
		//만약 로그인 성공하면
		//amin으로 이동
		//실패시 login으로 이동
	}
	// 1. 세션쿠기 와 제이세션은 언제 발급받는지 ? 서버에 접근하면 발급 
	// 2. 발급받는 기준 ?그냥줌 있으면줌 
	// 3. 세션쿠기는 누가 발급해줌? 톰켓이줌 
	// 4. 제이세션은 == 세션쿠기 맞음 
	// 
	
	
	
	@RequestMapping("/main")
	public String main(
			HttpServletRequest req) {
//		//로그인 한 사람만 보기
//		// 안한 사람은 login으로 이동
//		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		}else {
//			
//		}
		return "main";
	}
	
	@RequestMapping("/main2")
	public String main2(
			HttpServletRequest req) {
//		//로그인 한 사람만 보기
//		// 안한 사람은 login으로 이동
//		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		}else {
//			
//		}
//	}
	
	return "main2";
	}
}
