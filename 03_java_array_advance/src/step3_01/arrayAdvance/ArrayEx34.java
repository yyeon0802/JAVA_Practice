package step3_01.arrayAdvance;

//2차원 배열 엑셀을 생각하라


public class ArrayEx34 {

	public static void main(String[] args) {
		/*
		int[][] hhh = new int[3][7];
		hhh.length == 3;
		hhh[0].length == 7;
		hhh[1].length == 7;
		*/

		int[][] arr = new int[2][4]; // 엑셀의 행 열
		
		System.out.println("arr[0] : " + arr[0]); // 배열의 주소 [I@15db9742
		System.out.println("arr[1] : " + arr[1]); // [I@6d06d69c
		
		arr[0][0]  = 10;
		arr[0][1]  = 20;		
		arr[0][2]  = 30;
		arr[0][3]  = 40;
		
		arr[1][0]  = 50;
		arr[1][1]  = 60;		
		arr[1][2]  = 70;
		arr[1][3]  = 80;
		
		
		for( int i = 0; i < 2; i++ ) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for( int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		int[][] temp = arr;
		int temp = arr[0][0];
		*/
		int[] temp = arr[0]; // 가로줄만 1차원
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}