package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */
import java.util.Scanner;

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex08 e = new Ex08();
		
		while ( true ) {
			
			int player = 0;
			
			for ( int i = 0; i < e.game.length; i++ ) {
				System.out.print(e.game[i] + " ");
			}
			
			System.out.println();
			System.out.println("================================");

			System.out.print(">>> player[2] 이동 1)왼쪽 2)오른쪽 : ");
			int move = scan.nextInt();
			
			if ( move == 1 ) {
				for ( int i = 0; i < e.game.length; i++ ) {
					if ( e.game[i] == 2 ) {
						player = i;
					}
				}
				
				if ( player - 1 < 0 ) {
					System.out.println(">>>더이상 왼쪽이동 불가");
					continue;
				}
				
				if ( e.game[player - 1] == 1 ) {
					System.out.print(">>> 벽[1] 격파 3) : ");
					int power = scan.nextInt();										
				}
				
				e.game[player] = 0;
				e.game[player - 1] = 2;
			
			}
			
			if ( move == 2 ) {
				
				for ( int i = 0; i < e.game.length; i++ ) {
					if ( e.game[i] == 2 ) {
						player = i;
					}
				}
				
				if ( player + 1 > 7 ) {
					System.out.println(">>>더이상 오른쪽이동 불가");
					continue;
				}
				
				if ( e.game[player + 1] == 1 ) {
					System.out.print(">>> 벽[1] 격파 3) : ");
					int power = scan.nextInt();										
				}
				
				e.game[player] = 0;
				e.game[player + 1] = 2;

			}
			
		}		
	}

}