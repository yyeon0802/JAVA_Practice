package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=========지하철 요금계산========");
		System.out.print("정거장 수 입력 : ");
		int station = scan.nextInt();
		int fee = 600;
		
		if	(station <= 5) {
			fee = 500;
		}
		else if	(station >= 6 && station <= 10) {
			fee = 600;
		}
		else if	 (station > 10) {
			int plStation = station - 10;
			if	(plStation % 2 == 1) {
				plStation += 1;
			}			
			fee = fee + (plStation / 2 * 50);// 2정거장이 1정거장 +50원
		}		
		System.out.println("요금 : " + fee + "원");
		
		scan.close();
		
	}

}