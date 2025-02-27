package kr.or.human.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.human.service.EmpService;
import kr.or.human.view.EmpView;


@WebServlet("/emp")
public class EmpController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmpController doGet 실행");
		EmpService EmpService = new EmpService();
		List list = EmpService.getEmpList();
		
		EmpView empView = new EmpView();
		empView.viewEmp(list,response);
	}



}
