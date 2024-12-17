package sec03.exam01;

public class Car {

	/*
	 * ### 생성자

		클래스를 생성할 때 즉, new할 때 무조건 실행되는 메소드의 일종
		리턴타입이나, return문은 쓰지 않는다. 
		이유는 무조건 생성된 heap 영역의 주소를 돌려주기 때문에 고정값이 라서,
		메소드 명에 해당하는 이름은 무조건 클래스 이름이여야 한다.
		즉, 리턴타입이 없고 메소드명이 클래스명과 동일한 경우 생성자라고 한다.
	 */
	
	//	기본 생성자: 전달인자와 실행 내용이 없는 생성자
	//	public Car() {}
	//	기본 생성자는 생략가능하다
	//	즉,생성자를 적지 않으면 기본 생성자가 자동 완성된다.
	
	String brand = "아반떼";
	String color = null; //기본값
//	color = "흰색";  // 선언과 동시에 초기화가능 / 선언후 초기화 따로 불가능
	int cc = 0;  // 기본값
	
	// 클래스를 new 생성할때
	// 1.필드 먼저 선언됨
	// 2.생성자 실행
//	 Car() { //생성자도 오버로딩을 지원함
//	}
	
	 Car(int c) {
	cc = c;
	System.out.println("Car() 생성");
	test();
	}
	Car(String b){
		brand = b;
		System.out.println("Car(String) 생성 :"+brand);
	}
	
	Car(){
		this("아반떼","흰색",1300);
		System.out.println("Car() 생성자 실행");
	}
	
	Car(String b, String c, int cc2){
		// 다른 생성자 호출하는 방법
		//Car() 호출
		//무족건 첫번째 줄에서 호출해야 한다.
//		this();
		
		brand = b;
		color = c;
		cc = cc2;
		System.out.println("Car(String b, String c, int cc2) 실행");
	}
	
	Car(String brand, int cc){
		String color = "파랑";
		System.out.println(color);
		System.out.println(this.color);
		this.brand = brand;
		this.cc = cc;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void test() {
		color = "흰색";
		System.out.println("car() 생성"+color);
		System.out.println("test() 실행");
	}
	void init() {
		brand = "아반떼";
		color = "흰색";
		cc = 1300;
				
	}
	
	
	
	
	
	
	
	
	
}
