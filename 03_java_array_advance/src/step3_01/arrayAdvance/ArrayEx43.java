package step3_01.arrayAdvance;
import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCnt = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽 설치
		System.out.print(">>> 설치할 벽 갯수 ? : ");
		wallCnt = scan.nextInt();
		
		int temp = wallCnt;
		while ( temp != 0 ) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if ( map[rY][rX] == 0 ) {
				map[rY][rX] = WALL;
				temp--;
			}			
		}
				
		// 공 설치
		
		while ( true ) {
			int rY = ran.nextInt(SIZE-2) + 1;
			int rX = ran.nextInt(SIZE-2) + 1;
			
			if ( map[rY][rX] == 0 ) {
				map[rY][rX] = BALL;	
				ballY = rY;
				ballX = rX;
				break;
			}
		}		
		
		// 골대 설치
		
		while ( true ) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if ( map[rY][rX] == 0 ) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		
		// 화면 출력
		System.out.println();
		for ( int i = 0; i < SIZE; i++ ) {
			for ( int j = 0; j < SIZE; j++ ) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 플레이어 배치
		
		while ( true ) {
			System.out.print(">>>플레이어 Y좌표 입력 : ");
			pY = scan.nextInt();
			System.out.print(">>>플레이어 X좌표 입력 : ");
			pX = scan.nextInt();
			
			if ( map[pY][pX] == 0 ) {
				map[pY][pX] = PLAYER;
				break;
			}			
		}
		
		// 게임 시작
		
		while ( true ) {
			
			System.out.println("--------------------");
			 for ( int i = 0; i < SIZE; i++ ) {
				 for ( int j = 0; j < SIZE; j++ ) {
					 if			( map[i][j] == PLAYER ) System.out.print("옷 ");
					 else if	( map[i][j] == BALL ) System.out.print("공 ");
					 else if	( map[i][j] == GOAL ) System.out.print("골 ");
					 else if	( map[i][j] == WALL ) System.out.print("벽 ");
					 else		System.out.print(map[i][j] + "  ");
				 }
				 System.out.println();
			 }			
			System.out.println("--------------------");
			
			if ( ballY == goalY &&  ballX == goalX  ) {
				System.out.println(">>>골인 [게임종료]");
				break;
			}
			
			System.out.print(">>>[이동] 1)상 2)하 3)좌 4)우 입력 : ");
			int move = scan.nextInt();
			
			int yy = pY;
			int xx = pX;
			
			if ( move == 1 ) yy--;
			else if ( move == 2 ) yy++;
			else if ( move == 3 ) xx--;
			else if ( move == 4 ) xx++;
			
			if ( yy < 0 || yy >= SIZE ) continue;
			if ( xx < 0 || xx >= SIZE ) continue;
			if ( map[yy][xx] != 0 && map[yy][xx] != BALL ) continue; //벽
				
			// 공이동
			
			if ( map[yy][xx] == map[ballY][ballX] ) {
				
				int yyy = ballY;
				int xxx = ballX;
				
				if ( move == 1 ) yyy--;
				else if ( move == 2 ) yyy++;
				else if ( move == 3 ) xxx--;
				else if ( move == 4 ) xxx++;
				
				if ( yyy < 0 && yyy >= SIZE ) continue;
				if ( xxx < 0 && xxx >= SIZE ) continue;
				if ( map[yyy][xxx] != 0 && map[yyy][xxx] != GOAL ) continue;
				
				map[ballY][ballX] = 0;
				ballY = yyy;
				ballX = xxx;
				map[ballY][ballX] = BALL;
			
			}
			
			// 플레이어 이동
			
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
		}

		scan.close();
		
	}

}