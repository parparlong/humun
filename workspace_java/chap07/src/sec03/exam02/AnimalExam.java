package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
//		new Animal();
		Dog dog = new Dog();
		Animal a = dog;
		a.sound();
		dog.sound();
		
		Dog dog3 = new Dog();
		dog3.name = "강아지 1호";
		Dog dog4 = dog3;
		dog4.name = "강아지 3호";
		setName(dog);
		System.out.println(dog.name);

	}
	static void setName(Dog dog) {
		dog.name = "강아지 2호";
	}
}
