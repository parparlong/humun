package quiz_phone_2025_02_17;

public class Phone {
	String calling ;
	String callme;
	
	void calling(String number) {
		System.out.println(number+"로 전화거는중.........");
		this.calling = number;
	}
	void callme(String number) {
		System.out.println(number+"로 전화오는중.........");
		this.callme = number;
	}
}
