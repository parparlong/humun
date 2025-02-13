package sec01.exam03.override;

public class ComputerExam {

	public static void main(String[] args) {
		Calc calc =new Calc();
		int a = calc.plus(4, 10);
		System.out.println("Clac.plus의 결과 : " + a);
		System.out.println(calc.areaCircle(10));
		
		Computer computer = new Computer();
		int b = computer.plus(10,30);
		System.out.println("computer.plus 결과: "+ b);
		System.out.println(computer.areaCircle(10));

	}

}
