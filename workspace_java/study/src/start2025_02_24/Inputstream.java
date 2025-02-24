package start2025_02_24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Inputstream {

	public static void main(String[] args) {
		String aa = "c:\\temp\\test2.txt";
		
		try(
				InputStream is = new FileInputStream(aa);
		) {
			int BUF = 4;
			byte[] datas = new byte[BUF];
			int result = 0;
			String data = "";
			//--------------------------------
			//--------------------------------
			//이코드는 한번만 가져온다
		
//			int BUF = 30;
//			byte[] datas = new byte[BUF];
//			int result = 0;
//			String data = "";
//			result = is.read(datas);
//			System.out.println(is.read(datas));
//			
//			data += new String(datas, 0, result);
//			while(result != -1) {
//				result = is.read(datas);
//				if(result != -1) {
//					data += new String (datas, 0 ,result);
//				}
//			}
			
			//---------------------------------------
			System.out.println(data);
			while((result = is.read(datas)) != -1) {
				data += new String(datas, 0 , result );
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
