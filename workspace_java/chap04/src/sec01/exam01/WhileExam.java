package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
	
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1.커피, 2.홍차, 0.종료");
//		Scanner scan = new Scanner(System.in);
//		int menu =scan.nextInt();
//		if(menu == 1) {
//			System.out.println("커피 드릴게요");
//		} else if (menu == 2) {
//			System.out.println("홍차 드릴게요");
//		} else if (menu == 3) {
//			System.out.println("다음에 또 오세요");
//		} else {
//			System.out.println("메뉴에서 골라주세요");
//		}
//		
//		
//		
//		if(menu != 0) {
//			if(menu == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu == 2) {
//				System.out.println("홍차 드릴게요");
//			} else {
//				System.out.println("메뉴에서 골라주세요");
//				menu =scan.nextInt();
//			}
//			menu =scan.nextInt();
//			if(menu != 0) {
//				if(menu == 1) {
//					System.out.println("커피 드릴게요");
//				} else if (menu == 2) {
//					System.out.println("홍차 드릴게요");
//				} else {
//					System.out.println("메뉴에서 골라주세요");
//					//menu =scan.nextInt();
//				}
//		
//		
//		}
//		}
	
//		Scanner scan = new Scanner(System.in);
//		int menu =scan.nextInt();
//		for(;menu != 0;){
//		while (menu != 0) {
//			if(menu == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu == 2) {
//				System.out.println("홍차 드릴게요");
//			} else {
//				System.out.println("메뉴에서 골라주세요");
//			}
//			System.out.println("메뉴에서 골라주세요");
//			System.out.println("1.커피, 2.홍차, 0.종료");
//			menu =scan.nextInt();
//		}
//		System.out.println("다음에 또 오세요");
//	
	
		// 보통 몇번 반복할지 모를때 while 
		// 보통 몇번 반복할지 알때 for
		
		
		
//		do {
//			System.out.println("메뉴에서 골라주세요");
//			System.out.println("1.커피, 2.홍차, 0.종료");
//			menu =scan.nextInt();
//			if(menu == 1) {
//				System.out.println("커피 드릴게요");
//			} else if (menu == 2) {
//				System.out.println("홍차 드릴게요");
////			} else {
////				System.out.println("메뉴에서 골라주세요");
////			}
//		}
//		
//		}while(menu != 0);
//			System.out.println("다음에 또 오세요");
//	
		
		String m = "";
		do {
			System.out.println("메뉴에서 골라주세요");
			System.out.println("1.커피, 2.홍차, x.종료");
			m =scan.nextLine();
			
			if(m.equals("1")) {
				System.out.println("커피 드릴게요");
			} else if (m.equals("2")) {
				System.out.println("홍차 드릴게요");
//			} else {
//				System.out.println("메뉴에서 골라주세요");
//			}
		}
		
		}while(!m.equals("x"));
			System.out.println("다음에 또 오세요");
	
		
		
	
	}

}
