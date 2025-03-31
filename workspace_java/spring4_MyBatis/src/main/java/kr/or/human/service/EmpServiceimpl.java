package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.empDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpServiceimpl implements Empservice{
	
	@Autowired
	empDAO DAOimpl;
	@Override
	public List<EmpDTO> select() {
		List list = DAOimpl.selectEmpList();
		
		return list;
	}
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = DAOimpl.selectOneEmp();
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = DAOimpl.selectOneEmpno(empno);
		return dto;
	}
	
	public EmpDTO selectOneEmpno2(EmpDTO dto) {
		EmpDTO dto2 = DAOimpl.selectOneEmpno2(dto);
		return dto2;
	}
	
	@Override
	public int updateEmp(EmpDTO dto) {
		int result = DAOimpl.updateEmp(dto);
		return result;
	}
	

}
