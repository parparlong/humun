

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudyTest
 */
@WebServlet("/StudyTest")
public class StudyTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/thml; charset=utf-8");
	
	try {
//		1. JNDI 준비
//		2. DB접속 완료하기
//		3. SQL준비 
//		4. 
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle");
		Connection con = ds.getConnection();
		
		String query = "select * from emp";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		
		List<Map> list = new ArrayList<Map>();
		while(rs.next()) {
			int empno =rs.getInt("empno");
			String ename =rs.getString("ename");
			Date hiredate =rs.getDate("hiredate");
			
			System.out.println("===========");
			System.out.println(" empno : "+ empno);
			System.out.println(" name : "+ ename);
			System.out.println(" hiredate : "+ hiredate);
			Map map = new HashMap();			
			map.put("empno", empno);
			map.put("ename", ename);
			map.put("hiredate", hiredate);
			list.add(map);
			
			
		}
		for(int a =0; a<list.size(); a++) {
			response.getWriter().println(list.get(a));
			System.out.println(list.get(a));
			list.get(a);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}



}
