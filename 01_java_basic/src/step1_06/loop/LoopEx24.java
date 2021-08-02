package step1_06.loop;

/*
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx24 {

	public static void main(String[] args) {
		
		System.out.println("문1)");
		int i = 0;
		while ( i < 100 ) {
			if ( i % 9 == 0) {
				if ( i / 10 == 6) {
					System.out.println(i);
					break;  
				}
			}
			i++;
		}
		System.out.println();
		System.out.println("문2)");
		
		int maxUnder150 = 0;
		i = 0;
		while ( i < 150 ) {
			if ( i % 8 == 5 ) {
				if ( maxUnder150 < i) {
					maxUnder150 = i;
				}				
			}
			i++;
		}
		System.out.println(maxUnder150);
		
		System.out.println();
		System.out.println("문3)");
		
		int cnt9 = 0;
		for ( i = 50; i <= 100; i++ ) {
			if ( i % 9 == 0 ) {
				System.out.print(i + " ");
				cnt9++;				
			}
		}
		System.out.print("총" + cnt9 + "개");
		
		System.out.println();
		System.out.println("문4)");
		
		int maxUnder1000 = 0 ;
		for ( i = 1; i < 1000; i++ ) {
			if ( i % 28 == 0 ) {
				if ( maxUnder1000 < i ) {
					maxUnder1000 = i;
				}				
			}
		}
		System.out.println(maxUnder1000);
		
		System.out.println();
		System.out.println("문5)");
		
		int cnt8 = 0;
		for ( i = 1; i < 100; i++ ) {
			if ( i % 8 == 0 ) {
				cnt8++;
				System.out.print(i + " ");
			}
			if ( cnt8 == 5) {
				break;
			}
		}
	}

}