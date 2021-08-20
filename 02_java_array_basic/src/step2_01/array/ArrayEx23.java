package step2_01.array;

import java.util.Scanner;

public class ArrayEx23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		
		for ( int i = 0; i < d.length; i++ ) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		System.out.print("d에서 뺄 값 : ");
		int delData = scan.nextInt();
		
		int l = 0;
		for ( int i = 0; i < d.length; i++ ) {
			if ( d[i] != delData) {
				e[l] = d[i];
				l++;
			}
		}
		for ( int i = 0; i < e.length; i++ ) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		for ( int i = 0; i < f.length; i++ ) {
			System.out.print(f[i] +" ");
		}
		System.out.println();
		System.out.print("뺄 번호 입력: ");
		int delNum = scan.nextInt();

		int delScore = 0;
		int n = 0;
		int o = 0;
		 		
		for ( int i = 0; i < f.length; i++ ) {
			if ( f[i] == delNum ) {
				delScore = f[i+1];
			}
			
			if ( f[i] != delNum ) {
				g[n] = f[i];
				n++;
			}
		}
		
		for ( int i = 0; i < g.length; i++ ) {
			if ( delScore != g[i] ) {
				g[o] = g[i];
				o++;
			}
		}
		
		for ( int i = 0; i < g.length; i++ ) {
			System.out.print(g[i] +" ");
		}
		System.out.println();
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		System.out.println();
		for ( int i = 0; i < h.length; i++ ) {
			System.out.print(h[i] +" ");
		}
		System.out.println();
		System.out.println("<하나씩 앞으로 밀어 맨뒤 저장>");
		System.out.print("값 입력 : ");
		int data = scan.nextInt();
		int lastIdx = 4;
		
		for ( int i = 0; i < h.length - 1; i++ ) {
			h[i] = h[i+1];
		}
		
		h[lastIdx] = data;
		
		for ( int i = 0; i < h.length; i++ ) {
			System.out.print(h[i] +" ");
		}
		System.out.println();
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		System.out.println();
		for ( int p = 0; p < i.length; p++ ) {
			System.out.print(i[p] +" ");
		}
		System.out.println();
		System.out.println("<하나씩 뒤로 밀어 맨 앞 저장>");
		System.out.print("값 입력 : ");
		data = scan.nextInt();
		
		lastIdx = 4;
		int idx = 0;
		
		for ( int p = lastIdx; p > 0; p-- ) {
			i[p] = i[p-1];
		}
		
		i[idx] = data;
		
		for ( int p = 0; p < i.length; p++ ) {
			System.out.print(i[p] +" ");
		}
		System.out.println();
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};

		System.out.println();
		System.out.println("배열 거꾸로 저장");
		int m = 0;
		for ( int p = 4; p >= 0; p-- ) {
			k[m] = j[p];
			m++;
		}
		
		for ( int p = 0; p < k.length; p++ ) {
			System.out.print(k[p] + " ");
		}	
		
	}

}