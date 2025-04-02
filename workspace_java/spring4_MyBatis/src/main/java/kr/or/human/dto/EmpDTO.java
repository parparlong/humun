package kr.or.human.dto;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

// DTO : Data Transfer Object
// VO : Value Object
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자
//@EqualsAndHashCode // map에 key값을 비교하여 같은 클레스인지 확인하기위해사용
@Data
public class EmpDTO {

	private int empno;		// 사원번호
	private String ename;	// 사원명
	private String job;
	private Integer mgr;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date hiredate;
	private int sal = -1;
	private Integer comm;
	private Integer deptno;
	
	private String type;
	private String keyword;
	private String value;
	
	
}