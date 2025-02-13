package sec01.exam01;

public class Parent {
//부모는 자식을 참조할수없다 순환참조 에러가뜬다
	String name = "Praent name";
//	Parent(){
//		System.out.println("부모실행");
//	}
	Parent(int a){
		System.out.println("부모실행");
	}
	
	String getName() {
		System.out.println("Parent getName");
		return this.name;
	}
	Parent(String name){
		this.name = name;
	}
}
