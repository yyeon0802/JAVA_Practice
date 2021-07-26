package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx21 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum1 = ran.nextInt(9) + 1;
		int rNum2 = ran.nextInt(9) + 1;
		int operNum = ran.nextInt(3) + 1;
		int answer = 0;
		
		if	(operNum == 1) {
			answer = rNum1 + rNum2;
		}
		else if	(operNum == 2) {
			answer = rNum1 - rNum2;
		}
		else if	(operNum == 3) {
			answer = rNum1 * rNum2;
		}
		else if	(operNum == 4) {
			answer = rNum1 % rNum2;
		}
		System.out.println("치트키 : " + operNum);
		System.out.println();
		System.out.println("=====연산자 맞추기====");
		System.out.println(">>>>문제");
		System.out.println(rNum1 + " ? "+ rNum2 + " = " + answer );
		System.out.print("[me] 정답은 ? 1) 덧셈 2) 뺼셈 3) 곱셈 4) 나머지 : ");
		int myAnswer = scan.nextInt();
		
		if	(operNum == myAnswer) {
			System.out.println("정답 !");
		}
		else	{
			System.out.println("땡");
		}
		
		scan.close();
		
	}

}