package quiz;

public class PersonExam {

	public static void main(String[] args) {
		
		Doctor docter = new Doctor();
		Engineer engineer = new Engineer();
		Person person = new Person();
		
//		Person d = docter;
//		Person e = engineer;
		
//		String[] list = {d.toString(),e.toString()};
		Person[] list = {docter,engineer};
		
		for(int i =0; i<list.length; i++) {
			
			list[i].work();
			//앞에는 부모 변수 뒤는 자식 클레스
			if(list[i] instanceof Doctor) {
				System.out.println("이사람은 의사입니다");
			}else if(list[i] instanceof Engineer) {
				System.out.println("이사람은 엔지니어입니다");
			}
		}
		

	}

}
