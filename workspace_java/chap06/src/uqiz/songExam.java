package uqiz;

public class songExam {

	public static void main(String[] args) {
		
		String title = "abc";
		
		Song song1 = new Song(); //생성자 생성
		song1.title = "home sweet home";//타이틀 객체를 불러온다
		song1.singer = "G=Dragon";
		
		System.out.println(song1.title);
		System.out.println(song1.singer);
		System.out.println(song1.like);
		
		Song song2 = new Song(); //  
		song2.title = "APT,";	// 값 지정
		song2.singer = "로제"; //값지정 
		song2.like = 1000;
		
		System.out.println(song2.title);
		System.out.println(song2.singer);
		System.out.println(song2.like);
	//------
		Song song3 = new Song(); //  
		song3.setTitle("Whiplash");
		System.out.println(song3.title);
		System.out.println("");
		
		Song song4 = new Song(); //  
		song4.setTitle2("Whiplash");
		System.out.println(song4.title);
	
		double a = song3.plus(1,3);
		double b = song3.plus(a,3);
		System.out.println("정답은"+b);
	}

}
