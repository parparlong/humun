package sec01.exam01;

import java.util.ArrayList;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1호점에서 판매하는 메뉴
		String[] menu1 = new String[3];
		menu1[0] = "따아";
		menu1[1] = "말차";
		menu1[2] = "라떼";
		
		//2호점에서 1호점과 똑같은 메뉴를 판매
		/*
		 *얕은 복사 
		 * shallow copy,thin copy,call by reference
		 * stack 영역의 값(주소)만 복사
		 * 값을 변경할 경우 원본이 바뀜니다.
		 * 
		 */
		String[] menu2 = menu1;
		// 얕은복사로 연결되어있어서
		// 즉, 주소값만 공유하는 거라서
		// 복사본을 바꿔도 원본이 바뀐다. 
		menu2[2] = "바나나라떼";
		System.out.println("menu1[2]:"+menu1[2]);
		
		/*
		 * 깊은 복사
		 * deep copy, deep clone, call by value
		 * 전혀 다른 heap영역에 똑같은 내용으로 채워놓음
		 * 원본과 복사본은 전혀 다른 객체
		 */
		String[] menu3 = new String[menu1.length]; 
		for (int i=0; i<menu1.length; i++) {
			menu3[i] = menu1[i];
		}
		menu3[2] = "김치라떼";
		System.out.println("menu1[2] : "+menu1[2]);
		System.out.println("menu3[2] : "+menu3[2]);
	
	//3호점에서만 "사라다빵"을 팔고 싶다.
	/*
	 * 전략1.
	 * menu3보다 크기가 1개 많은 새로운 배열을만들어
	 * 앞부분은 기은 복사 해놓고
	 * 마지막에 "사라다빵"을 수동으로 추가해보자
	 */
	
		menu3 = new String[menu1.length+1];
		for (int i=0; i<menu1.length; i++) {
			menu3[i] = menu1[i];
		}
		menu3[menu3.length-1]="사라다빵";
		for	(int i=0; i<menu3.length;i++) {
			System.out.println(menu3[i]);
		}
	
		//ArrayList 사용법
		ArrayList list = new ArrayList();
		//추가
		list.add(1);
		list.add("문자");
		list.add(false);
		//사용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//사이즈
		System.out.println(list.size());
		//전체내용확인
		System.out.println(list);
	
	
		//향상된 for문
		//중간확인이 힘들고 홀수짝수 이런게안된다
		//전체 돌릴거면 향상된 for문을쓰는게 용이
		for( String menu :menu3){
			System.out.println("menu : "+ menu);
		}
	
	
	
	
	/*문제 5번
	 * 합
	 * 평균 : 합/개수
	 * 최대값 
	 * 
	 */
	
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		double avg = 0.0;
		double count = 0;
		// 작성위치
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i =0; i<array.length;i++  ) {
			for(int j=0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
				avg = sum / count ; 
				if(max < array[i][j]) {
					max = array[i][j];
				}
			
			
			}
		}
		
		System.out.println("sum:"+ sum);
		System.out.println("avg:"+ avg);
		System.out.println("max:"+ max);
		
	
	
	}

}
