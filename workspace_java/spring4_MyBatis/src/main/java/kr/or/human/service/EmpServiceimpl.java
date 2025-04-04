package kr.or.human.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String,Object>  getEmpSearchList(EmpDTO dto) {
		//할려고하는게 셀렉트 값을 type으로 받고 텍스트값을 value값으로 받고 
		//그럼? where  upper(${셀렉트값 ename,empno} like upper('%' || #{value} ||'%')
		//이런식으로 안되나? 
//		dto.setEname(dto.getType());
//			try {
//				if("ename".equals(dto.getType())) {
//					
//				}else if("empno".equals((dto.getType()))) {
//					dto.setIntvalue(Integer.parseInt(dto.getStringvalue()));
//					
//				}else if("sal".equals(dto.getType())) {
//					dto.setIntvalue(Integer.parseInt(dto.getStringvalue()));
//				}
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}

		System.out.println("dto ="+ dto);
		//한페이지의 내용만 있는 리스트
		List list = DAOimpl.getEmpSearchList(dto);
		//전체 글 개수 
		int count = DAOimpl.countEmp();
		
		Map <String,Object> map = new HashMap();
		map.put("list", list);
		map.put("count", count);
		
		return map;
		//그대로주고 DB에서 바꾸자 
		
		
	}

	void paging() {
		int page = 3;
		int viewCount = 10;
//		int idxStart = 21;
//		int idxEnd = 30;
		
//		(viewCount * 2) +1; 
//		(viewCount * (3-1)) +1; 
		int idxStart = (viewCount * (page-1)) +1; 
		int idxEnd = page * viewCount;
	}
	

}
