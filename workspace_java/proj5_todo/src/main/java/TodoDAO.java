import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class TodoDAO {
	public int insertTodo(TodoDTO todoDTO) {
		System.out.println("TodoDAO insertTodo 실행");
		
		int result = -1;
		try {
			// [db 접속 시작]
			Context ctx = new InitialContext(); // JNDI 컨텍스트 생성
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");// 오라클 이라는 이름에 DataSource 찾기
			// 커넥션 풀에서 접속 정보를 가져오기
			// 접속이 안되면 null
			Connection con = ds.getConnection(); // DB 연결
			// DB 접속 완

			// [SQL 준비]
			String 	query =  " insert into todo ";
//					방법 1: sql string을 그냥 만들기
//					query += " values (seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null,'N')";
//					방법 2: ? 활용하기
					query += " values (seq_todo.nextval, ?, sysdate, null,'N')";
					
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, todoDTO.getTodo());
			// 왼쪽 : prepareStatement = SQL실행을 위한 객체
			// 오른쪽 :con.prepareStatement(query) = 미리컴파일하고 문제가있으면 에러를 나타냄
//		--	PreparedStatement// 메소드가 아님 물어보기---

			// [SQL 실행] 및 [결과 확보]
			// ResultSet executeQuery : SQL중 select 실행
			// int executeUpdate() : select 외 모든것
			// 
			result = ps.executeUpdate();

		
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	List selectTodoList(){
		System.out.println("selectTodoList 실행");
		List list = new ArrayList();
		
		try {
			// [db 접속 시작]
			Context ctx = new InitialContext(); // JNDI 컨텍스트 생성
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");// 오라클 이라는 이름에 DataSource 찾기
			// 커넥션 풀에서 접속 정보를 가져오기
			// 접속이 안되면 null
			Connection con = ds.getConnection(); // DB 연결
			// DB 접속 완

			// [SQL 준비]
			String 	query =  " select * from todo";
			PreparedStatement ps = con.prepareStatement(query);
					

			// [SQL 실행] 및 [결과 확보]
			// ResultSet executeQuery : SQL중 select 실행
			// int executeUpdate() : select 외 모든것
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				TodoDTO dto = new TodoDTO();
				dto.setTodo_id(rs.getInt("todo_id"));
				dto.setTodo(rs.getString("todo"));
				dto.setCreate_date(rs.getDate("create_date"));
				dto.setModify_date(rs.getDate("modify_date"));
				dto.setDone(rs.getString("done"));
				list.add(dto);
			}

		
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	public int updateTodo(TodoDTO todoDTO) {
		System.out.println("TodoDAO updateTodo 실행");
		
		int result = -1;
		try {
			// [db 접속 시작]
			Context ctx = new InitialContext(); // JNDI 컨텍스트 생성
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");// 오라클 이라는 이름에 DataSource 찾기
			// 커넥션 풀에서 접속 정보를 가져오기
			// 접속이 안되면 null
			Connection con = ds.getConnection(); // DB 연결
			// DB 접속 완

			// [SQL 준비]
			String 	query =  " update todo ";
					query += " set done = ? ";
					query += " where todo_id = ? ";
					
			
					
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, todoDTO.getDone());
			ps.setInt(2, todoDTO.getTodo_id());
			// 왼쪽 : prepareStatement = SQL실행을 위한 객체
			// 오른쪽 :con.prepareStatement(query) = 미리컴파일하고 문제가있으면 에러를 나타냄
//		--	PreparedStatement// 메소드가 아님 물어보기---

			// [SQL 실행] 및 [결과 확보]
			// ResultSet executeQuery : SQL중 select 실행
			// int executeUpdate() : select 외 모든것
			// 
			result = ps.executeUpdate();

		
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
