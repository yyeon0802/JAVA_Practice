package step2_01.array;

import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
		
		System.out.println("(합이 짝수일 때 만 저장)");
		int j = 0;
		for ( int i = 0; i < l.length; i++ ) {
			int tot = l[i] + m[i];
			if ( tot % 2 == 0 ) {
				n[j] = tot;
				j++;
			}
		}
		
		for ( int i = 0; i < n.length; i++ ) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
						
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		
		System.out.println();
		System.out.println("(60점 이상 득점자의 번호만 저장)");
		
		j = 0;
		for ( int i = 0; i < score.length; i++ ) {
			if ( score[i] >= 60 ) {
				win[j] = num[i];
				j++;
			}
		}
		for ( int i = 0; i < win.length; i++ ) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
				
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		
		System.out.println();
		System.out.println("(60점 이상 득점자의 번호만 저장 2)");
		
		j = 0;
		for ( int i = 0; i < data.length; i++ ) {
			if ( i % 2 == 1 ) {
				if ( data[i] >= 60 ) {
					win2[j] = data[i-1];
					j++;
				}
			}
		}
	
		for ( int i = 0; i < win2.length; i++ ) {
			System.out.print(win2[i] + " ");
		}
		System.out.println();
			
	
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		// 예) 30 ==> p = {10,20,40,50,0};
		
		System.out.println();
		for ( int i = 0; i < o.length; i++ ) {
			System.out.print(o[i] + " ");
		}
		System.out.println();
		System.out.println("(입력한 값만 빼고 저장)");
		System.out.print(">>> 값 입력 : ");
		int getData = scan.nextInt();
		
		j = 0;
		for ( int i = 0; i < o.length; i++ ) {
			if( o[i] != getData ) {
				p[j] = o[i];
				j++;
			}
		}
		
		for ( int i = 0; i < p.length; i++ ) {
			System.out.print(p[i] + " ");
		}
		System.out.println();
		
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장 
		int[] q = { 1001, 40, 1002, 65, 1003,  70 };
		int[] r = { 0,0,0,0,0,0 };
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		
		System.out.println();
		for ( int i = 0; i < q.length; i++ ) {
			System.out.print(q[i] + " ");
		}
		System.out.println();
		System.out.println("(입력한 번호와 해당하는 값을 뺀 후 저장)");
		System.out.print(">>> 번호 입력 : ");
		int delNum = scan.nextInt();
		
		int delScore = 0;
		
		j = 0;		
		for ( int i = 0; i < q.length; i++ ) {
			if ( q[i] == delNum ) {
				delScore = q[i+1];
			}
			
			if ( q[i] != delNum) {
				r[j] = q[i];
				j++;
			}
		}
		
		int k = 0;
		for ( int i = 0; i < r.length; i++ ) {
			if ( delScore != r[i] ) {
				r[k] = r[i];
				k++;
			}
		}
		
		for ( int i = 0; i < r.length; i++ ) {
			System.out.print(r[i] + " ");
		}
		System.out.println();
		
		
		// 문제 18) 
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		
		System.out.println();
		System.out.println("( 5번 입력 후 일치값이 있을 때 인덱스 저장)");
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for ( int i = 0 ; i < 5; i++ ) {
			System.out.print(">>>" + (i + 1) +"번째 숫자 입력 : ");
			int getNum = scan.nextInt();
			
			int idx = -1;
			
			for ( int h = 0; h < arr.length; h++ ) {
				if ( getNum == arr[h] ) {
					idx = h;					
				}
			}
			
			s[i] = idx;
			
		}
		
		for ( int i = 0; i < s.length; i++ ) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		
	}

}