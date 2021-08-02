package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 속도설정 : 1~3까지만 가능
 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 */

public class LoopEx16 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 목적지(destination)
		int desX = ran.nextInt(20) - 10;
		int desY = ran.nextInt(20) - 10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		int dis = 0;
		
		boolean isRun = true;
		
		while(isRun) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.println();
				
				System.out.print("[방향] 1)동 2)서 3)남 4)북 번호입력 : ");
				dir = scan.nextInt();
				
				System.out.println();
			}
			
			else if (selectMenu == 2) {
				System.out.println();
				
				System.out.print("[속도] 1 ~ 3 입력 : ");
				speed = scan.nextInt();
				
				dis += speed;
				
				System.out.println();
			}
			
			else if (selectMenu == 3) {
				
				if ( dir == 1 ) {
					x += speed;					
				}
				
				else if ( dir == 2 ) {
					x -= speed;
				}
				
				else if ( dir == 3 ) {
					y -= speed;
				}
				
				else if ( dir == 4 ) {
					y += speed;
				}
				
				
				if ( x == desX && y == desY ) {
					
					System.out.println();
					System.out.println("[도착]");
					System.out.println(">>>> 이동거리 : " + dis);
					
					if ( dis % 2 == 0) {
						
						fee = (dis / 2 ) * 50;
						System.out.println(">>>> 총 요금 : " + fee + "원");
						
						isRun = false;
					}
					
					else if ( dis % 2 == 1) {
						
						dis++;
						fee = (dis / 2 ) * 50;
						System.out.println(">>>> 총 요금 : " + fee + "원");
						
						isRun = false;
					}					
				}
			}			
		}
		scan.close();
	}

}