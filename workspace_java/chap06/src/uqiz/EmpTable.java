package uqiz;

import java.util.ArrayList;
public class EmpTable {

	String emp=null;
	ArrayList list = new ArrayList();
	
	EmpTable(String emp){
		System.out.println(emp+"table");
	}
	
	void add(Emp p) {
		this.list.add(p);
	}

	void print() {
		System.out.println("----------------");
		for(int i=0; i<list.size();i++) {
			Emp e = (Emp)list.get(i);
			System.out.println("enpno:\t"+e.empno);
			System.out.println("ename:\t"+e.ename);
			System.out.println("pay:\t"+e.pay);
			System.out.println("empnoi:\t"+e.empnoi);
			System.out.println("----------------");
		}
	}
	
	void print2() {
		System.out.println();
		System.out.println();
		System.out.println("-����2õ���̻��λ��");
		for(int i=0; i<list.size();i++) {
			Emp e = (Emp)list.get(i);
			if(e.pay >= 2000) {
				System.out.println("---------------------------------------------");
				System.out.print("enpno:"+e.empno+"\t");
				System.out.print("ename:"+e.ename+"\t");
				System.out.print("pay:"+e.pay+"\t");
				System.out.println("empnoi:"+e.empnoi+"\t");
			
			}
		}
	}
	
	void print3() {
		System.out.println();
		System.out.println();
		System.out.println("����� empno�� ���� ����� ���");
		for(int i=0; i<list.size();i++) {
			Emp e = (Emp)list.get(i);
			
			if(e.empnoi == e.empno) {
				System.out.println("---------------------------------------------");
				System.out.print("enpno:"+e.empno+"\t");
				System.out.print("ename:"+e.ename+"\t");
				System.out.print("pay:"+e.pay+"\t");
				System.out.println("empnoi:"+e.empnoi+"\t");
			
			}
		}
	}
	
}
