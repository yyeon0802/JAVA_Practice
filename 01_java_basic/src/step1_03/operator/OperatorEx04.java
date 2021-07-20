package step1_03.operator;

/*
 * # 증감 연산자
 * 
 * += , -= , *= , /= , %= , ++ , --
 * 
 */

public class OperatorEx04 {

	public static void main(String[] args) {
		int tempData1 = 100;
		tempData1 -= 3;   // tempData1 = tempData1 - 3;
		System.out.println(tempData1);
		
		int tempData2 = 10;
		tempData2 += 100 ; // tempData2 = tempData2 + 100;
		System.out.println(tempData2);

		int tempData3 =10;
		tempData3 %= 3; // tempData3 = tempData3 % 3;
		System.out.println(tempData3);
		
		System.out.println();
		
		int tempX = 0;
		tempX++; // tempX = tempX + 1, tempX += 1; +1만 한다
		++tempX; // tempX = tempX + 1, tempX += 1;
		System.out.println(tempX);
		System.out.println();
		
		/*
		 * 변수++; 
		 * ++변수; 의 차이점
		 *		  
		 */
		
		int x = 0 ;
		System.out.println(x++); //println 작업 후 x를 더함(올림)
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(++y); // y를 더하고(올리고) println 작업을 한다.
		System.out.println(y);
		System.out.println();
		
		
		int tempY =10 ; // - 도 가능 
		tempY--;
		--tempY;
		System.out.println(tempY); 
		
		
	}

}