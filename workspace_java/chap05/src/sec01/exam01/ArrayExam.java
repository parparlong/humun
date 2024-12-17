package sec01.exam01;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayExam {

	private static int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선언 방법
		int[] score;
//		int [] score;
		int score2[];
		
		//변수 앞이 무조건 타입이라고 읽는 경우
		//score변수는 int로 구성된 배열이다"
		
		//배열은 참조타입
		score = null;
		
		
		
		/*
		 * 배일을 생성할때 크기를 알려줘야 합니다.
		 * 
		 * 첫번째 [ ] (int[ ]) :int로 이루어진 배열이다 
		 * 두번쨰 [ ]: (new int[3] ) : 배열의 크기, 즉 한번에 만들
		 * **변수의 개수** 타입의 크기만큼 연달아서 메모리의 크기만큼 할당 첫번째 
		 * 주소를 변수에 저장 index 0 부터 시작한다 세번째 [ ]
		 * (intArray[0]) : 만들어진 변수 중에서 첫번째 변수를 뜻함
		 */
		
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
//		intArray[2] = 70;
		System.out.println("intArray[0] :"+intArray[0]);
		// 기본값은 0, false, null로 초기화된다
		System.out.println("intArray[2] :"+intArray[2]);

//  java.lang.ArrayIndexOutOfBoundsException
//		: Index 3 out of bounds for length 3 에러발생 
//		System.out.println("intArray[3] :"+intArray[3]);
		//힙영역에서 
		
		
		// 선언하는 두번쨰 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] intArray2 = new int[] {90,60,70};
		int[] intArray2_1 = new int[] {90,(int)Math.random(),70};
		
		int[] intArray3 = null;
		intArray3 = new int[] {90,(int)Math.random(),70};	
		
		//배열을 선언하는 세번째 방법 
		//new int[]에 해당하는걸 생략가능
		//선언과 동시에 초기화 하는 경우에만 사용 가능
		int[] intArray4 =  {90,(int)Math.random(),70};
		
		//렝스를 사용하여 배열에 들어가있는 변수 크기 개수 확인
		System.out.println("intArray4의 길이:"+intArray4.length);
		
		// 배열을 출력하면 해쉬값에의해 변형된값 출력 
		// I:int @:배열 9e89d68:intArray4 뜻
		System.out.println("intArray4 :"+intArray4);
		
		String[] sArr = new String[14];
		
		sArr[0] = "이름1";
		sArr[1] = "이름2";
				
		int k = 1;
		
		k++;
		sArr[k] = "이름"+ (k+1);
		
		for(int i = 0; i<sArr.length; i++) {
		
		
			sArr[i] = "이름" + (i+1);
		}
		
		for(int i = 0; i<sArr.length; i++) {
			
			System.out.println(sArr[i]);
			
		}
		
		//깜짝퀴즈
		//1~10까지 배열에 넣고 
		//배열의 총 합 출력
		//배열의 평균값 출력 
		int[] num = new int[10];
		
		double num2 = 0;
		
		for(int i2 = 0; i2<num.length; i2++) {
			
			
			num[i2] = i2 + 1;
			num2 = num2 + num[i2];
		}
		double num3 = num2 / num.length; 
		System.out.println("배열의 총 합 출 력 " + num2);
		System.out.println("배열의 평균값 "+ num3);
		
		
		
//	간단퀴즈
//		1~10까지 순서대로 저장된 배열을
//	10부터 1까지 거꾸로 출력
	
		
		
		
		
		
		/*[3,4,7,8,1,4,6]
		 * 
		 * 문제1. 홀수의 개수 구하기
		 * 문제2. 4보다 큰 수의 개수 구하기
		 * 문제3. 최대값 구하기
		 *  조금 어려운 문제 4. 두번째 큰 수 구하기
		 */
//		int[] a= {1,2,3,4}
//		int[] n = new int[a.length]
//		b[0] = a[0];
		/*
		 * 
		 * 문제5. 배열을 하나씩 뒤로 밀기
		 * 		5-1 : 0으로채우기
		 * 		5-2 : 첫자리에 마지막 것 넣기
		 * 문제6. 임시 비밀번호 8자리 만들기
		 * 		6-1 : 숫자로 렌덤써서
		 * 		6-2 : 소문자로
		 * 		*6-3 : 숫자 2개 이상, 대/소문자 조합 
		 * 문제7.예약 
		 * 		자리가 10개 있는 소극장 예약 시스템
		 */

		System.out.println("---------------");
		int[] num10 = new int[] {0,1,2,3,4};
		
		//앞에서부터 하나씩
		//홀수인지 검사
		//홀수 일때 숫자를 센다 >>
		//지금까지 센 숫자를 변수에 저장 해놓겠다
		
		int total=0 ;
		for(int i=0 ;i < num10.length; i++) {
			if(num10[i] % 2 == 1) {
				System.out.print(num10[i]+",");	
				total += 1;
			}
		}
		System.out.println("홀수의계수:"+total);
		

		//4보다 큰수의 계수 구하기
		//앞에서부터 하나씩
		//4보다 큰지 검사
		//4보다 클때 숫자를 센다
		//지금까지 센 숫자를 변수에 저장 해놓겠다
		for(int i=0 ;i < num10.length; i++) {
			if(num10[i] > 4) {
				total += 1;
			}
		}
		System.out.println("4보다큰게수:"+total);
		
		//최대값구하기
		
		System.out.println("------------------------");
		System.out.println("최대값구하기");
		//방법1
//		for(int i=0 ;i < num10.length; i++) {
//			System.out.print(num10[i]+",");		
//		}
//		Arrays.sort(num10);
//		System.out.println("최대값"+num10[num10.length-1]);
		
		//최대값을 출력할려면 변수필요 == 상단에 변수지정
		//초기값은 배열 첫째 값으로 저장
		//초기값이 제일크면 바로 출력됨
		//최대값을 저장할려면 출력값 저장 
		//if문을 통해 저장된 값보다 크면 저장
		int min = Integer.MIN_VALUE; // -2147483
		for(int i=0 ;i < num10.length; i++) {
			System.out.print(num10[i]+",");		
			if(num10[i] > min ) {
				min = num10[i];
				
			}
		}
		System.out.println("최대값:"+min);
		
		
		//두번째 큰수 구하기
		System.out.println("-------------");
		System.out.println("두번째 큰수 구하기");
		int max = 0;
		int max2 = 0;
		for(int i=0 ;i < num10.length; i++) {
			System.out.print(num10[i]+",");		
			if(num10[i] > max) {
				max2 = max;
				max = num10[i];	
				
			}else if(num10[i] > max2 && num10[i] != max) {
				max2 = num10[i];
			}
		}
		System.out.println("두번째 큰수:"+max2);
		
		
		
		
		System.out.println();
		System.out.println("-------------");
		System.out.println("배열을 하나씩 뒤로 밀기");
		//하나식 민다는것은 맨뒤에있는 숫자가 앞으로		
		//01234
		//12345678
		//81234567 > 0에있는걸 뽑아두고
		//7번을 0번에 넣는다
        int temp = num10[0]; //0저장
        int las = num10[num10.length-1]; //4를 las저장
//        System.out.println(temp9);
//        System.out.println(las);

        for(int i = num10.length-2; i >0;i--) { // 3선택
            num10[i+1] = num10[i]; //배열 3번에서 4번에 대입함
        }

        num10[1] = temp ;  // 1자리에 0넣음
        num10[0] = las ; // 0자리에 4넣음
        for(int i =0; i < num10.length; i++) {
            System.out.print(num10[i]);

        }System.out.println();
		
        //두번째 방법
//        int temp5 = num10[0]; // [1] {0,1,2,3,4}
//        num10[0] = 0; // [1] {0,1,2,3,4}
//        
//		int temp6 = num10[1]; //[1][2] {0,2,3,4,5}
//		num10[1] = temp5;  //[1][2] {0,2,3,4,5}
		//임시변수를 두개나 써야해서
		//못할건 아닌것으로 보이나 다른 방법 먼저 생각해보겠다.
		
		//앞에서부터 swap하니까 왼쪽으로 밀리는 결과
		//뒤에서부터 swap하면 오른쪽으로 밀리네..


		
	
		System.out.println();
		System.out.println("-------------");
		System.out.println("임시비밀번호8자리");
				
	
		int[] num11 = new int[8];
		
		
		for(int i = 0; i < num11.length; i++) {
		int dice = (int)(Math.random()*9) +1 ;
			System.out.print(dice+",");
		}
			
		System.out.println();
		System.out.println("-------------");
		System.out.println("임시비밀번호8자리 소문자로");
		
		char[] b0 = new char[8];
		for(int i =0; i <b0.length; i++) {
			double	random = Math.random();
			b0[i] = (char)(random * 26 + 'a');
			
		}
		System.out.println(b0);
		
		System.out.println();
		System.out.println("-------------");
		System.out.println("숫자 2개 이상, 대/소문자 조합 ");
	
		//숫자 dice 문자 random
		//8글라할러면 
		//01234
		//12345
		// 2배수 2 4 6 3개3배수 3 6 2개
//		char[] b0 = new char[8];
		
//		for(int i =0; i <b0.length; i++) {
//	
//			if(b0.length == b0.length-2 ) {
//				double	random = Math.random();
//				int random2 = (int)random ;
//				b0[i] = (char)(random2 * 9 + '1');
//				
//			}else if(b0.lengt == ) {
//				double	random = Math.random();
//				int random2 = (int)random ;
//				b0[i] = (char)(random2 * 26 + 'A');
//				
//			}
//			else {
//				double	random = Math.random();
//				b0[i] = (char)(random * 26 + 'a');
//				
//		
//			}System.out.print(b0[i]);
//		}
		
				
				
				
//			int dice = (int)(Math.random()*9) +1 ;
//			double	random = Math.random();
//			b0[i] = (char)(random * 26 + 'A');
//			b1[i] = (char)(random * 26 + 'a');
//				if(b0[]) {
//					
//				}
//				
//			}
		
		
		
		System.out.println("-------------");
	
	/*
		 * 문제7. 예약
		 * 자리가 10개 있는 소극장 예약 시스템
		 * 자리 번호는 1~10번까지 번호의 자리가 있음
		 * 만약1 : 예약이 가능하면 "n번자리 예약 했습니다"
		 * 만약2 : 예약이 불가능하다면 "이미 예약 되어있습니다"
		 * 메뉴 : "1.예약, 2.모든좌석현황, 3.잔여좌석, 4. 종료"
	*/
		//012345678 9
		//123456789 10
		Scanner scan = new Scanner(System.in);
		int[] musium = new int[10];
		System.out.println("-------------");
		System.out.println("1.예약,2모든좌석현황,3.잔여좌석,4.종료");
		System.out.println("-------------");
		int menu = scan.nextInt();
		
		if(menu == 1) {
			System.out.println("1~10까지 중에 예약자리를 입력하세요");
			int rsv = scan.nextInt();
			//1~10까지 잘 넣었는지 방어
			if(musium[rsv -1]==1) {
				System.out.println("예약 불가");
			}else {
				musium[rsv -1]=1;
				System.out.println("자리번호 "+ rsv +"예약 성공");
			}
		}else if(menu == 2) {
			for(int i=0; i < musium.length; i++) {
				
			}
			
			
		}
		
		
		
		System.out.println("-----------------");
		
		int[] class1 = new int[20];
		int[] class2 = new int[20];
		int[] class3 = new int[20];
		int[] class4 = new int[20];
		//행 4개 열 20개 
		int[][] 천안 = new int[4][20];
		//"천안:"+천안 출력시 메모리주소를 가져옴
		//다차원배열은 메모리 할당을 ((4*20)*4)
		//4byte씩 20개를 4번 할당함
		System.out.println("천안:"+천안);
		System.out.println("천안[0]:"+천안[0]);
		System.out.println("천안[0][0]:"+천안[0][0]);
		
		//서로 다른 크기를 가지는 2차원 배열
		int[][] test = {
						{1,2,3},
						{1,2,3,4},
						{78}
					};
		System.out.println("test[1][3]:"+test[1][3]);
		
		System.out.println("test[0].length:"+test[0].length);
		System.out.println("test[1].length:"+test[1].length);
		//렝쓰의경우 길이를 세기때문에 1부터시작
		System.out.println("test[2]"+test[2]);
	
		int[][] 수원 = new int[4][20];
		int[][] 서울 = new int[4][20];
		int[][] [] 휴먼 = new int[3][4][20];
		System.out.println("-------");
		//가상의 달력
		// 12개월 이고 모든 달은 30일까지
		// 한달은 1~30
		// 모든 날짜 채워 넣기
		// 따로 모든(또는 11월) 출력하기
		
		//1달은 30 일 1개 , 1년 2개 
//		int[][] dal = new int[12][30];
//		//12월부터 생성 
//		for	(int i=0 ; i < dal.length-1 ; i++) {
//			dal[i] = i;
//			for	(int k=0 ;< dal[i].length-1; k++)) {
//				dal[i][k] = k;
//			}
//			System.out.println(dal[i][k]);
//		}
		
//		int[] dal = new int[31];
//		//1월부터 생성 
//		//30일생성
//		for	(int i=1 ; i < dal.length ; i++) {
//			dal[i] = i;
//			
//			System.out.println(dal[i]);
//		}
		
//		int day1 = 1;
//		int day2 = 2;
//		
//		int[] month1 = new int[30];
//		month1[0] = 1;
//		month1[1] = 2;
//		
//		for(int i=0; i<month1.length; i++) {
//			month1[i] = i+1;
//			
//			
//		}
//		for(int i=0; i<month1.length; i++) {
//			System.out.println(month1[i]+",");
//			
//			
//		}
//		
//		
//		int[] month2 = new int[30];
//		for(int i=0; i<month1.length; i++) {
//			month1[i] = i+1;
//	
//		}
//		
//		int[][] month = new int[12][30];
//		for(int i=0; i<month[0].length; i++) {
//			month[0][i] = i+1;
//	
//		}
//		
//		for(int j=0; j<month.length; j++) {
//			for(int i=0; i<month[j].length; i++) {
//				month[j][i] = i+1;
//	
//		}
//		}
//		System.out.println("___________");
//			for(int j=0; j<month.length; j++) {
//				for(int i=0; i<month[j].length; i++) {
//					System.out.println(month	);
//					System.out.println(month[j][i]);
					
//				}
//			}
	
	
	
	
	
//	int start = 3;
//	int end = 10;
//	//0~~0.9999
//	double dRandom = Math.random();
//	//0~~~~~~~~7
//	int iRandom = (int)(dRandom*(end - start + 1));
//	
//	int result_random = iRandom + start;
//	
//	//한줄로
//	int random = ((int)(Math.random()*(end - start + 1))) + start;
	
//	// 4개짜리 배열을 깊은복사 
//	String[] name10 = {"김","이","박","최"};
//	//name10와 정확히 동일한 name11를 만드세요 
////	String[] name11 = name10;
//	String[] name11 = new String[name10.length];
//	name11[0] = name10[0];
//	for	(int q=0; q<name10.length;q++);{
//		name11[q] = name10[q];
//	}
//	
//	System.out.println(name11[3]);
	
	
	
	
	
//		int[] lotto = new int[6];
//		lotto[0] = (int) (Math.random()*(45)) + 1;
//		
//		boolean flag = false;
//		int index = 2;
//		for(int i=0; i <index;i++) {
//			if(lotto[i] == lotto[index]) {
//				flag = true;
//				break;
//			}
		
			
	
		int[] lotto = new int[6];
		boolean flag = false;
		for(int j=0; j<lotto.length; j++) {
			do {
				lotto[j] = (int)(Math.random()*(45)) + 1;
				flag = false;
				for(int i=0; i<j; i++) {
					if(lotto[i] == lotto[j]) {
						flag = true;
						System.out.println("중복발생");
						break;
					}
				}
			} while(flag);
		}
		System.out.println("--로또 번호--김경민--------------");
		for(int i=0; i<lotto.length; i++) {
			if(i != 0) {
				System.out.print(","+ lotto[i]);
			} else {
				System.out.print(lotto[i]);
			}
		}
			
		
	
	
	
	
	
	}
	

}
