package quiz;

public class PhonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsungphon ph = new Samsungphon();
		Iphone iph =  new Iphone();
		
		iph.store();
		iph.bell();
		iph.onOff();
		iph.onOff();
		iph.kakaocorp("카카오톡");
		System.out.println("===========");
		ph.store();
		ph.bell();
		ph.onOff();
		ph.onOff();
		ph.kakaocorp("카카오톡");

	}

}
