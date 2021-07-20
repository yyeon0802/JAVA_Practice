package step1_03.operator;

/*
 * #논리 연산자
 *		&&  and : 양쪽 모두 참이어야 최종적으로 참 true
 *					ex) 무주택세대주 이어야 '하고' 연봉 3400미만이어야 한다			
 *
 * 		|| or : 둘 중 한쪽만 참이면 최종적으로 참 true 버티컬바 엔터위에있다.
 * 					ex) 무주택세대주 이어야 '이거나' 연봉 3400미만이어야 한다	 
 * 		! not : 부정 true > false,   false > true
 * 
 * 		[ 중 요 ]
 * 			- 논리 연산자의 결과도 참true 또는 거짓false 이다.
 * 
 */

public class OperatorEx03 {

	public static void main(String[] args) {
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);

		System.out.println();
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		
		System.out.println();
		System.out.println( !(10 == 10));
		System.out.println( !(10 != 10));
		
	}

}