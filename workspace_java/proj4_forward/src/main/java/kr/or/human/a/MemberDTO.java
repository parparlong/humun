package kr.or.human.a;

public class MemberDTO {

	private String id;
	private String pw;
	public String getId() {
		System.out.println("MemberDTO에 getId 실행");
		return id;
	}
	public void setId(String id) {
		System.out.println("MemberDTO에 SetId 실행");
		this.id = id;
	}
	public String getPw() {
		System.out.println("MemberDTO에 getPw 실행");
		return pw;
	}
	public void setPw(String pw) {
		System.out.println("MemberDTO에 setPw 실행");
		this.pw = pw;
	}
	
}
