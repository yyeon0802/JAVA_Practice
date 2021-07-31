package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		
		int i = 1;
		while ( i <= 3) {
			System.out.print("숫자 " + i + "번 입력 : ");
			int getNum = scan.nextInt();
			
			if	( maxNum < getNum) {
				maxNum = getNum;
			}
			i++;
		}
		System.out.println();
		System.out.println("입력값 중 최대값은 ? ");
		System.out.println(">>>>>>" + maxNum);

	}

}