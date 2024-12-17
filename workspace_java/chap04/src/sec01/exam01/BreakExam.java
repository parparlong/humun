package sec01.exam01;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num2 = 0;
//		while(true) {
//			int num = (int) (Math.random()*6) + 1;
//			
//			System.out.println(num);
//			if(num == 6) {
//				break;
//			}
//			num2 += 1 ;	
//		}
//		System.out.println("프로그램 종료");
//		System.out.println("총:"+num2+"번 돌았습니다");
//		
//		for(int i=1;i<10;i +=2) {
//			System.out.println(i);
//			if(i >= 5) {
//				break; //혹시 몰라서
//			}
//		}
//		for(int i = 0; i <5; i ++) {
//			System.out.println("i : "+i);
//			for(int j = 0; j <3; j++) {
//			
//				if(j >= 2) {
//				break;
//			}
//			System.out.println("j : "+j);
//			}
//		System.out.println();
//		}
		
//		boolean isStop = false;
//		for(int i = 0; i <5; i ++) {
//			System.out.println("i : "+i);
//			for(int j = 0; j <3; j++) {
//				if(j >= 2) {
//					isStop = true;
//					break;
//				}
//			System.out.println("j : "+j);
//			}
//			if(isStop) {
//				break;
//			}
//		System.out.println();
//		}
//		
//		for(int i=1; i<=10; i++) {
//			if(i % 2 == 0) {		//짝수
//				System.out.println(i);
//			}
//			
//		}
//		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {  //홀수
				continue;
				
			}
			System.out.println(i);
		}
		
		/*
		 * 
		 * 
		 *1.예금 
		 * 예금액이 음수면 불가
		 * 
		 * 2.출금
		 * 출금액이 음수면 불가
		 * 잔고보다 큰금액 불가
		 */
	
	}

}
