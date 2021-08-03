package step2_01.array;

/*
 * # 배열 기본문제
 */


public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for (int i=0; i<5; i++) {
			arr[i] = 10 * (i+1); 
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		
		
		// 문제2) 4의 배수만 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답2) 20 40
		
		for (int i=0; i<5; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i] +" ");
			}
		}
		System.out.println("\n");
		
		
		
		// 문제3) 4의 배수의 합 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답3) 60
		
		int result = 0;
		for (int i=0; i<5; i++) {
			if (arr[i] % 4 == 0) {
				result += arr[i];
			}
		}
		System.out.println(result + "\n");
		
		
		
		// 문제4) 4의 배수의 개수 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답4) 2
		
		result = 0;
		for (int i=0; i<5; i++) {
			if (arr[i] % 4 == 0) {
				result++;
			}
		}
		System.out.println(result + "\n");
		
		
		
		// 문제5) 짝수의 개수 출력 [ 1번에서 생성한 배열 사용 ]
		// 정답5) 5
		
		result = 0;
		for (int i=0; i<5; i++) {
			if (arr[i] % 2 == 0) {
				result++;
			}
		}
		System.out.println(result + "\n");
		
		
	}
	
}