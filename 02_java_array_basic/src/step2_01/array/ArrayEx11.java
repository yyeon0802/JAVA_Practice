package step2_01.array;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
*  예)
 * 랜덤숫자 : 1
 * check = {true , false , true , true , true}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {true , false , true , false , true}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {true , false , false , false , true}
 * arr   = {1, 3, 2, 0, 0}
 */

public class ArrayEx11 {

	public static void main(String[] args) {
	
		Random ran = new Random(); 
		
		boolean[] check  = new boolean[5];
		int[] arr        = new int[5];
		int getRandomInt = 0;
		int idx          = 0;
		
		while (idx<5) {
			
			getRandomInt = ran.nextInt(5);
			
			if (check[getRandomInt] == false) {
				check[getRandomInt] = true;
				arr[idx++] = getRandomInt;
			} 
			
		}

		System.out.print("arr : ");
		for (int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");			
		}
		
		
	}
	
}