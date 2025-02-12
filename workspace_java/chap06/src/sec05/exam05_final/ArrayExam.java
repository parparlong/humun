package sec05.exam05_final;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] a =  new int[5];
		a[0] = 3;
//		System.out.println(a[0]);
		
		
		
		
		Array ar = new Array(5);
		
		ar.add(2);
		ar.add(2);
		ar.add(2);
		ar.add(2);
		ar.add(2);
		ar.add(2);
		
		
		//생성하고 나서 
		//add()에 값을 넣으면 자동으로 현재 index에 추가
		//  단, 크기를 벗어날수없음
		// get()에 index를 넣으면 그 index의 값을 return함
	
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		System.out.println(ar.get(4));
		System.out.println(ar.get(5));
		System.out.println(ar.get(6));
	}

}
