package sec01.exam01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForExam {

	private static String t2;

	public static void main(String[] args) {
		// TODO strat
		int sum = 0;
		
		//1씩 증가하는걸 5번 하고싶다
		
		sum = sum + 1;
		sum += 1;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println("sum :"+ sum);
	
		
		// 1+2+3+4+5
		//참고로 1~n까지의 합
		//n*(n+1) / 2
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : "+ sum);
		
		int i = 1;
		
		sum = 0;
		sum = sum + i; //1
		
		i++;
		sum = sum + i; //2

		i++;
		sum = sum + i; //3
		
		i++;
		sum = sum + i; //4
		i++;
		sum = sum + i; //4
		System.out.println("sum :"+sum);
		/* 반복문을 만드는 원리 
		 * 
		 * 1.반복 되는 것 찾기
		 * ctrl + c, v 했을때 바뀌지 않는거 
		 * 
		 * 2. 반복 되지 않는 것 찾기
		 * 	규칙(패턴)을 찾을 수 있으면 반복문으로 만들수 있음
		 * 	변수를 활용해서 더이상 바뀌지 않게 만들기 
		 * 
		 * 3.시작 조건
		 * 
		 * 4.종료 조건
		 * 
		 * for문 : 반복 횟수를 아는 경우 
		 * 
		 * while : 반복 횟수를 모르는 경우 
		 * 
		 */
		
		int sum2 = 0;
		for (int e = 1; e <= 5 ; e++) {
			sum2 = sum2 + e;	
		}
		System.out.println("sum2 : "+sum2);
		
		
		
		int sum3 = 0;
		// for 문안에 int 값을 넣으면 매번실행될때마다 초기화 및 결과값에 못씀
		for (int e = 1; e <= 5 ; e++) {
		//	System.out.println("e :"+e);
			sum3 = sum3 + e;	
		//	System.out.println("sum3 :"+sum3);
		}
		System.out.println("sum3 : "+sum3);
		
		/*
		 * 
		 * 
		 * 
		 */
		

		//1~100까지 더한값을 구하시오 
		for (int ii = 1; ii <= 10; ii++) {
			System.out.println(ii);
		}
			
		//시작값은 0으로 지정
		int sum4 = 0; 
		//for문 초기값1로 지정하고 100이될때까지 증감
		for (int z = 1; z <= 100; z++ ) {
			//결과값에 증가하는 값을 더해서 결과값으로 출력 증가하는걸 계속 더한다 
			sum4 += z;
			// System.out.println("1~100 합은:"+ sum4);
			
		}
		System.out.println("1~100 합은:"+ sum4);
		
		

		//깜짝 퀴즈
		
		
		for (int q2 = 10; q2 >= 1; q2--) {
			
			System.out.println("q2 :"+ q2);
		}
		
		
		//1~20까지 짝수만 출력
		//1~20까지 3의 배수만 출력하시오
		
		//짝수 구하기
		//20까지 증가 하고 t1이 20보다 작거나 같을떄가지t1증가
		//t1에서 /로 나눤숫자중 짝수만 출력 
		//t2에 t1을 t2로 나누면? 0=1/2
		for (int t1 = 2;t1 <= 20 ; t1 += 2) {
			
			System.out.println("짝수만"+t1 );
		}
		
		for (int t2 = 3;t2 <= 20 ; t2 += 3) {
					
			System.out.println("3의배수만만"+t2 );
		}
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		System.out.println("      " );
		//1~5까지 모두 출력 하면서 옆에 홀짝 출력
		//1:홀수 2:짝수
		
			
		//  1 3 5홀수 /2 4짝수 
		for (int  eee = 1 ; eee <= 4 ; eee += 2 ) {
		//eee을 /2로 나눴을때 몫이 0인게 짝수	  
		System.out.println("eee"+eee+"홀수");
		int e2 = eee + 1;
		System.out.println("eee"+e2+"짝수");
		}
		System.out.println("eee"+5+"홀수");
		
		
//		String ea = "홀수";
//		if(q3 % 2 == 0) {
//			ea = "짝수"
//		}
//		System.out.println(q3 + ": "+ ea);
		
		
		
		//1~20까지 홀수의 합
		//1 3 5 7 9 11 ~~
	
		int t5 = 0;
		
		for (int t4 = 1 ; t4 <= 20 ; t4 += 2) {
			System.out.println("홀수의 값 "+t4);
			t5 = t5 + t4;
		}
		System.out.println("홀수의 합"+ t5);
		
		
		
		//1~20까지 홀수의 개수
		//1 3 5 7 8 9  11 13 15 17 19
		int q5 = 0;
		
		for (int w4 = 1; w4 <= 20; w4++ ) {
			 if(w4 % 2 == 1) {
				 q5 = q5 + 1;
			 }
		}
		System.out.println("홀수의 개수 "+q5);	
		
		//1~10까지 옆으로 3개식 출력 
		//예    
		//   123
		//   456
		//   789
		//   10
		
//		System.out.println("   123");
//		System.out.println("   456");
//		System.out.println("   789");
//		System.out.println("   10");
		
		// 처음에 123시작하기전에 빈칸 생성 반복 ㄱ
		// 1. 포문시작 10까지 표기
		// 2. 만약에 나머지가 1이라면 줄시작 > 아니라면 숫자표기
		// 3. 나머지가1이 아니고 0이라면 한줄내림 = 3
		//
		//
		for(int iii=1;iii<=10;iii++){
            if(iii%3==1) {
                System.out.print("   "+iii);
            } else {
                System.out.print(iii);
            }
            if(iii%3==0){
                System.out.println();
            }
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//주말 공부 구구단 2단 
		//2 X 1 = 2
		//2 X 2 = 4
		
		System.out.println("2단");
		for (int num3 = 1;num3 <= 9;num3++) {
			int num2 = 2 * num3;
			System.out.println("2*"+num3+"="+num2 );
		}
		

		
		
		
	Scanner scan = new Scanner(System.in);
//		System.out.println("몇단을 출력할지 입력해주세요 예:2단");
//		String user = scan.nextLine();
		
		int gg2 =2;
		int gg3 =3;
		int gg4 =4;
		int gg5 =5;
		int gg6 =6;
		int gg7 =7;
		int gg8 =8;
		int gg9 =9;
		
//		if(user.equals("2단")) {
//			System.out.println("2단");
//			for (int ggg = 1;ggg <= 9;ggg++) {
//				int result = gg2 * ggg;
//				System.out.println(gg2 +"*"+ggg+"="+result );
//			}
//		}

		
//		System.out.println("n값 입력");
//		int user2 = scan.nextInt();
//		
//		int num5 = 0;
//		for (int num2 = 0 ;num2 <= user2 ;num2++  ) {
//			if(num2 % 2 == 0) {
//				num5 += user2;
//				
//			}
//		}System.out.println("짝수의합"+num5);
		
		
		//for문 몇단진지 n입력 n for문 사용 
		//for문 n과 * a입력할려면 a도 for문 사용 
		//
		
		//
		for(int a = 2; a <= 9 ; a++) {
			System.out.println(a+"단");
			for(int b = 2 ; b <= 9; b++ ) {
				System.out.println(a +"*"+b+"="+a*b );
			}
			}
		
		//한줄에 1단씩 출력
		for(int a = 2; a <= 9 ; a++) {
			System.out.println(a+"단");		
			for(int b = 1 ; b <= 9; b++ ) {
				System.out.print(a +"*"+b+"="+a*b+" " );
				if(b == 9) {
					System.out.println();
				}
			}
			}
		
		System.out.println("");
		System.out.println("");
		
		//2단 일반출력 3에서 
		//두세단씩 옆으로 출력 
		//2단   3단
		//2*1=2 3*1=3 
		//2*2=4 3*2=6
		//2*3=6 3*3=9
		//~~~
		//4단  5단
		for(int aa=2; aa<=9; aa+=2) {
			int bb = aa + 1;
			System.out.println(aa+"단\t\t"+bb+"단");
			for(int cc=1;cc<=9;cc++) {
				System.out.println
				(aa+"X"+cc+"="+(aa*cc)+"\t\t"+bb+"X"+cc+"="+(bb*cc));
			}
		}
	
		// 1단계
		/*
		 
		 +++++
		 
		 */
		for(int i2 = 1; i2 <=5; i2++) {
			System.out.print("+");
		}
		System.out.println();
		System.out.println();
		
		// 2단계
		/*
		 
		 +++++
		 +++++
		 +++++
		 
		 */
		for(int i2 = 1; i2 <=3; i2++) {
			System.out.print("+");		
			for(int i3 = 1; i3 <=4; i3++) {
				System.out.print("+");
			if(i3 == 4){
				System.out.println();
			}
			}
			}
		System.out.println();
		System.out.println();
		// 3단계
		/*
		 
		 + + + + +
		 
		 */
		for(int w = 1 ; w <= 5; w++) {
			System.out.print("+");
			System.out.print(".");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		// 4단계
		/*
		 
		 +	//1
		 ++
		 +++
		 ++++
		 +++++
		 
		 */
		//만약 
		for(int r = 1 ; r <= 5; r++) {
			for(int t = 1; t <= r; t++) {
				System.out.print("+");	
			}
			System.out.println();
		
		}
		System.out.println();
		System.out.println();
		
	
		// 5단계
		/*
		 
		 +____
		 ++___
		 +++__
		 ++++_
		 +++++
		 
		 */

		for(int r = 1 ; r <= 5; r++) {
			for(int t = 1; t <= r; t++) {
				System.out.print("+");	
			}
			for(int y =4; y>=r ;y--) {
					System.out.print("_");	
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
			
//			if(r == 1) {
//				System.out.println("____");
//			}else if(r == 3) {
//				System.out.println("___");
//			}else if(r == 6) {
//				System.out.println("__");
//			}else if(r == 10) {
//				System.out.println("_");
//			}
	
		
//		System.out.println();
//		System.out.println();
		
		// 6단계
		/*
		 
		 ____+
		 ___++
		 __+++
		 _++++
		 +++++
		 
		 */
		
		for(int r = 1 ; r <= 5 ; r++) { // 1 2 3 4 5
			for(int t = 4; t >= r; t--) { // 5 4 3 2 1
				System.out.print("_");	
			}
			for(int y=1; y<=r ;y++) {  // 1 2 3 4 5 
					System.out.print("+");	
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println();
		
		
//		for(int r = 1 ; r <= 10; r++) {
//			System.out.print("_");
//			if(r == 4) {
//				System.out.print("+");
//				System.out.println();
//			}else if(r == 7) {
//				System.out.println("++");
//				System.out.println();
//			}else if(r == 9) {
//				System.out.println("++++");
//				System.out.println();
//			}else if(r == 10) {
//				System.out.println("++++");
//			}
//	}
//		System.out.println("+++++");
		
	// 7단계
		/*
		 
		 ____+  
		 ___+++ 
		 __+++++ 
		 _+++++++ 
		 +++++++++
		 
		 */
		for(int r = 1 ; r <= 5 ; r++) { // 1 2 3 4 5
			for(int t = 4; t >= r; t--) { // 5 4 3 2 1
				System.out.print("_");	
			}
			for(int y = 1; y<=r ;y++) {  // 1 2 3 4 5 
					System.out.print("+");	
			}
			for(int q = 2 ; q <= r; q++) {
					System.out.print("+");	
				}			
				System.out.println();
			}
			
		
		
		
		
		System.out.println();
		System.out.println();
		
		
//		for(int r = 1 ; r <= 10; r++) {
//			System.out.print("_");
//			if(r == 4) {
//				System.out.print("+");
//				System.out.println();
//			}else if(r == 7) {
//				System.out.print("+++");
//				System.out.println();
//			}else if(r == 9) {
//				System.out.print("+++++");
//				System.out.println();
//			}else if(r == 10) {
//				System.out.print("+++++++");
//				System.out.println();
//			}
//	}
//		System.out.println("+++++++++");
//		System.out.println("");
//		System.out.println("");
//		
		// 8단계
		/*
		 
		 ____+____
		 ___+++___
		 __+++++__
		 _+++++++_
		 +++++++++
		 // 1 2 3 4 5  5 4 3 2 1 
		 */
//		for (int tree1 = 1 ; tree1 < 5 ; tree1++) {
//			for(int tree2 = 4; tree2 >= tree1; tree2--) {
//				System.out.print("_");
//			}
//			for(int tree3 = 1; tree3 <= tree1; tree3++) {
//				System.out.print("+");
//			}
//			for(int tree4 = 2; tree4 <= tree1 ;tree4++) {
//				System.out.print("+");	
//			}
//			for(int tree5 = 4; tree5 >= tree1; tree5--) {
//				System.out.print("_");
//			}System.out.println();
//		
//		
//		}
		
		
		
		
		
//		for(int r = 1 ; r <= 10; r++) {
//			System.out.print("_");
//			if(r == 4) {
//				System.out.print("+____");
//				System.out.println();
//			}else if(r == 7) {
//				System.out.print("+++___");
//				System.out.println();
//			}else if(r == 9) {
//				System.out.print("+++++__");
//				System.out.println();
//			}else if(r == 10) {
//				System.out.print("+++++++_");
//				System.out.println();
//			}
//	}
//		System.out.print("+++++++++");		
//		System.out.println();
//		
		
		// 9단계
		// 입력 받은 만큼 출력
		System.out.println("몇줄출력할지 입력:");
		int user20 = scan.nextInt();
	
		
			for (int tree1 = 1 ; tree1 < user20 ; tree1++) {
				for(int tree2 = user20; tree2 >= tree1; tree2--) {
					System.out.print("_");
				}
				for(int tree3 = 1; tree3 <= tree1; tree3++) {
					System.out.print("+");
				}
				for(int tree4 = 2; tree4 <= tree1 ;tree4++) {
					System.out.print("+");	
				}
				for(int tree5 = user20; tree5 >= tree1; tree5--) {
					System.out.print("_");
				}System.out.println();
				if(tree1 == user20) {
					break;
				}
			}
		
			
	
	
	
		/*화면 보시묜 1부터 시작해서 5까지 가자나요
		 1
		 22
		 333
		 4444
		 55555
		*/
		// 세로로 1 2 3 4 5 나오잔아요여기서 
		//제가 이문제를 못봣어요 3다음에 바로 4풀어서
//		for(int sum1=1;sum1<=5;sum1++) { //여기가 처음에 1이면
//			for (int sum10 = 1; sum10 <= sum1; sum10++) {
//				System.out.print(sum1); 
//				//System.out.print(sum10); 
//			}System.out.println();							
//		}
//		System.out.println();
//		System.out.println();
 /*이것도 설명해드리용?
  * sum1=1 
  *두번째 줄은 2번도니까 
  * sum1 =2 sum1 =2번도니까 21 22 
  */
	
	

	/*++
	 *+++
	 *++++
	 *+++++
	 *++++++
	 */
		
	
	
	}
}
