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

}
