package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		String m = myCar.model;
		System.out.println(m);
		
		Car myCar2 = new Car();
		myCar2.model = "알반떼";
		String m2 = myCar2.model;
		System.out.println(m);
		System.out.println(m2);
		System.out.println(myCar.speed);
		System.out.println(myCar2.speed);
		
		//sec02.exam01.Car@512ddf17 @가있으면 참조타입이다
		//라고생각해도된다
		System.out.println(myCar);
		
		
		
		
		
		
		
		
		
	}

}
