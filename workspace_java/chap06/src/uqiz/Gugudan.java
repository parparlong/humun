package uqiz;

public class Gugudan {
	
	//���޹��� ���ڿ� �ش��ϴ� �������� ��� 
	void sam(int x) {
		System.out.println(x+"��");
		for(int i=1;i<10;i++) {
			System.out.println(x+"x"+i+":"+x*i);
		}
	}
	
	
	void gugu(int x ,int y) {
		//sam��Ȱ��
		for(int i = x ; i <= y ; i++) {
			System.out.println(i+"��");
			sam(i);
		}
	}
	
	//�����ε�
	void gugu (int x) {
		gugu(x,9);
		
	}
	
	void gugu () {
		gugu(2,9);
		
	}
	
	
}
