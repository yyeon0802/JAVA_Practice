package step4_01.string;

// 문자열 관련 형변환

public class StringEx04 {

	public static void main(String[] args) {
		
		// (구글에서 [아스키 코드 표] 검색 후 확인)
		

		// 문자 -> 숫자
		char ch = 'a'; //97 10진수 외워두면 좋음
		System.out.println((int)ch); 
		
		ch = 'A'; //65 10진수 외워두면 좋음
		System.out.println((int)ch); 
		
		System.out.println();
		
		// 숫자 -> 문자
		int n = 100;
		System.out.println((char)n);
		n = 77;
		System.out.println((char)n);
		System.out.println();
		
		// 1. 문자열 -> 숫자형 변환 2-1과 비슷하게 외워라
		int num = Integer.parseInt("10");
		
		// 2. 숫자 -> 문자열 변환
		// 2-1) 방법 1 : 숫자 + ""; 꼼수 은근 현장서도 사용 
		num = 777;
		String strNum = num + ""; // ""이거 붙여서 "777" 만들어줌
		
		// 2-2) 방법 2 : Integer.toString(숫자) 춫천
		strNum = Integer.toString(num); // 777이 "777"이 됨
		
		// 2-3) 방법 3 : String.valueOf(숫자)
		strNum = String.valueOf(num);
		
	}

}