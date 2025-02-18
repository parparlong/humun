package quiz_cafe_2025_02_17;

public class CafeExam {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Welfare welfare = new Welfare();
		Barista barista = new Barista();
		Baker baker = new Baker();
		ShopAssistant shopAssistant= new ShopAssistant();

		// 복지 직원 공부시키기 월급주기
		System.out.println("----복지 직원월급주기----");
		welfare.salaryCycle(barista);
		welfare.salaryCycle(baker);
		welfare.salaryCycle(shopAssistant);
		System.out.println("----복지 직원공부시키기----");
		welfare.study(barista);
		welfare.study(baker);
		welfare.study(shopAssistant);
		System.out.println("----복지 접대시키기----");
		welfare.entertainingGuests(barista);
		welfare.entertainingGuests(baker);
		welfare.entertainingGuests(shopAssistant);
		System.out.println("---바리스타 장작,설겆이----");
		barista.bookkeeping();
		barista.dishwashing();
		System.out.println("---점원 일정산,매장관리----");
		shopAssistant.dailySettlement();
		shopAssistant.storeManagement();
	}

}
