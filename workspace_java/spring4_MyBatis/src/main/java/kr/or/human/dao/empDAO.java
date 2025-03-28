package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface empDAO {

	List<EmpDTO> selectEmpList();
}
