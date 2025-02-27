package kr.or.human.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kr.or.human.dto.EmpDTO;

public class EmpView {
	
	public void viewEmp(List<EmpDTO> list, HttpServletResponse response) {
		
		try {
			response.getWriter().println("<style>#tab{font-size:30px; border:1px solid red;} th,td{border:1px solid red;}</style>");
			response.getWriter().println("<table id=\"tab\">");
			response.getWriter().println("<tr>");
			response.getWriter().println("<th>");
			response.getWriter().println("empno");
			response.getWriter().println("</th>");
			response.getWriter().println("<th>");
			response.getWriter().println("ename");
			response.getWriter().println("</th>");
			response.getWriter().println("<th>");
			response.getWriter().println("hireadte");
			response.getWriter().println("</th>");
			response.getWriter().println("</tr>");
			; 
			
			for(int i = 0; i < list.size(); i++) {
				response.getWriter().println("<tr>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getEmpno());				
				response.getWriter().println("</td>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getEname());				
				response.getWriter().println("</td>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getHireadte());				
				response.getWriter().println("</td>");
				response.getWriter().println("</tr>");
				
			}
			response.getWriter().println("</table>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
