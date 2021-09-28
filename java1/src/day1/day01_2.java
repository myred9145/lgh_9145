package day1;

public class day01_2 { // c s
	
	// system.out.print() // main 없이 실행 불가
	//출력
	public static void main(String[] args) { // m s
		// 1. 출력
		// print(출력할 문구);  : 출력
		// println(출력할 문구); : 출력후 줄바꿈
		// printf(형식문자,출력문구); :
		// 제어문자 [p.34]
		// \ :엔터위에 
		//예1 : syso + ctrl+스페이스바
		 System.out.println("java");
		 System.out.println(1234); // 기계어 이기 때문에 숫자에는 문자처리 x
		 System.out.println("java10"); // 문자+숫자> 문자
		 // system : 미리 만들어진 시스템이라는 클래스
		 // out : 출력 스트림
		 // print(인수:출력하고 싶은말) : 출력 함수
		 // . : 클래스내 맴버(함수,변수)접근 연산자(특수문자)
		 // " " : 키워드,변수 등 제외한 모든 문자에는 문자처리
		 // ctrl+f11 : 컴파일
		 // ; : 한줄에 실행코드 끝 [일처리]
		 //
		 System.out.println("java");
		 System.out.println(12345);
		 System.out.println("java10");
		 System.out.printf("%s","java");
		 // printf 장점
		 System.out.printf
	("나이는 %d 입니다", 20);
		 
		 // 제어문자
		 
				 System.out.print("\t12345");
				 System.out.println("\rjava10");
				 
		 		// 문제1
				
			 System.out.println("\n\t\t[출석부]");
			 System.out.println("--------------------------------------"  );
			 System.out.println("이름\t1교시\t2교시\t3교시\t비고");
			 System.out.println("강호동\t출석\t결석\t출석");
			 System.out.println("유재석\t출석\t결석\t출석");
			 System.out.println("--------------------------------------"  );
			 
       //문제2 : 고양이
			 System.out.println("\\    /\\");
			 System.out.println(" )  ( ')");
			 System.out.println("(  /  )");
			System.out.println(" \\(__)|");
			//문제3 : 개
			System.out.println();
			System.out.println("  |\\_/|");
			System.out.println("  |q p|   /}");
			System.out.println("  ( 0 )\"\"\"\\");
			System.out.println("  |\"^\"`    |");
			System.out.println("  ||_/=\\\\__|");
			 
				 
				         
				  
		 
		 
		 
		 
		 
		 
	} // m e
	

} // c e
