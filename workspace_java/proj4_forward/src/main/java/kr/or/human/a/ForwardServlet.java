package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forword")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ForwardServlet에 doGet실행");

		String text = request.getParameter("text");
		System.out.println("text" + text);

		String url = "another";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ForwardServlet에 doPost실행");

		String text = request.getParameter("text");
		System.out.println("text" + text);

		String url = "another";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
