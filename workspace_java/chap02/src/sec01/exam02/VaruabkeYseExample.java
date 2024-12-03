package sec01.exam02;

public class VaruabkeYseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute =5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		int totalSec = totalMinute * 60;
		System.out.println(totalSec+"초입니다"); // 185분이 총 몇초인지 계산식
		
		int x = 10;
		int y = 20;
		System.out.println("x의 값 :  "+ x);
		System.out.println("x+y의 값은 "+(x+y));
		x = y;
		System.out.println("x의 값 :  "+ x);
		
		
//		System.out.println("j : "+j); j값을 아래에 선언했기때문에 에러뜸
		int j = 1;
		System.out.println("j : "+j);
	
		{
			System.out.println("j : "+j);	
		}
		{
			int i = 0;
			System.out.println("i : "+i);
//			int i = 10; 같은 변수명으로 선언할수없다 
//			i = 10; 변수에 새로운 값은 넣을수 있다.
//			int j = 100; //메소드 블럭에서 정의한 변수는 정의할수 없다
		}
//		System.out.println("i : "+i); i의 지역변수 위치에서 벗어나서 오류
		int i = 10;
		System.out.println("i : "+i);
	}

}
