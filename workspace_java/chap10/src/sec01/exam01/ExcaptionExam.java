package sec01.exam01;

public class ExcaptionExam {

	public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		int a= 10;
		String b = "100asd";
		try {
			a = Integer.parseInt(b);
			Class clazz = Class.forName("java.lang.String2");
			
			System.out.println("이게 출력된다는건 위에 예외가 없었다");
//		} catch(Exception e) { 모든 익셉션 적용 
		} catch(NumberFormatException e) {			
			System.out.println("catch블럭");
			System.out.println("---------------");
			System.out.println(e.getMessage());
			System.out.println("---------------");
			System.out.println(a);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (NumberFormatException | ClassNotFoundException e) {
		}finally {
			System.out.println("finally는 무조건 실행");	
		}
		System.out.println("end");
		
	}

}
