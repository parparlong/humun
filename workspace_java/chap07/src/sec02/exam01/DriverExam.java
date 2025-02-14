package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		Coupe coupe = new Coupe();
		
		Driver driver = new Driver();
		driver.run(coupe);
		
		Landrover landrover = new Landrover();
		driver.run(landrover);
		
		HumanCar human = new HumanCar();
//		driver.run(human);

	}

}
