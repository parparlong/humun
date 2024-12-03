package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Keycode;
		
		//try {
//			Keycode = System.in.read();
//			System.out.println(Keycode);	
//
//			Keycode = System.in.read();
//			System.out.println(Keycode);	
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println("inputData : "+ inputData); //글자만 가능
		
		int input = scan.nextInt();
		System.out.println("input : "+ input); //숫자만 가능
		
	}

}
