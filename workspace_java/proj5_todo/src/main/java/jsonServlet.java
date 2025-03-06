

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class jsonServlet
 */
@WebServlet("/jsonServlet")
public class jsonServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TodoDAO todoDAO = new TodoDAO();
		List resultList = todoDAO.selectTodoList();
		
		new JsonObject();
		new JsonArray();
		
		Gson gson = new Gson();
		String json = gson.toJson(resultList);
		
		response.getWriter().println(json);
	}



}
