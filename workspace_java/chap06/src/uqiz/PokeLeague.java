package uqiz;

import java.util.ArrayList;
import java.util.Random;

public class PokeLeague {

	
	
/*	ArrayList<Pokemon> 이름 = new ArrayList<>();

	
     void sosoreague(String Name, String Type, int Num) {
		//포켓몬에서 출력되는 값을 순서대로 배열형태로 저장 
		Pokemon newPokemon = new Pokemon(Name,Type,Num);
		
		이름.add(newPokemon);
		
	}
     
	//이그젬에 출력 
	void print() {
		for(Pokemon pokemon : 이름 ) {
			System.out.println("이름 :"+pokemon.getName() + "  \t  타입:"+pokemon.getType() + "  \t  번호:"+pokemon.getNum());
		}
		System.out.println("출정할 포켓몬 3마리 내보내세요 ");
		
	}
	//출정할 포켓몬 지정 3마리 어떤형식으로 선정을하냐?
	//랜덤? 지정? 지정 ㄱㄱ 
	//지정으로 갈려면 기존 배열에서 3마리만 가져온다 
	//가져오는방식 렌덤으로 3마리 선정 > 렌덤함수를 사용하여 1~ 8까지  
	void poketmonsam () {
		Random random = new Random();
		//만약 렌덤함수 3이나오면 3번째 잉어킹이 출력 
//		System.out.println(이름.size());
		for(int i = 0 ; i< 3;i ++) {
			int randomInt = (random .nextInt(8))+1;
			System.out.println(randomInt);
			if(randomInt == pokemon.getNum() ) {
				
			}
		}
		
	}*/

	String name=null;
	ArrayList list = new ArrayList();
	
	PokeLeague(String name){
		System.out.println("name :"+ name + "리그");
		this.name = name;
	}
	
	void add(Pokemon p) {
		this.list.add(p);
		
	}
	
	void print() {
		System.out.println("------------");
		System.out.println(this.name + "리그 참가 포켓몬");
		for(int i=0; i<list.size(); i++) {
			System.out.println("이름 : "+list.get(i));
			//형변환을 안하면 object에만 담을수있다
			Pokemon p = (Pokemon)list.get(i);
			System.out.println(p);
			System.out.println("이름 : "+p.name);
			System.out.println("타입 : "+p.type);
			System.out.println();
		}
	}
	
}	
	
	
	
	
	
	
	
	
	

