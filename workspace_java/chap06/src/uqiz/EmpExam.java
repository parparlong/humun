package uqiz;

public class EmpExam {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno = 1234;
		e1.ename = "∞©±›ºº";
		e1.pay = 3500;
		e1.empnoi = 1212;
		Emp e2 = new Emp();
		e2.empno = 1212;
		e2.ename = "ø¿¿€±≥";
		e2.pay = 1500;
		e2.empnoi = 8888;
		Emp e3 = new Emp();
		e3.empno = 8888;
		e3.ename = "ªÔ≥≤∏≈";
		e3.pay = 2000;
		e3.empnoi = 9999;
		
		EmpTable et = new EmpTable("Emp");
		et.add(e1);
		et.add(e2);
		et.add(e3);
		et.print();
		et.print2();
		et.print3();
		

	
		
		
		
		
		

	}

}
