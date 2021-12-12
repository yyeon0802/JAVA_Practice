package step7_01.classArray;

import java.util.ArrayList;
import java.util.Arrays;

// # 배열과 어레이리스트의 비교

public class ClassArrayEx19_2 {

	public static void main(String[] args) {

		//1) 생성
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int[] arr = new int[10];
	
		
		//2) 데이터 추가
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		//3) 크기
		System.out.println(arrList.size());
		System.out.println(arr.length);
		System.out.println();
		
		
		//4) 데이터 접근
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		
		//5) 데이터 수정
		arrList.set(0, 100);
		arrList.set(1, 200);
		arrList.set(2, 300);
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		
		//6) 전체 데이터 조회
		System.out.println(arrList);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		//7) 요소 삭제
		arrList.remove(0);
		arrList.remove(0);
		
		arr[0] = 0;
		arr[1] = 0;
		System.out.println(arrList);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		//8) 자료 전체 삭제
		arrList.clear();
		arr = null;
		
		
	}

}