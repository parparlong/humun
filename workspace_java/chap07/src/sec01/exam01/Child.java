package sec01.exam01;

public class Child extends Parent{

	void printName() {
		System.out.println("name :"+ name);
		System.out.println("super.name :"+ this.name);
		String pName = getName();
		System.out.println("pName:"+ pName);
	}
	Child(int a){
		super(1);
//		this(2); 	//this와 super은 모두 윗줄에 적어야하므로
					//같이 사용할수 없다
	}
	
	//상속을 받았을때의 기본 생성자
	Child(){
//		super(); 	//부모의 생성자, 생략 가능 기본생성자에 들어가있음
					//그렇기때문에 있든없든 자동실행 
		super(1);
		System.out.println("자식실행");
	}
	
	
	//전달인자가 필드를 가리는현상
	//shadow
	void setName(String name) {
		this.name = name;
	}
	
	int age;
	//부모의 필드를 가리는 현상
	// overshadow
	String name = "child의 name";
	
	String parentName() {
		System.out.println("여기서부터");
		String name = null; 		// 지역변수
		String cName = this.name; 	// 내 필드
		String pName = super.name;	// 부모 필드

		return super.name;
	}
	Child(String name){
		super(name);
	}
}
