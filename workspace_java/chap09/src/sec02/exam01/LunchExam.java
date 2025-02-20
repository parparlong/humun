package sec02.exam01;

public class LunchExam {

	public static void main(String[] args) {
		Lunch lunch = new LunchImpl();
		lunch.order(null);

		Lunch lunch2 = new Lunch() {

			@Override
			public void order(String menu) {
				// TODO Auto-generated method stub
				
			}
	
		};

}
}