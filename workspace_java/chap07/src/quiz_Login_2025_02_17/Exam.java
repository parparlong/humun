package quiz_Login_2025_02_17;

public class Exam {

	public static void main(String[] args) {
		Human human = new Human();
		Naver naver = new Naver();
		Daum daum = new Daum();
		System.out.println("-------naver------------");
		naver.join("김경민","감자","감자123");
		human.finId(naver,"김경민");
		human.finPw(naver,"김경민","감자");
		human.loginCheck(naver, "감자","감자123");
		human.loginCheck(naver, "22","222");
		System.out.println("-------daum------------");
		daum.join("박혜성","크왕","크왕123");
		human.finId(daum,"박혜성");
		human.finPw(daum,"박혜성","크왕");
		human.loginCheck(daum,"크왕","크왕123");
		human.loginCheck(daum,"123","123");

	}

}
