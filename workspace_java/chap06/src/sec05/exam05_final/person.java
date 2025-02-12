package sec05.exam05_final;

public class person {
	final String nation = "Korea";
	final String ssn;
	
	//상수
	static final double PI = 3.14;
	
	person(){
		this.ssn = "123";
	}
	void test() {
//		this.ssn = "123";
//		final은 선언과 동시에 초기화 / 그게아니면 생성자에서 초기화 
	}
}
