package quiz;

public class Iphone extends Phone {

	@Override
	void store() {
		System.out.println("앱스토어입장");
	}
	
	@Override
	void bell() {
		System.out.println("아이폰르르르르릉");
	}

	@Override
	void onOff() {
		this.power = !this.power;
		System.out.println("아이폰켜짐 상태:"+this.power);
	}

}
