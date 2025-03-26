package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ui")
public class ParamController {

	//로그인 페이지 표시
	@RequestMapping("/login.do")
	public ModelAndView loginForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
	}

	@RequestMapping("/login")	
	public ModelAndView login(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id는 ="+id +"pw는 : "+pw);
		
		request.setAttribute("id1", id);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id2",pw);
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		mav.addObject("dto",memberDTO);
		
		
		
		
		
		return mav;
	}
	
	@RequestMapping("/login2")
	public ModelAndView login2(
			//String id = request.getParameter("id"); 과 같음
			//기본적으로 필수값, 없다면 400 Bad Request 코드 발생
			//즉, requird=true가 기본값
//			@RequestParam("id")
			@RequestParam(value="id", required=false)
			String id,
			
			// parameter의 key와 변수명이 같다면 @RequestParam 생략가능
			// @RequestParam을 생략하면 아래줄이 생략됨
			// @RequestParam(value="id", required=false)
			String pw,
//			, String a // 안줬으니까 null
//			,int b // null이 안들어가서 500 오류
			@RequestParam
			Map map,
			MemberDTO memberDTO
	) {
		
//		String id = request.getParameter("id");
		System.out.println("아이디 :" + id);
		System.out.println("비밀번호 :" + pw);
		System.out.println("map.id :" + map.get("id"));
		System.out.println("map.id :" + map);
		System.out.println("memberDTO :" + memberDTO);
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}
	
	@RequestMapping("/login3")
	public ModelAndView login3(
			// 파라메터에서 꺼내서
			// DTO에 알아서 넣어줌
			@ModelAttribute
			MemberDTO dto1,
			
			//DTO를 자동으로 채우고 
			//모델에 넣어주기까지 해줌, 아랫줄 생략 가능 
			//mav.addObject("dto22", dto2); 
			@ModelAttribute("dto22")
			MemberDTO dto2,
			
			//DTO타입의 앞글자만 소문자로 변경한 key로
			//모델에 넣어줌 
			//@ModelAttribute("memberDTO")
			MemberDTO dto3
			
	) {
		System.out.println("dto1 : "+ dto1);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto11", dto1);
		return mav;
	}
	
	@RequestMapping("/login4")
	public String login4() {
		return "result";
	}
	
	@RequestMapping("/login5")
	public String login5() {
		return "redirect:login.do"; //주소를 바꿔줌
	}
	
	@RequestMapping("/login5_1")
	public String login5_1() {
		return "forward:login.do"; //검색 주소 유지되고 서버 내부에서 요청을 다른페이지로 전달
	}								//기본이 리퀘스트리졸브가 jsp로 매핑을 해주기때문에 포워드를붙이면 login.do로 접속가능
	
	@RequestMapping("/login6")
	public String logi6( Model model ) {
		model.addAttribute("id1", "model");
		return "result";
	}
	
//	@RequestMapping("/result")
	@RequestMapping("/result.human4")
	public void logi7(  ) {
		// 리턴 타입이 void 또는 리턴 값이 null일때 
		// @RequestMapping의 주소 중 마지막 쩜 앞의 글씨를 
		// ViewResolver로 보냄
		
	}
	
	@RequestMapping("/login8/{id}")
	public String logi8(
			@PathVariable("id")
			String id
		
			) {
		System.out.println("id :"+id);
		return "result";
		
	}
	@RequestMapping("/login9/{month}/add/{day}")
	public String login9(
			@PathVariable("month") // 생략 불가능
			String m,
			
			@PathVariable("day")
			int d
		
			) {
		System.out.println("m :"+m);
		System.out.println("d :"+d);
		return "result";
		
	}
	
	@RequestMapping("/login10")
	public String login10(
			) {
		return "result";
		
	}
	
	@RequestMapping(value="/login11",method=RequestMethod.GET)
	public String login11(
			) {
		return "result";
		
	}
	
	@RequestMapping(value="/login12",method= {RequestMethod.GET,RequestMethod.POST})
	public String login12(
			) {
		return "result";
		
	}
	
	@RequestMapping(value={"/login13","/login14"})
	public String login13(
			) {
		System.out.println("13또는 14");
		
		return "result";
		
	}
	
	@RequestMapping(value="/login15",method= RequestMethod.GET)
	public String login15(
			) {
		System.out.println("15에 GET");
		
		return "result";
		
	}
	
	@RequestMapping(value="/login15",method= RequestMethod.POST)
	public String login15_1(
			) {
		System.out.println("15에 POST");
		
		return "result";
		
	}
	@RequestMapping(value="/login16")
	public String login16_1(
			) {
		System.out.println("15에 POST");
		
		return "result";
		
	}
//	@RequestMapping(value="/login16")
//	public String login16_2(
//			) {
//		System.out.println("15에 POST");
//		
//		return "result";
//		
//	}
	
}
