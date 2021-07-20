package step1_02.variable;

/*
 * # 변수 variable
 * 		- 단 하나의 값을 저장 할 수 있는 메모리 공간
 * 		
 * 	1) 변수의 선언 그리고 초기화
 * 		변수의 선언 : 자료형 변수명; > 메모리 공간 할당
 * 			ex) int nData;
 * 		변수의 초기화 : nData = 0; > 최초값 저장
 * 
 * 	2) 변수의 선언과 동시에 초기화
 * 		int nData = 0;
 *
 *	3) 변수의 특징
 *		3-1) 변수는 하나당 값 한개만 저장 [고유성]
 *		3-2) 새로운 값이 변수에 저장되면 이전값은 사라짐
 * 
 */
public class VarEx01 {

	public static void main(String[] args) {
		
		// 1. 정수 integer (int)
		int nData;  // 변수 선언 int integer:숫자 정수
		nData = 10; // 변수에 값 저장 
		System.out.println(nData); // 확인
		
		// 메모리 주소 표기 > 16진수 > 0~9 a~f 사용 0 9 abcdef
		// 0x1f3cad2 > nData1 = 10;
		
		// 2. 실수 : double
		double fData = 3.14;
		System.out.println(fData);
		
		//3. 문자 1개 : character(char)
		char cData1 = 'a';
		char cData2 = '가'; //자바는 한글도 1글자로 인정
		System.out.println(cData1);
		System.out.println(cData2);
		
		//4. 문자열 : String 대문자 S시작
		String strData = "java";
		System.out.println(strData);
		
		//5. 참과 거짓 : boolean
		boolean isChecked = true; // true or false
		System.out.println(isChecked);
		
		int tempData = 10;
		//int tempData = 9; // > error 변수명은 고유해야 된다.
		
		tempData = 9;
		tempData = 7;
		System.out.println(tempData); // 최근값만 저장

	}

}