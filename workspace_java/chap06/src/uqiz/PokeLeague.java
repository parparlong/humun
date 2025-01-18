package uqiz;

import java.util.ArrayList;

public class PokeLeague {

	
	ArrayList 이름 = new ArrayList();
	
	//이그젬에서 포켓몬 이름과 속성이 입력되면 배열로 저장
	void sosoreague(Pokemon x) {
		이름.add(x);
		

		
	}
	void print() {
		for(int i = 0 ; i < 이름.size() ; i++) {
			System.out.println("이름"+이름.get(i).type);
			
		
	}
	}
	
}
