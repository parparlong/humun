package start2025_02_24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStrem {

	public static void main(String[] args) {
//		1.파일경로 지정
		String aa = "c:\\temp\\test.txt";
//		2.경로가 담긴 변수생성
		OutputStream os = null;
		try {
			os = new FileOutputStream(aa);
			String data = "김치찌개/ㅋㅋㅋㅋ/감자탕";
			byte[] datas = data.getBytes();
			os.write(datas, 0, datas.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


		}
		
		String aa2 = "c:\\temp\\test2.txt";
		
		try(
				OutputStream os2 = new FileOutputStream(aa2);
		){
			String data = "나는 킁왕이입니다.";
			int BUF =3;
//			byte[] datas = new byte[BUF]; 내일 물어보기
//			만약에 두개다 사용할경우 한쪽에 변수명을 변경하고 다른방법으로 해야됨
			byte[] datas = data.getBytes();
			
			os2.write(datas, 0 , datas.length);
			os2.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
