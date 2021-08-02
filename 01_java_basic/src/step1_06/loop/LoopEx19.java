package step1_06.loop;

/*
 * # do while문
 * 
 * [ 형식 ]
 * 
 * do {
 * 	   반복할 명령어;
 * } while ( 조건식 );
 * 
 * 
 * 1. while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
 * 		( while    : 반복 조건식을 먼저 검사 )
 * 		( do~while : 일단 한번 실행한 후 반복조건을 검사 )
 * 
 * 2. while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다.
 *  
 * */

import java.util.Scanner;

public class LoopEx19 {

	public static void main(String[] args) {
		
		/*
		while (조건식) {
			
		}
		
		do {
			
		} while(조건식);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int tempData = 0;
		
		do {//조건이 안맞아도 일단 진입 후 실행
			
			System.out.print(" # 1~3) 사이의 숫자 입력 : ");
			tempData = scan.nextInt();
			
		} while ( tempData > 0 && tempData < 4 );
		
		tempData = 0; 
		while ( tempData > 0 && tempData < 4 ) {
			System.out.print(" # 1~3) 사이의 숫자 입력 : ");
			tempData = scan.nextInt();

		}
		
		scan.close();
	}

}