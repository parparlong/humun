package quiz_Login_2025_02_17;

public class Daum extends Change{
	String id;
	String pw;
	String name;
	boolean login = true;
	@Override
	void join(String name,String id,String pw) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		System.out.println("다음 회원가입이 완료되었습니다.");
	}
	void finId(String name) {
		
		if(this.name.equals(name)) {
			System.out.println("이름은 :"+this.name+"  아이디는 :"+this.id+" 입니다.");
		}
	}
	void finPw(String name,String id) {
		if(this.name.equals(name) && this.id.equals(id)) {
			System.out.println("패스워드는 :"+this.pw+" 입니다.");
		}
	
	}
	void loginCheck(String id,String pw) {
		if(this.id == id && this.pw == pw) {
			System.out.println("다음 회원이십니다.");
		}else {
			System.out.println("아이디 또는 페스워드가 틀렸습니다.");
		}
	}
}
