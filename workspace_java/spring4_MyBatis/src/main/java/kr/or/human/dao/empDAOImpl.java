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
//		<mapper namespace="mapper.emp"> namespace을 보고 selectList 실행
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result ="+ result);
		return result;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
//		<!-- TooManyResultsException  selectOne사용시 결과값이 많으면 에러-->
		System.out.println("dto ="+ dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno",empno);
//		<!-- TooManyResultsException  selectOne사용시 결과값이 많으면 에러-->
		System.out.println("dto ="+ dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno2(EmpDTO dto) {
		EmpDTO dto2 = sqlSession.selectOne("mapper.emp.selectEmpno2",dto);
//		<!-- TooManyResultsException  selectOne사용시 결과값이 많으면 에러-->
		System.out.println("dto ="+ dto);
		return dto2;
	}
	
	@Override
	public int updateEmp(EmpDTO dto) {
		System.out.println("dto 뭐게"+dto);
		int result = sqlSession.update("mapper.emp.updateEmp",dto);
		System.out.println("updateEmp-result"+result);
		return result;
	}

	@Override
	public int insertEmp(EmpDTO dto) {
		System.out.println("dto 뭐게"+dto);
		int result = sqlSession.insert("mapper.emp.insertEMP",dto);
		return result;
	}

	@Override
	public int deleteEmp(EmpDTO dto) {
		System.out.println("dto 뭐게"+dto);
		int result = sqlSession.delete("mapper.emp.deleteEMP",dto);
		return result;
	}


}
