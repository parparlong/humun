package kr.or.human.dao;

import java.util.List;
import java.util.Map;

import kr.or.human.dto.EmpDTO;

public interface empDAO {

	public List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public EmpDTO selectOneEmpno(int empno);
	public EmpDTO selectOneEmpno2(EmpDTO dto);
	public int updateEmp(EmpDTO dto);
	public int insertEmp(EmpDTO dto);
	public int deleteEmp(EmpDTO dto);
	public List<EmpDTO> getEmpSearchList(EmpDTO dto);
	public int countEmp ();
	
	
}
