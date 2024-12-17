package sec01.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {
		
		//여기는 ()우선순위
	//	int a = 10 + (3*4);
		//여기서 ()는 형변환 연산자
	//	long b = (long)a;
		//자동 형변환 int > long / long에 int보다 크기때문에 가능
	//	long c = a;
		
		long d = 3000000000L;
		int e = (int)d;
		System.out.println("e : "+ d);
		//long을 int로 변혼하는 경우
		//8byte 중에서 상위 4byte만 남기기 때문에
		//예측하지 못한 값이 나올수 있어서
		//[생략 불가능]
		
		long f =10;
		
		int g = 3;
		long h = 4L;
		
		
		double j = 3.3;
		double k = (double)g + j;
		double k2 = g + j;
		System.out.println("(double)g : "+ (double)g);
		
		int g2 = (int)j;
		System.out.println("(int)j:" + g2);
		
		double total = 4.3 ;
		int count = 4 ;
		double d_result = total / (double)count;
		double i_result = (int)d_result;
		System.out.println("1인당 :"+ i_result);
		
		double l_result = total % i_result;
		System.out.println("주최자내는돈 :"+ (int)(l_result*10000+10000));
		// 형변환의 경우 계산끝나고 형변환이 편하다 더블 > 인트
				
		
		double total1 = 7.9 ;
		double count1 = total1 % 4 ;
		System.out.println("1인당 :"+ (int)count1);
		
		//깜짝 퀴즈
		//주최자는 얼마 내야되는가?

		
		
		//진짜문제
		//int a =30;
		//int b = 407;
		int a =30;
		int b = 407;
		System.out.println("a 값 : "+ Math.max(a,b));  //a = 407
		System.out.println("b 값 : "+ Math.min(a,b));  //b = 30
		
		
		//2번문제
		String z = "수박";
		String x = "볼링공";
		String n = z;
		String m = x;
		System.out.println("z 값 : "+ m);  //볼링공
		System.out.println("x 값 : "+ n);  //수박
		System.out.println(m+"으로"+ n+ "깨벼렷다");  //수박


		
	}


}
