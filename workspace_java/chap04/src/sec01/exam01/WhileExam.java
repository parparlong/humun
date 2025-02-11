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
	
//		System.out.println("硫붾돱瑜� 怨좊Ⅴ�꽭�슂");
//		System.out.println("1.而ㅽ뵾, 2.�솉李�, 0.醫낅즺");
//		Scanner scan = new Scanner(System.in);
//		int menu =scan.nextInt();
//		if(menu == 1) {
//			System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
//		} else if (menu == 2) {
//			System.out.println("�솉李� �뱶由닿쾶�슂");
//		} else if (menu == 3) {
//			System.out.println("�떎�쓬�뿉 �삉 �삤�꽭�슂");
//		} else {
//			System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//		}
//		
//		
//		
//		if(menu != 0) {
//			if(menu == 1) {
//				System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
//			} else if (menu == 2) {
//				System.out.println("�솉李� �뱶由닿쾶�슂");
//			} else {
//				System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//				menu =scan.nextInt();
//			}
//			menu =scan.nextInt();
//			if(menu != 0) {
//				if(menu == 1) {
//					System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
//				} else if (menu == 2) {
//					System.out.println("�솉李� �뱶由닿쾶�슂");
//				} else {
//					System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
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
//				System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
//			} else if (menu == 2) {
//				System.out.println("�솉李� �뱶由닿쾶�슂");
//			} else {
//				System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//			}
//			System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//			System.out.println("1.而ㅽ뵾, 2.�솉李�, 0.醫낅즺");
//			menu =scan.nextInt();
//		}
//		System.out.println("�떎�쓬�뿉 �삉 �삤�꽭�슂");
//	
	
		// 蹂댄넻 紐뉖쾲 諛섎났�븷吏� 紐⑤�쇰븣 while 
		// 蹂댄넻 紐뉖쾲 諛섎났�븷吏� �븣�븣 for
		
		
		
//		do {
//			System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//			System.out.println("1.而ㅽ뵾, 2.�솉李�, 0.醫낅즺");
//			menu =scan.nextInt();
//			if(menu == 1) {
//				System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
//			} else if (menu == 2) {
//				System.out.println("�솉李� �뱶由닿쾶�슂");
////			} else {
////				System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
////			}
//		}
//		
//		}while(menu != 0);
//			System.out.println("�떎�쓬�뿉 �삉 �삤�꽭�슂");
//	
		
		String m = "";
		do {
			System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
			System.out.println("1.而ㅽ뵾, 2.�솉李�, x.醫낅즺");
			 m =scan.nextLine();
			
			if(m.equals("1")) {
				System.out.println("而ㅽ뵾 �뱶由닿쾶�슂");
			} else if (m.equals("2")) {
				System.out.println("�솉李� �뱶由닿쾶�슂");
//			} else {
//				System.out.println("硫붾돱�뿉�꽌 怨⑤씪二쇱꽭�슂");
//			}
		}
		
		}while(!m.equals("x"));
			System.out.println("�떎�쓬�뿉 �삉 �삤�꽭�슂");
	
		
		
	
	}

}
