package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {

// xml의 id와 DAO의 메소드명을 같게 한다
// 클래스에 @Mapper 설정
// mapper namespace 명을 패키지.클래스명 명과 같게 설정
// servlet-context.xml 	> mybatis-spring:scan 코드 삽입
//                     	> xmlns:mybatis-spring= 주소 삽입
//						> 등등 삽입
	
	

	
	List<EmpDTO> selectEmp1();
	
	@Select("select * from emp2 empno=#{empno}")
	List<EmpDTO> selectDetailEmp2(@Param("empno") int empno);
	
	
	
	
}
