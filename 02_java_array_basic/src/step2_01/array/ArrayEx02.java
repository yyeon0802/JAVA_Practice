package step2_01.array;

public class ArrayEx02 {

	public static void main(String[] args) {

		// 배열 생성 및 값 대입 예시 1)
		int[] arr1 = new int[3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		//  배열 생성 및 값 대입 예시 2)
		int[] arr2 = { 10,20,30 }; // 축약형, 배열 처음 생성할 때만 가능
		// arr2 = {100,200,300}  error
		
		//  배열 생성 및 값 대입 예시 3)
		
		int[] arr3 = new int[3];
		for ( int i = 0; i < arr3.length; i++ ) {
			arr3[i] = ( i + 1 ) * 10;
		}
	}

}