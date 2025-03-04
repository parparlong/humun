
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo")
public class TodoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoDAO todoDAO = new TodoDAO();
		List resultList = todoDAO.selectTodoList();

		request.setAttribute("resultList", resultList);

		String url = "/WEB-INF/views/list.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String command = request.getParameter("command");
		System.out.println("command :" + command);
//		if(command != null && command.equals("update")) 
		if ("update".equals(command)) {
			// up date 장소
			String done = request.getParameter("done");
			if (done == null) {
				done = "N";
			}
			System.out.println("done :" + done);
			String str_todo_id = request.getParameter("todo_id");
			int todo_id = Integer.parseInt(str_todo_id);

			TodoDTO todoDTO = new TodoDTO();
			todoDTO.setDone(done);
			todoDTO.setTodo_id(todo_id);

			TodoDAO todoDAO = new TodoDAO();
			int result = todoDAO.updateTodo(todoDTO);
//			System.out.println("result :" + result);

		} else {
			String todo = request.getParameter("todo");
			System.out.println("todo : " + todo);

			TodoDTO todoDTO = new TodoDTO();
			todoDTO.setTodo(todo);

			TodoDAO todoDAO = new TodoDAO();
			int result = todoDAO.insertTodo(todoDTO);
			System.out.println("result :" + result);
		}

		String url = "todo";
		response.sendRedirect(url);

	}

}
