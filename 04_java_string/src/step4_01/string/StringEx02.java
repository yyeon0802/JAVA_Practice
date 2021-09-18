package step4_01.string;

import java.util.Scanner;

/*
 * 
 * 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */
public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "홍길동";
		
		System.out.print("이름 입력 : ");
		String myName = scan.next();
		
		// 비교 불가
		
		if ( name == myName ) {
			System.out.println("== 연산자 일치");
		}
		
		else {
			System.out.println("== 연산자 불일치");
		}
		
		
		// 비교 가능
		
		if ( name.equals(myName)) {
			System.out.println("equals 메소드 일치");
		}
		
		else {
			System.out.println("equals 메소드 불일치");
		}
		
		scan.close();

	}

}