package uqiz;

public class Calc {


	
	double plus(double x, double y) { //더하기
	
			 return x + y;
	}
	double subtraction(double x, double y) { //뺴기
		return x - y;
	}
	double divide(double x, double y) { //몫
		return x / y;
	}
	double multiply(double x, double y) { //곱하기
		return x * y;
	}
	double remain(double x, double y) { //나머지
		return x % y;
	}
	//의문점 string 연산자를 어따가 넘?
	//위에 각 메소드에 는왜 스트링 연산자를 안넘?
	//a값 기준으로 if문사용하여 처리를하면 출력할때 
	double c = 0; 
	double compute(double x,String a, double y) {
		 if(a.equals("+")) {
			this.c = plus(x,y);
		 } else if(a.equals("-")) {
			this.c = subtraction(x,y);
		 } else if(a.equals("/")) {
			this.c = divide(x,y);
		 } else if(a.equals("*")) {
			this.c = multiply(x,y);
		 }else {
			this.c = remain(x,y); 
		 }
		 return c; 
	 }

}
