package uqiz;

public class CalcExam {

	public static void main(String[] args) {
		Calc calc = new Calc();
		double result = calc.compute(10.5, "/", 10.1);
		System.out.println("결과 : "+ calc.c);
	}

}
