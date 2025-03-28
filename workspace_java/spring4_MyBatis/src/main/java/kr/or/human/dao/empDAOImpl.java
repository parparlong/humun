package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class empDAOImpl implements empDAO {
//SqlSession
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
//		selectList 가 dto타입으로 뽑아온건가? 아니면 그냥 뽑아오기만한건가
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result ="+ result);
		return result;
	}

}
