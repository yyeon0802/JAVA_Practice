package step6_02.method;

/*
 * 
 *  # 클래스의 구성요소
 *  
 *  [1] 변수
 *  [2] 메서드(method)
 * 
 * 	2-1) void : return 타입 (int,double,char,String,int[]....)
 * 	2-2) say  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  2-3) ()   : 입력인수
 *  2-4) {}   : 메서드의 영역
 *  
 * */


class MethodTest {
	
	String adder(int num1 , int num2) { // ()안에는 받을 것을 쓴다
		return "두 숫자의 합 : " + ( num1 + num2 ); // return으로 받을걸 맨앞에 
	}
	
	// method 정의(동사로명명 ex) deleteData
	void printMenu() { 
		System.out.println("=================");
		System.out.println("1) 로그인");
		System.out.println("2) 로그아웃");
		System.out.println("3) 정보조회");
		System.out.println("4) 정보수정");
		System.out.println("5) 종	료");
		System.out.println("=================");
		System.out.println();
		// return;  void일 때는 return을 생략함
		
	}
}

public class MethodEx01 {

	public static void main(String[] args) { //main도 method였다,,

		MethodTest m = new MethodTest();
		
		
		//method 호출
		m.printMenu();
		m.printMenu();
		m.printMenu();
		
	}

}