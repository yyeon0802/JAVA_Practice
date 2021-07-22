package step1_04.inputFunction;

import java.util.Scanner;

/*
 * # 콘솔에 키보드로 입력받기
 * 
 * [ 순서 중요 ] 
 * 
 * 1) import java.util.Scanner; 				// Scanner 클래스를 불러온다.
 * 2) Scanner scan = new Scanner(System.in);  	//	scan 객체를 생성한다.
 * 3) System.out.println("나이입력");			// 안내문을 작성한다.
 * 4) scan.nextInt();							// 키보드로 입력받는다.
 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다.
 * 
 */

public class InputEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// 시작할때 코드의 맨 윗줄에서 한번 생성하면 됨.
		// nextInt()를 여러번 사용하기 위해 여러번 생성할 필요가 없다.
		
		System.out.println("# 나이를 입력하시오 : ");
		int getAge = scan.nextInt(); //숫자전용 숫자만 입력가능
		
		System.out.println("입력하신 나이는 " + getAge + "살 입니다.");
		System.out.println("내년 나이는 " + (getAge + 1) + "살 입니다.");
		System.out.println("10년 뒤 나이는 " + (getAge + 10) + "살 입니다.");
		
		System.out.println();
		
		System.out.print("# 나이를 입력하시오 : ");
		getAge = scan.nextInt(); //숫자전용 숫자만 넣음
		
		System.out.println("입력하신 나이는 " + getAge + "살 입니다.");
		System.out.println("내년 나이는 " + (getAge + 1) + "살 입니다.");
		System.out.println("10년 뒤 나이는 " + (getAge + 10) + "살 입니다.");
		
		scan.close(); //close()는 코드의 맨마지막에 작성(중간에 X)
		

	}

}