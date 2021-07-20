package step1_03.operator;

/*
 * # 삼항 연산자
 * 
 * 	[ 형 식 ]
 * 	
 * 	조건식 ? 참일때의 결과값 : 거짓일 때의 결과 값;
 * 
 *  [연산자 우선순위] -> 구글검색, 지금은 괄호로 처리해라 
 *  
 * 
 * 
 */
public class OperatorEx05 {

	public static void main(String[] args) {
	
		int totalGrade = 60;
		System.out.println(totalGrade >= 60 ? "합격" : "불합격");
		System.out.println(totalGrade < 60 ? "합격" : "불합격");
		
		char result = totalGrade >= 60 ? 'p' : 'f';
		System.out.println(result);
		
		
	}

}