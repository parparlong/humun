package uqiz;

public class PokemonExam {
//  ���ϸ� ���ϸ󸮱� ���ϸ��̱���
//  ���ϸ󿡴� �̸��� Ÿ�Ը� ����
//  ���ϸ󸮱׿��� ���ϸ���� �����ϴ� ��̸���Ʈ
//  ���ϸ��߰��޼ҵ� �������ڷ� ���ϸ��� �޴´�
//  ���ϸ� ����޼ҵ�� ����Ǿ��ִ� �̸��� Ÿ���� ������ ��� �����ش�
//  ���ϸ� ���ο��� 
//  �ϴ� ���ϸ� ���� ����
//  ���ϸ� �����ϰ� �̸��� Ÿ�� ����
//  ���ϸ� ���׿� �߰�
//  ���ϸ� ����޼ҵ带 �����ؼ� ���� �߰��Ѱ� �ٺ���

	public static void main(String[] args) {
		Pokemon	poket = new Pokemon();
		
		poket.name = "�ǵ�����";
		poket.type = "����";
		PokeLeague leageue = new PokeLeague();
		System.out.println("���׸������մϴ�");
		System.out.println("�߰��� ���ϸ��� �����ϼ���");
		leageue.sosoreague(poket);
		leageue.print();
		System.out.println("���׸� �������� ������ ������ �������ּ���?");
		
		
	}

}
