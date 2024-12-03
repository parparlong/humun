package sec01.exam01;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int score = 75;
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		if(score >= 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//		if(score < 90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}
//
//		if(score >= 90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		} else {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}
		
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score < 90 && score >= 80){
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score < 80 && score >= 70){
		System.out.println("점수가 70~79입니다.");
		System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70점 미만입니다..");
			System.out.println("등급은 D입니다.");
		}

		
		// 문제 1.
		//z1이 x1과 y1사이에 있는지 확인
		//z1을 확인 
		int y1 = 20;
		int x1 = 15;
		int z1 = 17;
	
		if (z1 <= y1 && z1 >= x1) {
			System.out.println("사이에있다");
		}
		else {
			System.out.println("사이에있지않다");
		}
	// 정답2
		boolean r1 = (z1 >= x1);
		boolean r2 = (z1 <= y1);
		
		if (r1  && r2) {
			System.out.println("사이에있다");
		}
		else {
			System.out.println("사이에있지않다");
		}
	
		
		int x2 = 3;
		if ( (x2 % 2) == 0 ) {
			System.out.println(x2 + "짝수");
			
		}else {
			System.out.println(x2 + "홀 수");
		}
		
		// 문제 2
		/*
		 * 어제 온도가 -3도 였을때 
		 * 오늘 온도(입력 받아도됨)가
		 * 
		 * 1.영하인지 영상인지 (0은 영하
		 * 2.만약 영하라면 "영하 1도 입니다"
		 * 영상이라면 영상 2도 입니다.
		 * 
		 * 3." 어제보다 온도가 높습니다"
		 * " 어제보다 온다가 낮습니다.
		 * 
		 * 4." 어제보다 2도 높습니다."
		 * 
		 * ex : 3, -1면 "어제보다 4도 낮습니다"
		 * 
		 * 
		 */
		int yt = 1; //어제 온도
		int t = -3; //오늘 온도
		int ytt = 0;
		boolean t1 = (t > yt) ;
		boolean t2 = (t < yt) ;
		
		int t3 = yt - t; 
		int t4 = t - yt;
		
		if(t > ytt ) {
			System.out.println("영상"+t+"도 입니다.");
				if(t1){
					System.out.println("어제보다 온도가 높습니다.");
					System.out.println("어제보다"+t4+" 도가 높습니다");
					
				}else {
					System.out.println("어제보다 온도가 낮습니다.");
					System.out.println("어제보다"+t3+" 도가 낮습니다");
				}
		}else if(t <= ytt ) {  
			System.out.println("영하"+t+"도 입니다.");
			if(t1){
				System.out.println("어제보다 온도가 높습니다.");
				System.out.println("어제보다"+t4+" 도가 높습니다");
				
			}else {
				System.out.println("어제보다 온도가 낮습니다.");
				System.out.println("어제보다"+t3+" 도가 낮습니다");
			}
		}
		
		
		
		//문제 3
		/*
		 * 어떤 수가 있을때
		 * 
		 * "입력한 수는 100보다 큰/같은/작은 수이며
		 * 양수이고 / 음수이고
		 * 홀수/짝수입니다.
		 * 
		 * 
		 */
		int a12 = 110 ;
		int num0 = 100 ;
		boolean a13 = (a12 % 2) == 0 ; //홀짝
		boolean a14 = !((a12 % 2) == 0) ; // 음수 쓸필요있을까?
		
		
		
		if (a12 > num0) {
			System.out.println("입력한수는 100보다 큰 수 이며 ");
			if(a12>0) {
				System.out.println("양수");
					if(a13) {
						System.out.println("짝수");
					}else {
						System.out.println("홀수");
					}
			}
		}else if (a12 < num0){
			System.out.println("입력한수는 100보다 작은 수 이며 ");
			if(a12>0) {
				System.out.println("양수");
					if(a13) {
						System.out.println("짝수");
					}else {
						System.out.println("홀수");
					}
			}else {
				System.out.println("음수");
				if(a13) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
			}
		}else {
			System.out.println("같은수");
		}
			
		//문제4
		/*
		 * a.b 두 수가 있을때
		 * 둘중에 큰값 출력
		 * 
		 * 
		 *  
		 */
		int anum = 17;
		int bnum = 15;
		boolean upnum = (anum > bnum); //a가 더크다 참
		boolean donum = (anum < bnum); //a가 작다 거짓
		if (upnum) {
			System.out.println("더큰수 "+ anum );
		}else
		{
			System.out.println("더큰수 "+ bnum );
		}
			
		
		//문제5
		/*
		 *숫자가
		 *1일때 "일" 
		 *2일때 "이"
		 *3일때 "삼"
		 *다른 수일때 "그 외"
		 */
		int number1 = 5;

		if (number1 == 1) {
			System.out.println("일");
		}else if (number1 == 2) {
			System.out.println("이");
		}else if (number1 == 3) {
			System.out.println("삼");
		}else {
			System.out.println("그 외");
		}
		
		
		
		
		
		//문제 6
		/*
		 * 월에 따라서 
		 * 4계절을 출력
		 * 봄 345
		 * 여름 478
		 * 가을 9 10 11
		 * 겨울 12 1 2
		 * 
		 */
		int pon = 9 ;
		
		if (pon >=3 && pon <= 5) {
			System.out.println("봄");
		}else if (pon >=4 && pon <= 8) {
			System.out.println("여름");
		}else if (pon >=9 && pon <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	
		
		
		// 두자리 정수가 
		// 10의 자리와 1의 자리가 같은지 판단
		int jung = 55;
		int jung1 = jung / 10;  //10의 자리
		int jung2 = jung % 10;  // 1의 자리
		if (jung1 == jung2) {
			System.out.print(jung1);
			System.out.println(jung2);
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			
		}
		System.out.println("   ");
		System.out.println("    ");
		//		
		//10,20 		
		//90 100 		
		//	xc yc
		//풀이방법 (x축끼리,y축끼리 불리언)으로 묶ㅇ고 
		// 한번더 묶고 
		
		int xx1 = 10;
		int yy1 = 20;

		int xx2 = 90;
		int yy2 = 100;
		
		int xx3 = 30;
		int yy3 = 40;
	
		if(
				(xx1 <= xx3) && (xx2 <= xx3) //x축 안에 있는가
				&&							 //그리고
				(yy1 <= yy3) && (yy2 <= yy3) //y축 안에 있는가 
		) {
			System.out.println("사각형과 충돌하지 않음");
		}else {
			System.out.println("사각형과 충돌함");
		}
	
			
			
			
			
			
		//random 사용법
		/*
		 * 
		 * 
		 * 0 <= math < 1
		 * 
		 * 주사위 : 1 ~ 6 
		 * (0 ~ 5) + 1
		 * 
		 */
		double rand = Math.random();
		System.out.println(rand);
		
		double rand2 = Math.random()*(5+1);
		int rand3 = (int)rand2; //0~5
		int rand4 = rand3 + 1; // 1~6
		System.out.println("주사위 :"+ rand4);
	
		//쉽게 사용하기
		
		int rnd1 = (int) (Math.random() * 60);
		int rnd2 = rnd1 % 6;
		int rnd3 = rnd2 +1; //1 ~ 6
		
	
		
		//가위 바위 보 게임
		/*순서
		 * 1. 렌덤숫자 제작
		 * 2. 스켄암수사용하여 내꺼 출력 
		 * 3. 컴퓨터 가위바위보 출력
		 * 4. 두개 비교해서 확인
		 * 5.
		 */
//다른방법 
//1.가위 바위 보를 123으로 생각을하고 		
// if ( 내가 가위를 냈을때 컴터도 가위를내면 무승부 
// else if (내가 가위를 냈을때 컴터가 주먹을내면 패배)
//	else if (내가 가위를 냈을때 컴터가 주먹을내면 패배)
//모든변수로 제작 
//player = 1 npc = 2 제작 
/*System.out.println("가위낼꺼지?"); //글자만 가능
		
		//스켄암수사용하여 들어오는 입력값확인
		Scanner scan1 = new Scanner(System.in);
		String inputData = scan1.nextLine(); 
	//	scan2 = new Scanner(System.in); // 스캐너 재활용 
		
		//렌덤숫자 제작
		int num = (int) (Math.random() * 3) + 1 ;
		//1가위 2보 3주먹
		//렌덤숫자를 가위바위보로 변환 rock paper scissors
	
// 		TODO 내가 가위를 냈을때에 ncp 가위바위보		
		if( inputData.equals("가위")){
			if(num == 1) {
				System.out.println("컴퓨터는가위를 냈습니다.");
				System.out.println("무승부.");
			}else if(num == 2) {
				System.out.println("컴퓨터는보를 냈습니다.");
				System.out.println("승리.");
			}else if(num == 3) {
					System.out.println("컴퓨터는주먹를 냈습니다.");
					System.out.println("패배.");
			} 
	
		}else if(inputData.equals("바위")) {
			if(num == 1) {
				System.out.println("컴퓨터는가위를 냈습니다.");
				System.out.println("승리.");
			}else if(num == 2) {
				System.out.println("컴퓨터는보를 냈습니다.");
				System.out.println("패배.");
			}else if(num == 3) {
					System.out.println("컴퓨터는주먹를 냈습니다.");
					System.out.println("무승부.");
			}
		
			
		}else if(inputData.equals("보")) {
			if(num == 1) {
				System.out.println("컴퓨터는가위를 냈습니다.");
				System.out.println("패배.");
			}else if(num == 2) {
				System.out.println("컴퓨터는보를 냈습니다.");
				System.out.println("무승부.");
			}else if(num == 3) {
					System.out.println("컴퓨터는주먹를 냈습니다.");
					System.out.println("승리.");
			}	
		}*/
		
		

		System.out.println("로또번호 "+(int)(Math.random() * 45) +1);
		
		int num10 = 2;
			switch (num10) {
				case 1:
					System.out.println("1입니다");
					break;
				case 2:
					System.out.println("2입니다");
					break;
				default:
					System.out.println("1도2도 아닙니다");
					break;
			
			}
		/*
		 * swtich에 전달한 값과 case의 값이 일치하면 해당 실행문을 실행한다.
			
			if,else if가 == 로만 이루어진 경우 swtich를 사용할 수 있다.
			
			즉> ≥ < ≤ 등은 사용할 수 없다
			
			비교 가능한 타입: char,byte,short,int,String
			
			사용 못하는 타입: boolean, long, float, double
		 */
		
		int month = 11;
		switch (month) {
			case 1 :
				System.out.println("겨울");
				break;
			case 2 :
				System.out.println("겨울");
				break;
			case 9 :
				System.out.println("가을");
				break;
			case 10 :
				System.out.println("가을");
				break;
			case 11 :
				System.out.println("가을");
				break;
			case 12 :
				System.out.println("겨울");
				break;

		
		}
		//연속되는 무언가를 쓸때는 if보다 switch-case 문이 좀더 간결하다
		int mont = 11;
		switch (mont) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
			
			
		}
			
		//변수에 통장잔액 만원이있다 
		//출출금액을 입력 받아서 
		//"잔액이 부족합니다"
		//"얼마 출금했고 얼마 남았습니다"
		//"정확히 입력해주세요"
		
		
		//코딩할때 순서 명확하게 정리 
		/*1.출금할려면 스켄함수사용 
		 * 2.잔액을 표시할
		 * 
		 */
		
		
		//얼마 출금할건지 스캔함수로 입력받기
		System.out.println("출금할 금액을 입력해수세요");
		Scanner scan = new Scanner(System.in); // 스캐너 재활용
		int umony = scan.nextInt();
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
		
		int mony = 10000; // 통장잔고 
		int monyd = mony - umony; // 입력받은 금액 - 통장잔고 = 남은금액
		
		// 돈이 만원보다 많으면 잔액부족 출력
		if (umony > mony) {
			System.out.println("잔액이 부족합니다");
		// 돈이 만원보다 적거나 같고 남은금액이 0원보다 많으면 출력가능
		}else if (umony <= mony && umony > 0) {
			System.out.println(umony+"금액만큼 출금했고 "+ monyd+"만큼남았습니다");
		// 입력한 금액이 0원이랑 같거나 적으면 정확하게 입력해달라고 출력
		}else if (umony <= 0) {
			System.out.println("정확히 입력해주세요");
		}else {
			System.out.println("오류 상황");
		}
			
//		스위치문을 사용할시 1원부터 노가다 해야된다
//		switch (umony) {
//			case umony > mony:
//				System.out.println("잔액이 부족합니다");
//			break;
//		
//			case (mony < umony && umony > 0):
//				System.out.println(umony+"출력하였고"+monyd+"남았습니다.");
//			break;
//			
//			case u:
//				System.out.println("잔액이 부족합니다");
//			break;
//			
//			case umony < 0:
//				System.out.println("정확히 입력해주세요");
//			break;	
//		
//		}
			
			
			
			
			
			
			
			
	}
}
