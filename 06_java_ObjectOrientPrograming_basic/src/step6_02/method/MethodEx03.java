package step6_02.method;

/*
 *  # return
 *  
 *  1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서 return값은 1개이다.
 *  
 */

class ReturnTest {
	
	void setScore1 ( int score1 ) {
		score1 = 100;
	}
	
	int setScore2 ( int aa ) {
		aa = 100;
		return aa;
	}
	
	int testReturn () {
		
		System.out.println("return 전 명령어 1");
		System.out.println("return 전 명령어 2");
		System.out.println("return 전 명령어 3");
		
		// return 1,2,3,4,5; -> 복수의 리턴값이 불가능 
		return 1; // 값을 반환 후 종료 한다.
		// if else 문에 여러번 쓰는것 가능 1개씩,,,
		
		
		/* 첫번째 return시에 함수가 종료되기때문에 이후 명령어가 실행될 수 없다.
		System.out.println("return 후 명령어 1");
		System.out.println("return 후 명령어 2");
		System.out.println("return 후 명령어 3");
		*/
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnTest obj = new ReturnTest();

		int score1 = 87;
		System.out.println("method호출 전의 성적 = " + score1 );
	
		obj.setScore1(score1);
		
		System.out.println("method호출 후의 성적 = " + score1 );
	
		System.out.println("==============================");
	
		int score2 = 87;
		System.out.println("method호출 전의 성적 = " + score2 );
		
		score2 = obj.setScore2(score2);
		
		System.out.println("method호출 후의 성적 = " + score2 );
	
	}

}