package sec04.exam01.method;

public class Calc {
	//전원, false: 꺼짐, true: 켜짐
	boolean isOn = false;
	
	//전원을 켜는
	//isOn을 true로 바꿔주는
	//메소드 선언
	
//	void powerOn() {
//		isOn = true;
//		System.out.println("전원을 켭니다");
//	}
//	
//	void powerOff() {
//		isOn = false;
//		System.out.println("전원을 끕니다");
//	}
	//자바독방식의 주석
	/**
	 * 더하기 기능
	 * 두 수를 입력 받아서 더한 결과를 돌려줌
	 * 
	 * 메소드명:plus
	 * 전달인자 : int, int 
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int z
	 * @author : sasnna4001@naver.com
	 * 
	 * 
	 */
//	int plus(int x,int y) {
//		System.out.println("x:"+ x);
//		System.out.println("y:"+ y);
//		
//		int result = x + y;
//		return result;
//	}
	
	/**
	 * 두정수를 받아서 나누기 기능
	 * 두 수를 입력 받아서 나누기한 결과를 돌려줌
	 * 
	 * 메소드명:divide
	 * 전달인자 : int, int 
	 * 리턴타입 : int (두 수의 나누기값)
	 * 
	 * @param : int x, int y
	 * @return : int z
	 * @author : sasnna4001@naver.com
	 * 
	 * 
	 */
//		int divide( int x2,int y2) {
//		System.out.println("x2:"+ x2);
//		System.out.println("y2:"+ y2);
//		double result2 = 0;
//		if(y2 == 0) {
//			System.out.println("0으로 나올수 없습니다");
//		}else {
//			result2 = (double)x2 / y2;
//		}
//		
//		return result2;
//	
//		Calc[] d = new Calc[10];
//		d[0] = new Calc();
//
//		Calc[] e = {new Calc(),new Calc()};
////		boolean d0 = d[0].isOn;
		
				
		//배열을 전달할때 얕은복사에 관하여
		int sum1(int[] values ) {
			int sum =0;
				for(int i=0; i<values.length; i++) {
					sum+=values[i];
				}
				return sum;
		}
		//...
		//	다른데서 호출할때 : sum2(1,2,3,4)	
		//	내부에서 호출할때 values는 배열 취급
		
		int sum2(int ... values ) {
			int sum =0;
				for(int i=0; i<values.length; i++) {
					sum+=values[i];
				}
				return sum;
		}
		//힙영역 에  할당해야하기때문에 new Calc() 한개당 
		//힙영역에 계속해서 메모리할당한다 
		//만드는방법 1개식만들때 
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		
		//힙영역에 Calc로 만든 영역을 계속해서 생성
		
		Calc[] z = {
				new Calc(),
				new Calc()
		};
		
		
		// ArrayList 하기








}
	
	
	
	
	

