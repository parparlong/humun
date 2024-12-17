package uqiz;

public class MovieExam {

	public static void main(String[] args) {
		
//		new Movie(); //이걸로 생성 못하고
//		new Movie("무파사"); //이걸로 생성
		new Movie("무파사",2025);
		new Movie("감자탕",2024);
		//Movie에 필드값 출력 안됨
//		new Movie(title);
		//Movie에 필드값 출력 할려면 변수에담아야된다
		//변수에 담지않으면 출력후 날아가버린다
//		System.out.println(Movie.);
		//변수에 담는방법
		Movie movie = new Movie("감자탕",2025);
		//그냥 무비만 적으면 주소값이 나온다
		//힙영역에 올라가있는 메모리 주소만 출력
		System.out.println(movie);
		//무비를 적고 거기에서 불러올 변수를 적어야됨
		//힙영역에 올라가있는 메모리 주소 안에있는 값을불러옴
		System.out.println(movie.title+","+movie.year);
		
		movie.setTitle(null);
		
		//클래스의 모든 정보를 출력하는 메소드
		//print 만들기 
		//무비 클레스에서 모든정보를 출력하는 메소드를 만든다음에 
		//메인메소드에서 돌리기
		//movie.print() 를 출력하는방법 
		movie.print() ;
	}

}
