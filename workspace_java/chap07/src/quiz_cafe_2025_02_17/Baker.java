package quiz_cafe_2025_02_17;

public class Baker extends Employee{
//제빵사
	@Override
	//손님접대
	void entertainingGuests() {
		System.out.println("제빵사 손님접대 완료");
	}
	//공부하기
	void studying() {
		System.out.println("제빵사 빵공부 완료");
	}
	//월급받기
	void getPaid() {
		System.out.println("제빵사 월급 받기완료");
	}
}
