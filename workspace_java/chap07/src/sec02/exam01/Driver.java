package sec02.exam01;

public class Driver {
	
	void run(Car car) {
		System.out.println("run 박습니다 손님");
		car.drive();
		
		//왼쪽: 부모가 담긴 변수
		//오른쪽: 자식 클래스 
		//렌드로버의 부모가 car가 맞는지 확인
		if(car instanceof Landrover) {
			System.out.println("이거 랜드로버네요!!!");
			Landrover landrover = (Landrover) car;
			landrover.autoRun();
		}
	}

}
