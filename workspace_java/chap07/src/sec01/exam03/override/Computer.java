package sec01.exam03.override;

public class Computer extends Calc {

	@Override 	//부모에 해당 메소드가 똑같이있는지 검사해준다
				//오버라이드 없어도 메소드 재정의는 할수있다
	int plus(int x, int y) {
		System.out.println("문의하신 정답은 :");
		System.out.println(x + y + "입니다");
		return x+y;
	}
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle실행");
		return Math.PI * r * r; 
	}
}
