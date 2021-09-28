package day1;

import java.util.Scanner;

public class day01_3 {
	
	//main메소드(함수)
	public static void main(String[] args) {
		
		//출력 클래스 : system
		System.out.println("입력 : ");// 출력 메소드 호출
		//입력 클래스 : scanner 객체 : 키보드로부터 입력받은 값을 메모리[저장장치] 객체 저장
		//1.키보드로부터 입력받은 
		Scanner scanner = new Scanner(System.in);
		// 객체 : 클래스 기반으로 생성된 메모리 공간
		// 객체 선언 : 클래스명 객체명[임의]= new 생성자( )
		// new : 메모리 할당 연산자
		// system.out : 출력
		// system.in : 입력
		// 객체에서 꺼내오기
		// .next() : 객체내 저장된 문자열 호출
		// .nextlnt() : 객체내 저장된 정수 호출
		// .nextLine() : 객체내 저장된 문자열 호출[띄어쓰기o]
		String String1 = scanner.next();
		// 객체내 저장된 입력값을 변수에 저장
		System.out.println("입력된 문자열은: "+String1);
		
		System.out.print("입력2 : ");
		//두번째 입력값 꺼내오기
		String string2 = scanner.next();
		//출력
		System.out.println("입력된 두번째 문자열은 : " +string2);
	}
	

}
