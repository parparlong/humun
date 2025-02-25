

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	
    public RequestServlet() {
        super();
      
        System.out.println("싱글톤입니다");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet실행");
		//요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		//응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		String num1 = request.getParameter("num1");
		System.out.println("num1 :"+ num1);
		
		String num2 = request.getParameter("num2");
		System.out.println("num2 :"+ num2);
		
		String[] nums = request.getParameterValues("num1");
		if(nums != null) {
			for(String num : nums) {
				System.out.println("num :"+num);
			}			
		}
		
		response.getWriter().println("<strong>num1</strong> 값은 :"+num1 );
		response.getWriter().println("<strong>num2</strong> 값은 :"+num2 );
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
