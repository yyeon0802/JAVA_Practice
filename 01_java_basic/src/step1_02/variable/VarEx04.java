package step1_02.variable;
/*
 * # 상수(constant) : 바뀌어서는 안되는 값 
 * 					: 고정하는 값 
 * 					: 전체를 대문자로 표기
 * 
 * 
 */

public class VarEx04 {

	public static void main(String[] args) {
		
		//변수		
		int ceilingValue = 100;
		ceilingValue = 999;		//변경가능
		
		//상수
		final int CEILING_VALUE = 100;	//변경 불가능
		// CEILING_VALUE = 999;
	}

}