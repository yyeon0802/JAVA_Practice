package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 랜덤 라이브러리(if 관련 라이브러리 = 기능)
 * 	- 임의의 난수(=랜덤숫자)를 생성할 수 있다.
 *   
 */

public class IfEx11 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//0~9사이의 랜덤값 0부터 카운트
		int rNum1 = ran.nextInt(10);
		System.out.println(rNum1);
		
		// 100~200 사이의 랜덤값은?
		int rNum2 = ran.nextInt(101) + 100; // 0이 나오면 거기에 +100 해서 출력 [0~100] + 100 임
		System.out.println(rNum2);
		
		// -3 ~ 3 사이의 랜덤값
		int rNum3 = ran.nextInt(7) - 3; // [0~6] - 3
		System.out.println(rNum3);
		
		scan.close();

	}

}