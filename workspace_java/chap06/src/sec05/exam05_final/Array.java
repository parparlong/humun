package sec05.exam05_final;

public class Array {

	
//	int[] aa = new int[3];
//	Array() {
//		System.out.println(a.length);
//		a.length // final 정수 변수 
//	}
	
	final int length; 	//배열의 크기
	int[] arr; 			//배열 선언 
	int cursor = 0;		//현재 위치
	
	 Array(int length){
		this.length = length;
		arr = new int[length];
		//new 넣는이유 
	}
	void add(int x) {
		//길이 5번째 이전이면
		if(cursor < this.length) {
			//어레이에 받아온 값을 넣는다
			arr[cursor] = x;
			//값을 받아올때마다 인덱스 1식 증감한다
			cursor++;
		} else {
			System.out.println("꽉찻습니다 에러");
		}
		
	}
	int get(int index) {
		//해당되는 인덱스에 대한 값출력
		if(index < this.length) {
			return arr[index];	
		}else {
			System.out.println("아아차사");
			return Integer.MIN_VALUE;
		}
	}
}
