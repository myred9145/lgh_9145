package day1;

import java.util.Scanner;

public class day01_6 {
	public static void main(String[] args) {// m s
		Scanner �Է°�ü = new Scanner(System.in);
		System.out.print(" �ۼ��� : "); String writer = �Է°�ü.next();
		�Է°�ü.nextLine(); // next �������� nextline ���� ���� �߻�
				//�ذ���
		System.out.print(" ���� : "); String contents = �Է°�ü.nextLine();
		System.out.print(" ��¥ : "); String date = �Է°�ü.next();
		
		System.out.println("-------------�湮��----------------");
		System.out.println("|����|�ۼ���|����|��¥|" );
		System.out.println("| 1 |"+writer+"|"+contents +"|"+date+"|");
	}// m e

}
