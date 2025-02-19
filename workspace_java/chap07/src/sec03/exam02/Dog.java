package sec03.exam02;

public class Dog extends Animal{

	String name;
	Dog(){
		super(null);
	}
	@Override
	void sound() {
	System.out.println("멍멍");
		
	}

}
