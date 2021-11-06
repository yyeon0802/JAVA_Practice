package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Random;
import java.util.Scanner;
class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}


public class ClassEx13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13 e = new Ex13();
		
		int[] tempFront = new int[e.SIZE];
		for ( int i = 0; i < e.SIZE; i++ ) {
			tempFront[i] = i+1;
		}
		
		int k = 10;
		int[] tempBack = new int[e.SIZE];
		for ( int i = 0; i < e.SIZE; i++ ) {
			tempBack[i] = k;
			k++;
		}
		
		for ( int i = 0; i < e.SIZE; i++ ) {
			int rIdx = ran.nextInt(9);
			e.front[i] = tempFront[rIdx];
			for ( int j = 0; j < i; j++ ) {
				if (e.front[i] == e.front[j] )
					i--;
			}			
		}
		
		for ( int i = 0; i < e.SIZE; i++ ) {
			int rIdx = ran.nextInt(9);
			e.back[i] = tempBack[rIdx];
			for ( int j = 0; j < i; j++ ) {
				if (e.back[i] == e.back[j] )
					i--;
			}			
		}
		
		int m = 0;
		int n = 0;
		while ( true ) {
			
			System.out.println("======= 1 to 18 =======");
			for ( int i = 0; i < e.SIZE; i++ ) {
				System.out.print(e.front[i] + "\t");
				if ( i % 3 == 2 ) {
					System.out.println();
				}
			}
			
			System.out.println();
			System.out.print("[ 0 ~ 8 ] 숫자 순서대로 위치 입력 : ");
			int getIdx = scan.nextInt();
			
			if ( e.front[getIdx] == n + 1 ) {
				if ( m <= 8 ) {					
					e.front[getIdx] = e.back[m];				
					n++;
					m++;
				}
				else if ( m > 8 ) {
					e.front[getIdx] = 0;
					n++;
				}
			}
			
			else {
				System.out.println("[메세지] 숫자순번이 맞지 X 다시 !");
				continue;
			}
			
			if ( n == 18  ) {
				System.out.println();
				System.out.println(">>>종료");
				break;
			}
		}
		
		
		
	}
}