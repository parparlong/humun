package zxcv;

import java.util.ArrayList;
import java.util.HashMap;

public class bochung {

	public static void main(String[] args) {

		for (int j = 1; j < 13; j++) {
			System.out.println("\t\t\t"+j + "월");

			for (int i = 1; i < 32; i++) {
				System.out.print(i + "일\t");

				if (j % 2 == 0 && i == 30) {
					System.out.println();
					break;
				} else if (i % 7 == 0) {
					System.out.println();
				} else if (i % 31 == 0) {
					System.out.println();
					break;
				}
			}
		}
		

		//1
		//2 3
		//4 5 6
		//7 8 9 10
		//11 12 13 14 15
//		int b = 0;
//		for(int q = 1; q <= 31 ; q++) {
//			System.out.print("*");
//			b=b+q;
//			if(b%q==0) {
//				System.out.println("");
//			}
//		}
		
		
		
		        int height = 5; // 트리의 높이
		        int totalWidth = 2 * height - 1; // 트리의 전체 폭

		        for (int i = 1; i <= height; i++) {
		            int stars = 2 * i - 1; // 현재 줄에서 출력할 별의 개수
		            int spaces = (totalWidth - stars) / 2; // 현재 줄에서 출력할 공백의 개수

		            // 공백과 별을 한 줄에 출력
		            String line = " ".repeat(spaces) + "*".repeat(stars);
		            System.out.println(line);
		        }
		        
		        
		    	int qwe = 6;
				String e = "z";
				for(int i=1 ; i < qwe ; i++) {
					String q = " ".repeat(qwe - i);
					String w = "*".repeat(i * 2 - 1);
					System.out.println(q + w);
					e = " ".repeat(i);
				}
				 System.out.println(e+"l");     
		       
				 
				int[] num = new int[10];
				for (int i = 0; i < num.length; i++) {
					num[i] = i+1;
				}
				for (int q = 0; q < num.length; q++) {
					System.out.println(num[q]);
				}
				System.out.println();
				
				
				int[] num1 = new int[10];
				for (int i = 0; i < num1.length; i++) {
					num1[i] = 10 - i;
				}
				for (int q = 0; q < num1.length; q++) {
					System.out.println(num1[q]);
				}
				System.out.println();
		
				
				String[] strArr = {"사과","귤","포도","복숭아","참외"}; 
				System.out.println(strArr[1]);
				
//				String[] strArr1 = {"이름:홍길동|전화번호:010-123-4567|이메일:abc1@nate.com|우편번호:05051|주소:서울시 강동구 둔춘동 1번지|상세주소:101호"
//									,"이름:홍길동1|전화번호:010-123-4568|이메일:abc2@nate.com|우편번호:05052|주소:서울시 강동구 둔춘동 2번지|상세주소:102호"
//									,"이름:홍길동2|전화번호:010-123-4569|이메일:abc3@nate.com|우편번호:05053|주소:서울시 강동구 둔춘동 3번지|상세주소:103호"
//									,"이름:홍길동3|전화번호:010-123-4570|이메일:abc4@nate.com|우편번호:05054|주소:서울시 강동구 둔춘동 4번지|상세주소:104호"
//									,"이름:홍길동4|전화번호:010-123-4571|이메일:abc5@nate.com|우편번호:05055|주소:서울시 강동구 둔춘동 5번지|상세주소:105호"
//									,"이름:홍길동5|전화번호:010-123-4572|이메일:abc6@nate.com|우편번호:05056|주소:서울시 강동구 둔춘동 6번지|상세주소:106호"
//									,"이름:홍길동6|전화번호:010-123-4573|이메일:abc7@nate.com|우편번호:05057|주소:서울시 강동구 둔춘동 7번지|상세주소:107호"
//									,"이름:홍길동7|전화번호:010-123-4574|이메일:abc8@nate.com|우편번호:05058|주소:서울시 강동구 둔춘동 8번지|상세주소:108호"
//									,"이름:홍길동8|전화번호:010-123-4575|이메일:abc9@nate.com|우편번호:05059|주소:서울시 강동구 둔춘동 9번지|상세주소:109호"
//									,"이름:홍길동9|전화번호:010-123-4576|이메일:abc10@nate.com|우편번호:05060|주소:서울시 강동구 둔춘동 10번지|상세주소:110호"
//									,"이름:홍길동10|전화번호:010-123-4577|이메일:abc11@nate.com|우편번호:05061|주소:서울시 강동구 둔춘동 11번지|상세주소:111호"
//									};

//				System.out.println(strArr1[10]);
				
				String[][] StrArr3 = {{"이름","전화번호","이메일","우편번호","주소","상세주소"}};
				for(int q = 1; q < StrArr3.length; q++) {
					
				};
				ArrayList aList = new ArrayList();
				aList.add(1);
				aList.add(1);
				aList.add(1);
				aList.add(1);
				for (int i = 0; i < aList.size(); i++) {
					System.out.println(aList.get(i));
				}
				
				HashMap map = new HashMap();
				map.put("name", "홍길동");
//				key and value 형태로 저장하고 데이터를 가져올때 get으로 가져옴
				System.out.println(map.get("name"));
				
				aList.add(map);
				//레퍼런스 이해 필요
				
				
	}
}
