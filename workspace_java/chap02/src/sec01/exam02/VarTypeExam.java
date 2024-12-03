package sec01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b = 127;
//		b = 128; 범위값 초가 에러
//		byte b1 = 100;
//		byte b2 = 80;
//		b = b1 + b2
		
		long l1 = 10;
		long l2 = 20L;
//		long l3 = 10000000000; defaul 변수는 int이기때문에 long알려주기위해
		long l3 = 10000000000L; // L글자 사용

		System.out.println();
		
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 67;
		System.out.println(c2);
		System.out.println(c2-c1);
		
		char c3 = 'a';
		System.out.println(c3-c1);
//                                   글씨하나를 출력할때 char사용
		String s1 = "김경민";
		System.out.println(s1);
		
		String s2 = "\"김경민\""; // \" 사용시 "문자열 출력가능
		System.out.println("s2 : "+ s2);
				
		String s3 = "번호\t이름"; // tab키쓴것처럼 멀어짐
		System.out.println("s3 : "+ s3);
		String s4 = "번호2\t이름"; // 들여쓰기하는것처럼 오토 텝키 느낌
		System.out.println("s4 : "+ s4);
	
		String s5 = "홍길동\n김자바"; // 줄내림			
		System.out.println("s5 : "+ s5); //ln= 뉴라인 
		System.out.print("1"); 
		System.out.print("2");  
		System.out.println("3");
		
		
		
		double d = 0.1234567890123456789; 
		//16번쨰 자리까지 보장 17번째 자리에서 반올림
		System.out.println("d : "+ d);
		float f = 0.123456789123456f;
		//7번째 자리까지 보장 8번째 자리에서 반올림
		System.out.println("f : "+ f);
		
		boolean b1 - true;
		boolean b2 - false;
		
		
	}

}
