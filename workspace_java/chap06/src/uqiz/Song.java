package uqiz;

public class Song {
	//필드
	// 변수 선언 : 변수타입 변수명
	// 변수 선언과 동시에 초기화는 가능
	// 나머지 "행동"은 불가능
	
	
	/**
	 * 제목,가수,좋아요개수
	 */
	String title;
	String singer;
	int like;
	
	/**
	 *  title을 변경하는 메소드 만들기
	 *  메소드명 setTitle
	 * 
	 * @param string
	 * @return string
	 */
	//리턴타입 메소드명 (전달인자들) {}
	//정해진 순서대로 처리
	
	//1번 풀이 
	String setTitle(String a) {
		title = a;
		return title;
	}
	void setTitle2(String title) {
		this.title = title;  // 
		 //리턴안써도됨 
	}

	Song(){
		System.out.println("song 생성자 실행");
		String a = "MAMA";
		setTitle2(a);
		System.out.println(title);
	}
	
//	 void plus(double x, double y) {
//		double result = x + y;
//		System.out.println("더하기 결과"+result);
	 double plus(double x, double y) {
		double result = x + y;
		System.out.println("더하기 결과"+result);
		return result;
	 }



}


