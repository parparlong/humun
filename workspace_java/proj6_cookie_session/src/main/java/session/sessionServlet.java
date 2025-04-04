package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sessionServlet
 */
@WebServlet("/session")
public class sessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//세션을 가져오는 방법 
		//세션이란? 서버에서 관리하는 
		//기존 세션이 없으면 새로 만들어주고 
		//있으면 그걸 가져옴
		HttpSession session = request.getSession();
		
		//기존 세션이 없으면 null, 있으면 가져옴
//		HttpSession session = request.getSession(false);
		
		//세션에서 가져오기
		//없으면 null
		String value = (String)session.getAttribute("key");
		System.out.println("value 값:"+value);
	
		//세션에 저장
		session.setAttribute("key", "value");
		
		//로그인 예제
		if("admin".equals(request.getParameter("id"))) {
			session.setAttribute("isLogon", true);
		}
		//로그인이 되면 /session/mypage 접속시 여기는 로그인해야 올 수 있는 곳 이뜬다
		
		
	}

}
