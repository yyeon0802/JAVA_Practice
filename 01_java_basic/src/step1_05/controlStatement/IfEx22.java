package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/* 
 * 20201215 20:53 
 * 
 * 
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("=====가위 바위 보 하나빼기=====");
		System.out.println();
		
		System.out.println(">>>>>>> 가위 바위 보 !");
		
		System.out.print("[me] 오른손 0)가위 1)바위 2)보 입력 : ");
		int meRight = scan.nextInt();
		
		System.out.print("[me] 왼손 0)가위 1)바위 2)보 입력 : ");
		int meLeft = scan.nextInt();
		
		System.out.println("[me] 오른손 : " + meRight );
		System.out.println("[me] 왼손 : " + meLeft);
		System.out.println();
		
		int comRight = ran.nextInt(3);
		int comLeft = ran.nextInt(3);
		int comFinal = 0;
		
		if (comRight == 0) {
			System.out.println("[com] 오른손 : 0)가위");
			comFinal = 1;
		}
		else if (comRight == 1) {
			System.out.println("[com] 오른손 : 1)바위");
			comFinal = 1;
		}
		else if (comRight == 2) {
			System.out.println("[com] 오른손 : 2)보");
			comFinal = 1;
		}
		
		if (comLeft == 0) {
			System.out.println("[com] 왼손 : 0)가위");
			comFinal = 2;
		}
		else if (comLeft == 1) {
			System.out.println("[com] 왼손 : 1)바위");
			comFinal = 2;
		}
		else if (comLeft == 2) {
			System.out.println("[com] 왼손 : 2)보");
			comFinal = 2;
		}
		System.out.println();
		System.out.println(">>>>>>> 하나빼기 ! ");
		System.out.print("[me] 하나빼기 입력 1)오른손 2)왼손 : ");
		int meFinal = scan.nextInt();
		
		if (meFinal == 1) {
			meFinal = meRight;			
		}
		else if (meFinal == 2) {
			meFinal = meLeft;
		}
		
		System.out.println();
		
		comFinal = ran.nextInt(2) + 1;

		if (comFinal == 1) {
			System.out.println("[com] 오른손 : " + comRight);
			comFinal = comRight;
		}
		else if (comFinal == 2) {
			System.out.println("[com] 왼손 : " + comLeft);
			comFinal = comLeft;
		}
		System.out.println();
		
		System.out.println(">>>>>>> 결과");
		
		if (meFinal == comFinal) {
			System.out.println("[me] [com] 비김");
		}
		else if (meFinal == 0 && comFinal == 2) {
			System.out.println("[me] 이겼다 !");
		}
		else if (meFinal == 1 && comFinal == 0) {
			System.out.println("[me] 이겼다 !");
		}
		else if (meFinal == 2 && comFinal == 1) {
			System.out.println("[me] 이겼다 !");
		}
		else	{
			System.out.println("[me] 졌다.");
		}				
		
		scan.close();

	}

}