package quiz_cafe_2025_02_17;

public class Barista extends Employee {
//바리스타
	@Override
	// 손님접대
	void entertainingGuests() {
		System.out.println("바리스타 손님 접대 완료");
	}

	// 공부하기
	void studying() {
		System.out.println("바리스타 커피공부 완료");
	}

	// 월급받기
	void getPaid() {
		System.out.println("바리스타 월급 받기 완료");
	}

	// 장부작성
	void bookkeeping() {
		System.out.println("바리스타 장부 작성중");
	}

	// 설겆이하기
	void dishwashing() {
		System.out.println("바리스타 설거지 하는중");
	}

}
