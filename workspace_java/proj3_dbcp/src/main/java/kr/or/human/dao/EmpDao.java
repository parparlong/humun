package kr.or.human.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;

// Data Access Object
public class EmpDao {

	public List selectEmpList() {
		System.out.println("EmpDao selectEmpList 실행");
		List resultList = new ArrayList();
		try {
			// [db 접속 시작]
			// context.xml의 Resource 중에 jdbc/oracle 가져오기
			// JNDI 방식으로...
			// JNDI란 전화번호부와 같이 미리 설정을해두어 필요할때
			// 직접 코드에 입력하지않고 이름만으로 DB에 접속할수있게 도와줌
			Context ctx = new InitialContext(); // JNDI 컨텍스트 생성
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");// 오라클 이라는 이름에 DataSource 찾기
			// 커넥션 풀에서 접속 정보를 가져오기
			// 접속이 안되면 null
			Connection con = ds.getConnection(); // DB 연결
			// DB 접속 완

			// [SQL 준비]
			String query = " select * from emp";
			// 컴파일이 필요해서 준비하는곳에 쿼리문을 전달인자로 던져준다
			PreparedStatement ps = con.prepareStatement(query);
			// 왼쪽 : prepareStatement = SQL실행을 위한 객체
			// 오른쪽 :con.prepareStatement(query) = 미리컴파일하고 문제가있으면 에러를 나타냄
//		--	PreparedStatement// 메소드가 아님 물어보기---

			// [SQL 실행] 및 [결과 확보]
			// ResultSet executeQuery : SQL중 select 실행
			// int executeUpdate() : select 외 모든것
			// ResultSet : select 조회 결과 전체: 엑셀 테이블 느낌
			ResultSet rs = ps.executeQuery();

			// 결과 활용
//			rs.next();	//rs = 전체 셀렉터 rs.next는 첫번째 줄로 커서이동 
			// 다음줄이 있으면 true,없으면 false를 return
			while (rs.next()) { // 다음줄이 없을 때 까지 반복
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");

				System.out.println("===========");
				System.out.println(" empno : " + empno);
				System.out.println(" name : " + ename);
				System.out.println(" hiredate : " + hiredate);

				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(empno);
				empDTO.setEname(ename);
				empDTO.setHireadte(hiredate);

//				list.add(map);
				resultList.add(empDTO);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
}
