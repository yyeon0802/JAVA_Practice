package step6_02.method;


class Ex11{
	
	int test1(int[] arr) { 
		
		int tot = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			tot += arr[i];
		}
		
		return tot; }
	
	int test2(int[] arr) { 
		
		int tot4 = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			if ( arr[i] % 4 == 0 ) {
				tot4 += arr[i];
			}
		}
		
		return tot4; }
	
	int test3(int[] arr) { 
		
		int cnt4 = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			if ( arr[i] % 4 == 0 ) {
				cnt4++;
			}
		}
		
		return cnt4; }
	
	int test4(int[] arr) { 
		
		int cnt2 = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			if ( arr[i] % 2 == 0 ) {
				cnt2++;
			}
		}
		
		return cnt2; }

}


public class MethodEx11 {

	public static void main(String[] args) {

			Ex11 e = new Ex11();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) 전체 합 리턴
			int tot = e.test1(arr);
			System.out.println("tot = " + tot);
			
			
			// 문제 2) 4의 배수의 합 리턴
			tot = e.test2(arr);
			System.out.println("tot = " + tot);
			
			
			
			// 문제 3) 4의 배수의 개수 리턴
			int cnt = e.test3(arr);
			System.out.println("cnt = " + cnt);
			
			
			
			// 문제 4) 짝수의 개수 리턴
			cnt = e.test4(arr);
			System.out.println("cnt = " + cnt);

	}

}