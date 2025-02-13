package sec01.exam01;

public class ExtendExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.printName();
		String chName = ch.getName();
		System.out.println("chName : " + chName);
		System.out.println("ch.name: "+ ch.name);
		
		String pName = ch.parentName();
		System.out.println(pName);
		
		Child c2 = new Child("새로운 이름");
		String pName2 = c2.parentName();
		System.out.println(pName2);
	}

}
