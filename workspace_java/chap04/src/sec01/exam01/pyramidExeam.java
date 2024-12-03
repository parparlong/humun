package sec01.exam01;

import java.util.Scanner;

public class pyramidExeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("몇줄출력할지 입력:");
//		int user20 = scan.nextInt();
//	
//		
//			for (int tree1 = 1 ; tree1 < user20 ; tree1++) {
//				for(int tree2 = user20; tree2 >= tree1; tree2--) {
//					System.out.print("_");
//				}
//				for(int tree3 = 1; tree3 <= tree1; tree3++) {
//					System.out.print("+");
//				}
//				for(int tree4 = 2; tree4 <= tree1 ;tree4++) {
//					System.out.print("+");	
//				}
//				for(int tree5 = user20; tree5 >= tree1; tree5--) {
//					System.out.print("_");
//				}System.out.println();
//
//			}
		
		
			
			
			
			
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
				
//				if(r == 1) {
//					System.out.println("____");
//				}else if(r == 3) {
//					System.out.println("___");
//				}else if(r == 6) {
//					System.out.println("__");
//				}else if(r == 10) {
//					System.out.println("_");
//				}
		
			
//			System.out.println();
//			System.out.println();
			
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
			
			

		
			// 8단계
			/*
			 
			 ____+____
			 ___+++___
			 __+++++__
			 _+++++++_
			 +++++++++
			 // 1 2 3 4 5  5 4 3 2 1 
			 */
//			for (int tree1 = 1 ; tree1 < 5 ; tree1++) {
//				for(int tree2 = 4; tree2 >= tree1; tree2--) {
//					System.out.print("_");
//				}
//				for(int tree3 = 1; tree3 <= tree1; tree3++) {
//					System.out.print("+");
//				}
//				for(int tree4 = 2; tree4 <= tree1 ;tree4++) {
//					System.out.print("+");	
//				}
//				for(int tree5 = 4; tree5 >= tree1; tree5--) {
//					System.out.print("_");
//				}System.out.println();
//			
//			
			//1.주사위 두개로 나올 수 있는 모든 조합 출력 
			//math함수 사용 
			for(int v = 1 ; v <=6; v++) {
				for	(b = 1 ; b <=6; b++) {
					
				}
			}
			
			//2.중복을 제거한 경우의 수 
			
			
		
			int x = -1;
			for	(; x < 5; ) {
				x++;
			}
		
	}

}
