package sec03.exam02;

public abstract class Animal {

	//자식이 기본생성자 생성시 super사용하면서 부모의 기본생성자를 불러온다.
	Animal(){
		
	}
	Animal (String name){
		
	}
	
	String kind;
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	//추상 메소드
	//abstract 키워드가 붙은 메소드
	//실행 블럭 {} 이 있으면 안됨
	//나는 구현하지 않음
	//대신에 나는 상속받은 자식이 꼭! 구현해야 한다
	abstract void sound();
}
