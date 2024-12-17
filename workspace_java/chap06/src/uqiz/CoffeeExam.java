package uqiz;

import java.util.Scanner;

public class CoffeeExam {
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Scanner scan = new Scanner(System.in);
		
//		coffee.fir(); // 선택메뉴 
		
//		coffee.pick1(3); // 카테고리 선택
//		coffee.dcaf(); //dcaf,caf,ade 3개중하나 메뉴선택
//		coffee.caf(); 
//		coffee.ade(); 
//		coffee.menupick(); //메뉴확인
		
//	if(in == 1) {
//		coffee.pick1(1);
//		int in2 = scan.nextInt();
//		if(in2 == 1) {
//			coffee.dcaf(1);
//		}else if (in2 == 2) {
//			coffee.dcaf(2);
//		}else if (in2 == 3) {
//			coffee.fir();
//		}
//	}else if(in ==2 ) {
//		coffee.pick1(2);
//		int in2 = scan.nextInt();
//		if(in2 == 1) {
//			coffee.caf(1);
//		}else if (in2 == 2) {
//			coffee.caf(2);
//		}else if (in2 == 3) {
//			coffee.fir();
//		}
//	
//	}else if(in ==3 ) {
//		coffee.pick1(3);
//		int in2 = scan.nextInt();
//		if(in2 == 1) {
//			coffee.ade(1);
//		}else if (in2 == 2) {
//			coffee.ade(2);
//		}else if (in2 == 3) {
//			coffee.fir();
//		}
//	}else if(in == 4 ) {
//		coffee.pick1(4);
//	}
		
		
		
	
//		coffee.fir();
//		int in = scan.nextInt();
	do {
		coffee.fir();
		int in = scan.nextInt();
		if(in == 1) {
			coffee.pick1(1);
			int in2 = scan.nextInt();
			if(in2 == 1) {
				coffee.dcaf(1);
				System.out.println("");
				continue;
			}else if (in2 == 2) {
				coffee.dcaf(2);
				System.out.println("");
				continue;
			}else if (in2 == 3) {
				coffee.fir();
				continue;
			}
			
		}else if(in ==2 ) {
			coffee.pick1(2);
			int in2 = scan.nextInt();
			if(in2 == 1) {
				coffee.caf(1);
				System.out.println("");
				continue;
			}else if (in2 == 2) {
				coffee.caf(2);
				System.out.println("");
				continue;
			}else if (in2 == 3) {
				coffee.fir();
				continue;
			}

		}else if(in ==3 ) {
			coffee.pick1(3);
			int in2 = scan.nextInt();
			if(in2 == 1) {
				coffee.ade(1);
				System.out.println("");
				continue;
			}else if (in2 == 2) {
				coffee.ade(2);
				System.out.println("");
				continue;
			}else if (in2 == 3) {
				coffee.fir();
				System.out.println("");
				continue;
			}

		}else if(in == 4 ) {
			coffee.pick1(4);
			break;
		}else if(in == 5) {
			coffee.pick1(5);
			int in3 = scan.nextInt();
			if(coffee.menu == in3) {
				coffee.menu -= in3;
				System.out.println("결제가 완료되었습니다.");
				continue;
			}else {
				System.out.println("금액이 다릅니다 다시 결제해주세요.");
				continue;
			}
		}
	}while(true);
	
	
	
	}
	
}
