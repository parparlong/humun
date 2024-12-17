package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또 1 ~ 45의 숫자 중
		//중복되지 않는 수 6개 고르기  주사위 6개 돌려야됨
		double rand = Math.random();
		
		double temp1 = rand * 45; 	// 0 ~ 0.99999999999
		int temp2 =(int)temp1;		// 0 ~ 44.9999999
		int lottol = temp2 + 1;		// 0 ~ 44
		System.out.println(lottol);	// 1 ~ 45

	
	
	
	
	}

}
