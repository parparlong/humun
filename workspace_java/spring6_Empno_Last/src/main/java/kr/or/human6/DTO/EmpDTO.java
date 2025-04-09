package kr.or.human6.DTO;
import java.sql.Date;
import java.util.List;

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
	private Integer rnum;
	
	
	private String type;
	
	private String value;
	private String stringvalue;
	private int intvalue;
	
	private String keyword;
	private List empnos;
	
	private int page = 1; // 현재 페이지
	private int viewCount =10; // 페이지당 보여줄 수 countPerPage / rowPerPage
	private int indexStart;
	private int indexEnd;
	
	
	
}