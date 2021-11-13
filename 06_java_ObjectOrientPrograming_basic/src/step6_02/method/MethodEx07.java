package step6_02.method;


class Ex07 {
	
	void printEvenOrOdd(int x) {
		
		if ( x != 0 ) {
			
			if ( x % 2 == 0 ) {
				System.out.println( x + " : 짝수");
			}
			else if ( x % 2 == 1 ) {
				System.out.println( x + " : 홀수");
			}
		
		}
		
		else if ( x == 0 ) {
			System.out.println(" 0  이다. ");
		}
		
	}
	
	
	void sumBetweenValues(int x, int y) {
		
		int tot = 0; 
		
		for ( int i = x; i <= y; i++ ) {
			tot += i;
		}
	
		System.out.println( x + " 부터 " + y +" 까지 합 : " + tot);
	}

	void printPrimeNums(int primeNumber) {
		
		//소수 1과 자신만으로 나누어지는 수 
		
		for ( int i = 2; i <= primeNumber; i++ ) {
			int cnt = 0 ;
			for ( int j = 1; j <= i; j++ ) {
				if ( i % j == 0 ) {
					cnt++;
				}
			}
			
			if ( cnt == 2 ) {
				System.out.print(i + " ");
			}
		 }		
		
	}
}


public class MethodEx07 {

	public static void main(String[] args) {
		
			Ex07 e = new Ex07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.sumBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);

	}

}