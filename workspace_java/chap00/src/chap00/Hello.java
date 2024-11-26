/*
package chap00;
public class Hello {

	public static void main(String[] args) {

		int age;
		double value;
		
	}
}	
		/*
		 userinfo : 알아보기 불편하다
		 userInfo : 카멜(낙타) camel case
		 user_info : snake case
		 user-info : kebap case
		 */

*/







//질문1.package chap00; 빼고 작성해도되는지
//질분2.리턴값 {} 대괄호? 를 따로 뺴놓는 이유
/*
package chap00;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sumber(10,2);
		System.out.println("결과:"+result);
	}
	public static int sumber(int a, int b) {
		return a+b;
	}
}*/

// 입력값 a를 기준으로 b로 나누고 맞아 떨어지면
// return 1, 값이 남으면 return 0출력 



/*
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("A값을 입력하세요.");
    	int abalue = sc.nextInt();
    	
    	System.out.println("B값을 입력하세요.");
		int bbalue = sc.nextInt();
    	
	
		if (abalue % bbalue != 0) {
			return 1;
		}else {
			return 0;
		}
	sc.close
	}
		
	}
*/














package chap00;
import java.util.Scanner; // import 문은 클래스 정의 위에 있어야 합니다.

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        // A와 B 입력받기
        System.out.println("A값을 입력하세요.");
        int abalue = sc.nextInt();

        System.out.println("B값을 입력하세요.");
        int bbalue = sc.nextInt();

        // 나눗셈 결과 검사
        if (bbalue != 0) { // B값이 0인지 확인
            if (abalue % bbalue == 0) { // 나머지가 0인지 확인
                System.out.println(1); // 결과 출력
            } else {
                System.out.println(0); // 결과 출력
            }
        } else {
            System.out.println("B값은 0이 될 수 없습니다."); // 0으로 나눌 수 없음을 출력
        }

        sc.close(); // Scanner 닫기
    }
}
