package sec05.exam01;

public class Car {

	String model;
	int spped;

	Car(String model) {
		this.model = model;
	}

	//메소드명 : printModel
	//전달인자 없음 리턴타입 없음
	void printModel(){
		System.out.println("model"+this.model);
	}
	
	
}
