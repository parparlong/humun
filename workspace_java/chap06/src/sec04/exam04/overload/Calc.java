package sec04.exam04.overload;

public class Calc {

	int plus(int x, int y) {
		System.out.println("int int 실행");
		return  x + y;	
	}
	//int,int로 위의 메소드와 전달인자의 타입이 동일 
//	int plus(int y, int x) {
//		System.out.println("int int 실행");
//		return  x + y;	
//	}
	//오버로딩
	//1.전달인자를 신경쓰지 않고 비슷한 수행을 할 수 있게 해주는 기술
	// 	1-1.전달인자의 개수,타입,순서등으로 구분할 수 있어야 한다.
	//2.전달인의 우선순위 
	// 	2-1. 정확히 동일한 타입우선 
	//	2-2. 없으면 자동 형 변환으로 실행될 수 있는 타입 찾기
	//3.전달인자가 너무 많고 보통 대부분이 기본값이 있는 경우
	// 		전달인자를 줄이는 목적으로도 사용 함
	
	
	double plus(double x, double y) {
		System.out.println("double double 실행");
		return  x + y;	
	}
	double plus(int x, double y) {
		System.out.println("int double 실행");
		return  x + y;	
	}
	
	int plus(int x) {
		return x+x;
	}
	
	
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	//메소드 선언 위치는 전/후 따지지 않아도 된다
	void execut() {
		double result = avg(7,10);
		p("평균:"+result);
		System.out.println("execute 끝");
	}
	void p(String msg) {
		System.out.println("-----결과----------");
		System.out.println(msg);
		System.out.println("---------------");
		System.out.println();
	}
	
//	void method1(String classDept, int ClassNum) {
//		System.out.println(classDept+","+ClassNum);
//	}
//	void method2() {
//		method1("천안",1);
//	}

	void method(String classDept, int ClassNum) {
		System.out.println(classDept+","+ClassNum);
	}
	void method() {
		method("천안",1);
	}
}
