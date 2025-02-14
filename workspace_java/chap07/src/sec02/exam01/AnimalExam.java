package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
		Cat cat = new Cat();
		cat.eat();
		
		Animal a2 = (Animal)cat;	// 자식이 부모가 될때
		Animal a3 = cat; 			// 형변환 연산자 생략 가능
									// 사실은 자식에서 부모만 뺴온다
		a3.eat();
		a3.sound();
		
		Animal a4= new Dog();
		a4.eat();
		a4.sound();
		
		catMom(cat);
		
		Animal a6 = (Animal)cat;
		System.out.println("a6 == cat :"+ (a6 == cat));
		feed(a6);
		feed(new Dog());

	}
	
	static void catMom(Cat cat) {
		System.out.println("-------");
		cat.eat();
		cat.sound();
	}
	
	static void feed(Animal animal) {
		
		System.out.println("--feed----");
		animal.eat();
		animal.sound();
		animal.age();
	}
}
