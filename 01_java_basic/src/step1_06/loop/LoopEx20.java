package step1_06.loop;

import java.util.Scanner;

/*
 * # 보조 제어문
 * 
 * 1. break 		: break를 만나는 순간 반복문 즉시 종료
 * 
 * 2. continue		: continue를 만나는 순간 반복문을 조건식으로 점프한다.(반복문 = 분기문)
 */

public class LoopEx20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = 0;
		System.out.println("반복문 시작");
		while ( true ) {
			System.out.print(i + " ");
			i++;			
			
			if ( i == 7) {
				break;
			}
			
		}
		System.out.println("반복문 종료");
		
		System.out.println();
		
		i = 0;
		while ( i < 10 ) {
			
			i++; //위치중요
			
			if ( i == 3 || i == 5 || i == 7 ) {
				continue; //jump한다와 유사 위치 중요 
			}
			System.out.println(i);
		}
		System.out.println("반복문 종료");
		
		
		// continue 사용예제

					

				while (true) {
	

					System.out.println("1. 햄버거");

					System.out.println("2. 콜라");

					System.out.println("3. 감자");

					

					System.out.print("#메뉴입력 : ");

					int getMenu = scan.nextInt();

					

					if (getMenu != 1 && getMenu !=2  && getMenu != 3) {

						System.out.println("1~3번 중에 선택하세요.");

						continue; // 1~3번이 아니면 넘어가지 X 456은 누르면 안 됨

					}

					

					if      (getMenu == 1) System.out.println("햄버거");

					else if (getMenu == 2) System.out.println("콜라");

					else if (getMenu == 3) System.out.println("감자");

					

					System.out.print("#현금 투입 :");
					int getMoney = scan.nextInt();

					

				}
				
	}

}