package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			test2();
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\text.txt");
			// 뭔가 처리 도중
			// 예외 발생
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resource
		// close() 자동 실행 
		//Closeable 인터페이스가 있는 클래스만 넣을수 있습니다
		try(
			FileInputStream fis2 = new FileInputStream("c:\\text.txt");
		){
			System.out.println(fis2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	static void test() throws ClassNotFoundException, IOException {
		Class.forName("괜찮안인인인인인인이닝ㅇ닝");
	}

	static void test2() throws HumanException {
		System.out.println(1);

//		throw new NumberFormatException("123");
		throw new HumanException("123");
//		System.out.println("테스트");
	}
}
