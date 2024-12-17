package uqiz;

import java.util.ArrayList;

public class Movie {

	//생성자 
	//생성자 선언 : 클래스명 (전달인자들){  }
	
	//생성자가 없으면 
	//기본적으로 생김 :클래스명 (전달인자들){  }
	//생성자를 적으면 기본 생성자는 생성안됨
//	Movie(){
//		System.out.println(1);
//	}
//	Movie(String title){
//		System.out.println(title);
//	}

//	Movie(String title,int year){
//		System.out.println(title+","+yera);
//	}
	String title;
	int year;
	Movie(String title,int year){
		this.title = title;
		this.year = year;
		System.out.println(this.title+","+this.year);
	}
	// title 값을 바꿀수 있다.
//	void setTitle(String title){
//		this.title = title;
//		this.year = year;
//	}
	//null을 넣을경우 경고문구 표시
	void setTitle(String title){
		if(title != null) {
			this.title = title;
		}else
			System.out.println("제목을 null로 넣지마세요");
	}
	 void print(){
			 System.out.println(this.title);
			 System.out.println(this.year);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
