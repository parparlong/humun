package uqiz;

public class Gugudan {
	
	//전달받은 숫자에 해당하는 구구단을 출력 
	void sam(int x) {
		System.out.println(x+"단");
		for(int i=1;i<10;i++) {
			System.out.println(x+"x"+i+":"+x*i);
		}
	}
	
	
	void gugu(int x ,int y) {
		//sam재활용
		for(int i = x ; i <= y ; i++) {
			System.out.println(i+"단");
			sam(i);
		}
	}
	
	//오버로딩
	void gugu (int x) {
		gugu(x,9);
		
	}
	
	void gugu () {
		gugu(2,9);
		
	}
	
	
}
