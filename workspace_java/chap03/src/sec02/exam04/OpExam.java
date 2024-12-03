package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
		
		boolean a = false;
		System.out.println("a :"+a);
		
		a = !a;
		System.out.println("a :"+a);
		
		double b = 7.0;
		System.out.println(b / 3);
//		double을 0으로 나누면Infinity 에러
		System.out.println(b / 0); 
//		int를 0으로 나누면 "/by zero" 에러
//		System.out.println(3 / 0); 
		
		
		int c = 9684321;
		int d = 5;
		System.out.println("몫 :"+ (c/d));
		System.out.println("나머지 :"+ (c%d));
		
//		깜짝퀴즈
//	 1만원이있고 4500짜리 라뗴를 몇잔 마실수있는가
		
		int e = 10000; //현금
		int f = 4500; //라떼 금액
//		살수이있는잔 
		System.out.println("살수있는 잔 :"+ (e/f) + " 잔");
//		남은잔돈
		System.out.println("남은잔돈 :"+ (e%f) + " 원"); 
			
		
//		문제1
//		올리브영에서 전품목 15%세일 중!!
//		1.꿀홍차 5000원을 샀을때 얼마를 내야되나요
//		2.꿀홍차(5000)와 립스틱(30000)을 같이사면 얼마인가요		

		int qwe = 5000;
		int bb = 30000;
//		할인률		
//		꿀홍차만 구매
		double result = qwe*1 - (qwe * 0.15);
		result = qwe * (1 - 0.15);
		System.out.println("꿀홍차 할인후금액 :"+ result);				
//		꿀홍차,립스틱 구매
		result = (qwe * (1 - 0.15)) + (bb * (1 - 0.15));
		result = (qwe + bb) * (1 - 0.15); //15프로 할인금액구하기 
		System.out.println("꿀홍차와 립스틱 할인후금액 :"+ result);
				
//		문제2		
//		7234원이있다.
//		5000,1000,500,100,50,10,1 
//		각각 최대 몇개까지로 표현할 수 있나요?
		int total = 7234;
		int ochun = 5000;
		int chun = 1000;
		int oback = 500;
		int back = 100;
		int oship = 50;
		int ship = 10;
		int il = 1;
		int sum;
		
		System.out.println("남은잔액: "+total);
		int ochun1 = total / ochun;
		System.out.println("오천개수"+ochun1+"개");
		total = total % ochun;
		
		System.out.println("남은잔액: "+total);
		
		int chun1 = total / chun;
		System.out.println("천개수"+chun1+"개");
		total = total % chun;
		
		System.out.println("남은잔액: "+total);
		
		int oback1 = total / oback;
		System.out.println("오백개수"+oback1+"개");
		total = total % oback;
		
		System.out.println("남은잔액: "+total);
	
		int back1 = total / back;
		System.out.println("백개수"+back1+"개");
		total = total % back;
		
		System.out.println("남은잔액: "+total);
		
		int oship1 = total / oship;
		System.out.println("오십개수"+oship1+"개");
		total = total % oship;
	
		System.out.println("남은잔액: "+total);
		
		int ship1 = total / ship;
		System.out.println("십개수"+ship1+"개");
		total = total % ship;
	
		System.out.println("남은잔액: "+total);
		
		int il1 = total / il;
		System.out.println("일개수"+il1+"개");
		total = total % il;
	
		
		char c1 = 'A';
		c1 = (char)(c1 +1);
		System.out.println(c1);
		System.out.println(""+3+3.0);
		String c2 = "100";
		int c3 = Integer.parseInt(c2); //문자를 숫자로 바꿔주는 렙퍼클레스
		System.out.println(c3+3); //결과값 103
		
		boolean bool = 3 > 5;
		System.out.println(bool);

		System.out.println(1==1); //참
		System.out.println(1==1.0); //참
		System.out.println(1.0==1.0f); //참
//		소수점 이하는 정확하지 않아서
//		0.1을 0.99999999또는 0.10000000000001로 처리될수도있어서
//		같은 타입으로 변환해서 비교하자
		System.out.println(0.1==0.1f); // false 
		
		//System.out.println("ab" < "ac");
		System.out.println('C'<'J');
		
		System.out.println("3 != 3 :"+ (3 != 3)); //false
		
		String s1 = "감자";
		String s2 = "감자";
		System.out.println(s1 == s2);
		// 글씨 비교는 == 사용금지
		System.out.println(s1.equals(s2));
		System.out.println(!s1.equals(s2));
		//String 변수 또는 "글씨".equals(비교값)
		
		int i1 = 87;
		System.out.println(i1+"은 B학점인가? ");
		System.out.println(
				(i1 >= 80) && (i1 < 90)
			);
		
		System.out.println(
				(i1 >= 80) || (i1 < 90)
				);
		
		System.out.println( 10 | 1);
		System.out.println(10 | 3);
		
//		k1 =7 k2 15,=
		int k1 = 7;
		int k2 = 15;
		int k3 = 17;
		System.out.print("K3이 가장 큰 값인가? ");
			System.out.println((k3 > k2) && (k3 > k1) );
		
		int m1 = 5;
		m1 = m1 + 2;
		m1 += 2;
		
		int n1 =10;
		n1 +=1;
		n1++;
		n1 = n1 - 1;
		n1 -= 1;
		n1--;
		System.out.println(n1);
		
		int n2 = 10;
		System.out.println("n2 : "+ ++n2);
//		선증감 결과값 11
		System.out.println("n2 : "+ n2++);
//		후증감 결과값 11
		System.out.println("n2 : "+ n2);
		
		int x =1;
		int y =1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println("result1 :"+ result1 );
		System.out.println("result2 :"+ result2 );
		
		int z = 1;
		System.out.println(  ++z + ++z    ); //2+3 5
		System.out.println(  z   ); //3
//		1에서 증감하여 2가됬고 2 + 증감된2에서 1이증감되서 3이되었다
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B'; //삼항 연산자
		//조건시식이 참이면 A가 나오고 거짓이면 B가 나온다 
		
		
		//5번문제
		int var1 = 5;
		double var2 = 2; //var2가 더블이되면 
		double var3 = (var1 / var2);  //더블에서 인트를 나누기때문에 더블로바뀜
		int var4 = (int)(var3 * var2); // 4.5 =int 4
		System.out.println(var4);
		
		
		//6번문제 356중에 56을 지울려면 
		int value = 356;
		System.out.println(
				(value / 100) * 100
				);
		
		// 깜짝 퀴즈
		// v1 / v2
		double v1 = 1000;
		double v2 = 457;
		double v3 = v1 / v2 *1000; 
		int v4 = (int)v3; //정수로 만든다음 
		double v5 = (double)v4/1000; // 나누기 천 
		
		System.out.println(v5);
		
	}

}
