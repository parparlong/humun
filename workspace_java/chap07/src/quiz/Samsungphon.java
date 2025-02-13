package quiz;

public class Samsungphon extends Phone {

	@Override
	void store() {
		System.out.println("삼성스토어입장");
	}
	
	@Override
	void bell() {
		System.out.println("삼서르르르르릉");
	}
	
	@Override
	void onOff() {
		this.power = !this.power;
		System.out.println("삼성폰켜짐 상태:"+this.power);
	}
	
	
}
