package uqiz;


public class Coffee {

	//커피종류? 디카페인,커피,차 카테고리

	
	//디카페인 : 디카페인 아메리카노, 디카페인 라떼
	//커피 : 아메리카노, 라떼,
	//에이드: 아이스티 ,홍차
	
	//가격 : 디카페인아메리카노:3000, 디카페인 라뗴:4500
	//아메리카노 2500, 라떼 4500, 아이스티5000, 홍차 3000
	// 선택한내용 확인가능하게 출력,
	// 처음단계로 돌아갈수있는 선택지넣고
	// 처음단계에서 종료할수 있게 넣고 
	int da = 3000;
	int dr = 4500;
	int a = 2500;
	int r = 4500;
	int at = 5000;
	int h = 3000;
	//처음 화면 출력
	void fir() {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("-----------------------------------");
		System.out.println("1.디카페인|2.커피|3.에이드|4.종료|5.결제");
		System.out.println("-----------------------------------");
	}
	//입력받는 메뉴 저장
	int menu = 0;
	
	
	//선택에 따라 화면출력
	//구매하면 감사합니다 출력 후 처음화면으로 
	void pick1(int a) {
		if(a == 1) {
			System.out.print("1.디카페인 아메리카노 : 3000원   ");
			System.out.print("2.디카페인 라떼 : 4500원  ");
			System.out.println("3. 이전");
		}else if(a == 2) {
			System.out.print("1.아메리카노 : 2500원   ");
			System.out.print("2.라떼 : 4500원  ");
			System.out.println("3. 이전");
		}else if(a == 3) {
			System.out.print("1.아이스티 : 5000원   ");
			System.out.print("2.홍차 : 3000원  ");
			System.out.println("3. 이전");
		}else if(a == 4) {
			System.out.println("시스템을 종료합니다");
		}else if(a==5) {
			System.out.println(menu+"결제부탁드립니다");
		}
	}
		//메뉴까지 떴음 
		//뭘구메할지 눌러야됨 누르면 결제까지
		void dcaf(int a) {
			if(a == 1) {
				this.menu += this.da;
				System.out.println("디카페인 아메리카노 선택하셨습다.");	
			
				
			}else if (a == 2) {
				this.menu += this.dr;
				System.out.println("디카페인 라떼 선택하셨습다.");	
				
				
			}
		}

		void caf(int a) {
			if(a == 1) {
				this.menu += this.a;
				System.out.println("아메리카노 선택하셨습다.");	
				
				
			}else if (a == 2) {
				this.menu += this.r;
				System.out.println("라떼 선택하셨습다.");	
				
			}
			
	
		}
		
		void ade(int a) {
			if(a == 1) {
				this.menu += this.at;
				System.out.println("아이스티 선택하셨습다.");	
				
			}else if (a == 2) {
				this.menu += this.h;
				System.out.println("홍차 라떼 선택하셨습다.");	
				
			}
			
	
		}


			













}
