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
package uqiz;



public class PokemonExam {

	public static void main(String[] args) {

		
		//1. �̸��� Ÿ���� �ִ°��� ���׿� �迭 ���·� �Է� �̸�:��ī�� Ÿ��:���� 
		Pokemon p1 = new Pokemon();
		p1.name = "�Ǳ���";
		p1.type = "õ��" ;
		
		Pokemon p2 = new Pokemon();
		p2.name = "���̸�";
		p2.type = "��" ;
		
		PokeLeague pl = new PokeLeague("����");
		pl.add(p1);
		pl.add(p2);
		pl.print();
		
		
		Pokemon p3 = new Pokemon();
		p3.name = "�ǵ�����";
		p3.type = "����" ;
		
		Pokemon p4 = new Pokemon();
		p4.name = "���α�";
		p4.type = "��" ;
		
		PokeLeague pa = new PokeLeague("�߹�");
		pa.add(p3);
		pa.add(p4);
		pa.print();
			
	}

}
