package kr.or.human.b;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AmptjerServlet
 */
@WebServlet("/another")
public class AnotherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Another에 doGet실행");
		
		//어차피 forward라서 여기에 적어도 소용 없음
		response.getWriter().println("사실 another");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Another에 doPost실행");

		String text = request.getParameter("text");
		System.out.println("text"+text);
		
		
	}

}
