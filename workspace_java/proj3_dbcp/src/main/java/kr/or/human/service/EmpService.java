package kr.or.human.service;

import java.util.List;

import kr.or.human.dao.EmpDao;

public class EmpService {

	public List getEmpList() {
		System.out.println("EmpService getEmpList 실행");
		

		EmpDao empDao = new EmpDao();
		List list = empDao.selectEmpList();
		
		System.out.println("목록의 길이 : "+ list.size());
		return list;
	}
	

}
