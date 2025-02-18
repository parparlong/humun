package quiz_Login_2025_02_17;

public class Human {

	void join(Change ch, String name, String id, String pw) {
		if (ch instanceof Naver) {
			Naver na = (Naver) ch;
			na.join(name, id, pw);
		}else if(ch instanceof Daum){
			Daum na = (Daum) ch;
			na.join(name, id, pw);
		}
	}

	void finId(Change ch, String name) {
		if (ch instanceof Naver) {
			Naver na = (Naver) ch;
			na.finId(name);
		}else if(ch instanceof Daum){
			Daum na = (Daum) ch;
			na.finId(name);
		}
	}
	void finPw(Change ch, String name,String id) {
		if (ch instanceof Naver) {
			Naver na = (Naver) ch;
			na.finPw(name,id);
		}else if(ch instanceof Daum){
			Daum na = (Daum) ch;
			na.finPw(name,id);
		}
	}
	
	void loginCheck(Change ch, String id,String pw) {
		if (ch instanceof Naver) {
			Naver na = (Naver) ch;
			na.loginCheck(id,pw);
		}else if(ch instanceof Daum){
			Daum na = (Daum) ch;
			na.loginCheck(id,pw);
		}
	}

}
