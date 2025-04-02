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
	@Override
	public int insertEmp(EmpDTO dto) {
		int result = DAOimpl.insertEmp(dto);
		return result;
	}
	@Override
	public int deleteEmp(EmpDTO dto) {
		int result = DAOimpl.deleteEmp(dto);
		return result;
	}
	@Override
	public  List<EmpDTO> getEmpSearchList(EmpDTO dto) {
		//할려고하는게 셀렉트 값을 type으로 받고 텍스트값을 value값으로 받고 
		//그럼? where  upper(${셀렉트값 ename,empno} like upper('%' || #{value} ||'%')
		//이런식으로 안되나? 
		if("ename".equals(dto.getType() && isNaN(dto.getValue()))) {
			dto.setEname(dto.getType());
		}
		List list = DAOimpl.getEmpSearchList(dto);
		System.out.println("dto ="+ dto);
		return list;
	}
	

}
