package uqiz;

import java.util.ArrayList;

public class PokeLeague {

	
	ArrayList �̸� = new ArrayList();
	
	//�̱������� ���ϸ� �̸��� �Ӽ��� �ԷµǸ� �迭�� ����
	void sosoreague(Pokemon x) {
		�̸�.add(x);
		

		
	}
	void print() {
		for(int i = 0 ; i < �̸�.size() ; i++) {
			System.out.println("�̸�"+�̸�.get(i).type);
			
		
	}
	}
	
}
