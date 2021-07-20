package step1_02.variable;

/*
 * # 변수명명규칙 (이름 짓는 규칙)
 * 		1) 절대적 규칙
 * 			- 변수명 숫자 사용가능 하나 숫자로 시작할 수 없다.
 * 			- 변수명에 특수문자는 _ 와 $ 만 가능 달러도 거의 쓰지X
 * 			- 변수명에 띄어쓰기 사용 할 수 없다.
 * 			- 변수명에 예약어(키워드)를 사용할 수 없다.
 * 				ex) 자주색 글씨(public, int, class 등)
 * 			- 변수명은 대소문자가 구분된다.
 * 				ex) Abc 와 abc는 다르다.
 *  
 * 		2) 암묵적 규칙
 * 			- 변수명은 영어로 작성한다.
 * 			- 변수명은 소문자로 시작한다.(클래스이름은 대문자로 시작)
 * 			- 두 단어가 이어지는 경우 이어지는 단어의 첫글자는 대문자로 작성 -> camel case
 * 				ex) productCode, productName ->웹개발에서는 이렇게 많이 씀
 * 			- 두 단어가 이어지는 경우 _로 이어준다.
 * 				ex) product_code, product_name ->웹의 database에서 이렇게 씀
 *			- boolean 변수 앞에는 is 를 붙인다.
 *				ex) isRunning, isChecked
 *			- '제 3자'가 보아도 변수안에 어떤데이터가 있는지 '직관적'으로 알 수 있도록 변수명 설정하라 
 *				ex) a (절대안됨) , v(절대x) , productCode(o) , productName(o)
 *			- 상수명은 전부 대문자로 작성한다.
 *			- 상수명에서 두 단어가 이어지는 경우 _로 이어준다.
 * 
 */


public class VarEx03 {

	public static void main(String[] args) {
		
		// int 1num = 10; 
		// int test# = 10;
		// int void = 10;
		// int test var = 10; 띄어쓰기 x
		
//		int test = 1;
//		System.out.println(Test); 소문자로 만들어놓고 대문자로 함
	}

}