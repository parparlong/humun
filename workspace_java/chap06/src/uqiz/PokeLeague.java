package uqiz;

import java.util.ArrayList;
import java.util.Random;

public class PokeLeague {

	
	
/*	ArrayList<Pokemon> �̸� = new ArrayList<>();

	
     void sosoreague(String Name, String Type, int Num) {
		//���ϸ󿡼� ��µǴ� ���� ������� �迭���·� ���� 
		Pokemon newPokemon = new Pokemon(Name,Type,Num);
		
		�̸�.add(newPokemon);
		
	}
     
	//�̱����� ��� 
	void print() {
		for(Pokemon pokemon : �̸� ) {
			System.out.println("�̸� :"+pokemon.getName() + "  \t  Ÿ��:"+pokemon.getType() + "  \t  ��ȣ:"+pokemon.getNum());
		}
		System.out.println("������ ���ϸ� 3���� ���������� ");
		
	}
	//������ ���ϸ� ���� 3���� ��������� �������ϳ�?
	//����? ����? ���� ���� 
	//�������� ������ ���� �迭���� 3������ �����´� 
	//�������¹�� �������� 3���� ���� > �����Լ��� ����Ͽ� 1~ 8����  
	void poketmonsam () {
		Random random = new Random();
		//���� �����Լ� 3�̳����� 3��° �׾�ŷ�� ��� 
//		System.out.println(�̸�.size());
		for(int i = 0 ; i< 3;i ++) {
			int randomInt = (random .nextInt(8))+1;
			System.out.println(randomInt);
			if(randomInt == pokemon.getNum() ) {
				
			}
		}
		
	}*/

	String name=null;
	ArrayList list = new ArrayList();
	
	PokeLeague(String name){
		System.out.println("name :"+ name + "����");
		this.name = name;
	}
	
	void add(Pokemon p) {
		this.list.add(p);
		
	}
	
	void print() {
		System.out.println("------------");
		System.out.println(this.name + "���� ���� ���ϸ�");
		for(int i=0; i<list.size(); i++) {
			System.out.println("�̸� : "+list.get(i));
			//����ȯ�� ���ϸ� object���� �������ִ�
			Pokemon p = (Pokemon)list.get(i);
			System.out.println(p);
			System.out.println("�̸� : "+p.name);
			System.out.println("Ÿ�� : "+p.type);
			System.out.println();
		}
	}
	
}	
	
	
	
	
	
	
	
	
	

