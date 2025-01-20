//  포켓몬 포켓몬리그 포켓몬이그잼
//  포켓몬에는 이름과 타입만 저장
//  포켓몬리그에는 포켓몬들을 저장하는 어레이리스트
//  포켓몬추가메소드 전달인자로 포켓몬을 받는다
//  포켓몬 보기메소드는 저장되어있던 이름과 타입의 정보를 모두 보여준다
//  포켓몬 메인에서 
//  일단 포켓몬 리그 생성
//  포켓몬 생성하고 이름과 타입 지정
//  포켓몬 리그에 추가
//  포켓몬 보기메소드를 실행해서 내가 추가한거 다보기
package uqiz;



public class PokemonExam {

	public static void main(String[] args) {

		
		//1. 이름과 타입이 있는것을 리그에 배열 형태로 입력 이름:삐카뀨 타입:전기 
		Pokemon p1 = new Pokemon();
		p1.name = "피까츄";
		p1.type = "천둥" ;
		
		Pokemon p2 = new Pokemon();
		p2.name = "파이리";
		p2.type = "불" ;
		
		PokeLeague pl = new PokeLeague("관동");
		pl.add(p1);
		pl.add(p2);
		pl.print();
		
		
		Pokemon p3 = new Pokemon();
		p3.name = "또도가스";
		p3.type = "가스" ;
		
		Pokemon p4 = new Pokemon();
		p4.name = "꼬부기";
		p4.type = "물" ;
		
		PokeLeague pa = new PokeLeague("야미");
		pa.add(p3);
		pa.add(p4);
		pa.print();
			
	}

}
