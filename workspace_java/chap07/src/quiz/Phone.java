package quiz;

public class Phone {
	boolean power;
	String masege;
	

	
	void kakaocorp(String masege) {
		this.masege = "기본카카오입장";
		System.out.println(masege);
		System.out.println(this.masege);
	}
	
	void onOff() {
		this.power = !this.power;
	}
	
	void bell() {
		System.out.println("따르릉따르릉");
	}
	void store() {
		System.out.println("스토어입장");
	}
}
