package quiz_cafe_2025_02_17;

public class Welfare {
//복지
	void salaryCycle(Employee emp) {
		
		if(emp instanceof Barista ) {
			Barista barista = (Barista)emp;
			barista.getPaid();	
		}else if(emp instanceof Baker) {
			Baker baker = (Baker)emp;
			baker.getPaid();	
		}else if(emp instanceof ShopAssistant) {
			ShopAssistant shopAssistant = (ShopAssistant)emp;
			shopAssistant.getPaid();	
		}
	}

	void study(Employee emp) {
		System.out.println("--직원 공부시키는중--");
		if(emp instanceof Barista ) {
			Barista barista = (Barista)emp;
			barista.studying();	
		}else if(emp instanceof Baker) {
			Baker baker = (Baker)emp;
			baker.studying();	
		}else if(emp instanceof ShopAssistant) {
			ShopAssistant shopAssistant = (ShopAssistant)emp;
			shopAssistant.studying();	
		}
	}
	
	void entertainingGuests(Employee emp) {
		System.out.println("--직원 접대 시키는중--");
		if(emp instanceof Barista ) {
			Barista barista = (Barista)emp;
			barista.entertainingGuests();	
		}else if(emp instanceof Baker) {
			Baker baker = (Baker)emp;
			baker.entertainingGuests();	
		}else if(emp instanceof ShopAssistant) {
			ShopAssistant shopAssistant = (ShopAssistant)emp;
			shopAssistant.entertainingGuests();	
		}
	}
	
}
