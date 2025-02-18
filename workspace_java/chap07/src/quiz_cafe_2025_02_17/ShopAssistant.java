package quiz_cafe_2025_02_17;

public class ShopAssistant extends Employee{
//점원
	@Override
	//손님접대
	void entertainingGuests() {
		System.out.println("점원 손님접대 완료");
	}
	//공부하기
	void studying() {
		System.out.println("점원 미래를위한 공부 완료");
	}
	//월급받기
	void getPaid() {
		System.out.println("점원 월급받기 완료");
	}
	//일일 정산
	void dailySettlement() {
		System.out.println("점원 일일정산중");
	}
	
	//매장관리
	void storeManagement() {
		System.out.println("점원 매장관리 하는중 ");
	}
	
}
