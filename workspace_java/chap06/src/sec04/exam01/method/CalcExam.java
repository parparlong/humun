package sec04.exam01.method;

public class CalcExam {

	//전달 인자 선언 ()
	public static void main(String[] args) {
//		
		Calc calc = new Calc();
//		calc.powerOn(); // 실행의 ()
//		System.out.println("calc.isOn:"+calc.isOn);
//		calc.powerOff(); // 실행의 ()
//		System.out.println("calc.isOn:"+calc.isOn);	
//	
//	
//		calc.plus(7,10);
		
//		int b = 7;
//		int a = calc.plus(b, 10);
//	
//		double c = calc.divide(10,0);
//				
//		System.out.println("divide의값 :"+c);
				

		int[] f = {1,2,3,4,5};
		int f1 = calc.sum1(f);
		System.out.println("f1:"+f1);


		int f2 = calc.sum2(f);
		int f3 = calc.sum2(1,2,3,4,5);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);






}
	

}
