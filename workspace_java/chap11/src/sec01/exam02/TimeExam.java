package sec01.exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {

		long b = System.currentTimeMillis();
		System.out.println(b);
		
		for(int i=0; i<1000; i++) {
//			System.out.println(i);
		}

		long after = System.currentTimeMillis() - b;
		System.out.println(after);
		//시간을 측정해서 얼마나걸리는지 확인가능
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
	}

}
