package day1;

import java.util.Scanner;

public class day01_6 {
	public static void main(String[] args) {// m s
		Scanner 입력객체 = new Scanner(System.in);
		System.out.print(" 작성자 : "); String writer = 입력객체.next();
		입력객체.nextLine(); // next 다음으로 nextline 사용시 문제 발생
				//해결방법
		System.out.print(" 내용 : "); String contents = 입력객체.nextLine();
		System.out.print(" 날짜 : "); String date = 입력객체.next();
		
		System.out.println("-------------방문록----------------");
		System.out.println("|순번|작성자|내용|날짜|" );
		System.out.println("| 1 |"+writer+"|"+contents +"|"+date+"|");
	}// m e

}
