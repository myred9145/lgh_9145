package day1;

import java.util.Scanner;

public class day01_3 {
	
	//main�޼ҵ�(�Լ�)
	public static void main(String[] args) {
		
		//��� Ŭ���� : system
		System.out.println("�Է� : ");// ��� �޼ҵ� ȣ��
		//�Է� Ŭ���� : scanner ��ü : Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ����
		//1.Ű����κ��� �Է¹��� 
		Scanner scanner = new Scanner(System.in);
		// ��ü : Ŭ���� ������� ������ �޸� ����
		// ��ü ���� : Ŭ������ ��ü��[����]= new ������( )
		// new : �޸� �Ҵ� ������
		// system.out : ���
		// system.in : �Է�
		// ��ü���� ��������
		// .next() : ��ü�� ����� ���ڿ� ȣ��
		// .nextlnt() : ��ü�� ����� ���� ȣ��
		// .nextLine() : ��ü�� ����� ���ڿ� ȣ��[����o]
		String String1 = scanner.next();
		// ��ü�� ����� �Է°��� ������ ����
		System.out.println("�Էµ� ���ڿ���: "+String1);
		
		System.out.print("�Է�2 : ");
		//�ι�° �Է°� ��������
		String string2 = scanner.next();
		//���
		System.out.println("�Էµ� �ι�° ���ڿ��� : " +string2);
	}
	

}
