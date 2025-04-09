package kr.or.human6.Service;

import java.util.List;
import java.util.Map;

import kr.or.human6.DTO.EmpDTO;

public interface Empservice {

	public List<EmpDTO> select();  
	public EmpDTO selectOneEmp();
	public EmpDTO selectOneEmpno(int empno);
	public EmpDTO selectOneEmpno2(EmpDTO dto);
	public int updateEmp(EmpDTO dto);
	public int insertEmp(EmpDTO dto);
	public int deleteEmp(EmpDTO dto);
	public Map<String,Object> getEmpSearchList(EmpDTO dto);
	
}
