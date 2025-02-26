

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ipServlet
 */
@WebServlet("/IpServlet")
public class IpServlet extends HttpServlet {

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//마지막 출발지 ip주소 확인
		System.out.println("getRemoteAddr :"+request.getRemoteAddr());
		//들어온 메소드 방식
		System.out.println("getMethod :"+request.getMethod());
		// 주소 전체. 단, 쿼리스트링 제외
		System.out.println("getRequestURL :"+request.getRequestURL());
		//ip,port,쿼드스트링 제외한 주소
		System.out.println("getRequestURI :"+request.getRequestURI());
			
		//Context.path; 프로젝트 구분하는 주소
		System.out.println("getContextPath :"+request.getContextPath());

		//Context.path까지와 쿼리스트링 제외한 주소
		System.out.println("getServletPath :"+request.getServletPath());
		
		//쿼드스트링
		System.out.println("getQueryString :"+request.getQueryString());
		
	}



}
