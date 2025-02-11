package sec05.exam02._static;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.color = "버건디";
		
		System.out.println(calc.pi);
		
		System.out.println(Calc.pi);
		
		Calc calc2 = new Calc();
		calc2.color = "파랑";
		
		System.out.println(calc2.pi);
		
		calc.pi=2;
		System.out.println(calc2.pi);
		System.out.println(calc.pi);
		
		calc2 = calc;
		
		Calc.printPi();
		Calc.out.println("글씨");
//		Calc.out.println("글씨");
//		Calc.ooo.print("감자");
		Calc.ooo.println("감자");
		
		calc.printPi2();
	
//		text();
//		CalcExam ce = new CalcExam();
//		ce.text();
//		ce.main(new String[] {"abn"});
		
//		CalcExam.main(new String[] {"abc"});
//	static void text() {
//		void text() {
//		
//	}

	}
}

