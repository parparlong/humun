
import java.io.IOException;
import java.io.PrintWriter;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/req doGet실행");
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");

		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");

		String num1 = request.getParameter("num1");
		System.out.println("num1 :" + num1);

		String num2 = request.getParameter("num2");
		System.out.println("num2 :" + num2);

		String[] nums = request.getParameterValues("num1");
		if (nums != null) {
			for (String num : nums) {
				System.out.println("num :" + num);
			}
		}

//		response.getWriter().println("<strong>num1</strong> 값은 :" + num1);
//		response.getWriter().println("<strong>num2</strong> 값은 :" + num2);
		
		System.out.println("----------------------");
		
		System.out.println("pw :" + request.getParameter("pw"));
		System.out.println("btn :" + request.getParameter("btn"));
		System.out.println("hidden1 :" + request.getParameter("hidden1"));
		System.out.println("radio1 :" + request.getParameter("radio1"));
		System.out.println("date1 :" + request.getParameter("date1"));
		System.out.println("number1 :" + request.getParameter("number1"));
		System.out.println("div1 :" + request.getParameter("div1"));
		System.out.println("span1 :" + request.getParameter("span1"));
		System.out.println("text1 :" + request.getParameter("text1"));
		System.out.println("select1 :" + request.getParameter("select1"));
		System.out.println("textareal1 :" + request.getParameter("textareal1"));
		String textarea = request.getParameter("textareal1");
//		textarea = textarea.replace("\n", "<br>");
//		System.out.println(textarea);
		PrintWriter out = response.getWriter();
//		out.println(textarea);
		
		String[] checkbox1s = request.getParameterValues("checkbox1");
//		for (String checkbox1 : checkbox1s) {
//			System.out.println("checkbox1 :" + checkbox1);
//		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost실행");
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");

		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		System.out.println("여기부터------------------");
		String num1 = request.getParameter("num1");
		System.out.println("num1:"+num1);
		String num2 = request.getParameter("num2");
		System.out.println("num2 :" + num2);
		System.out.println("여기부터------------------");
		response.getWriter().println("{\"a\":\"100\"}");
//		response.getWriter().println("<strong>num1</strong> 값은 :" + num1);
//		 포스트버튼을 누르는순간에 1번 뉴가되고 포스트가 1번 실행되고 num1 출력
	}

}
















