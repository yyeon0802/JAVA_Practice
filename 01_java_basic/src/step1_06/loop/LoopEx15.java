package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int totScore = 0;
		int cnt = 0;
		int maxScore = 0;
		int winNum = 0;
		
		int i = 1;
		while ( i <= 10 ) {
			int score = ran.nextInt(100) + 1;
			totScore += score;
			
			if ( score >= 60 ) {
				cnt++;
			}
			
			if ( maxScore < score ) {
				maxScore = score;
				winNum = i;				
			}
			i++;
		}
		
		System.out.println("전교생(10명) 총점 : " + totScore + "점");
		System.out.println();
		
		System.out.println("총 합격자수 : " + cnt + "명");
		System.out.println();
		
		double avg = totScore / 10.0;
		System.out.println("전교생(10명)평균 : " + avg +"점");
		System.out.println();
		
		System.out.println("1등 : " + winNum +"번 / " + maxScore + "점");
	}

}