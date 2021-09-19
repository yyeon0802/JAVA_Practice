package step4_01.string;

// 문자열 관련 메서드

public class StringEx03 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);
		
		int[] arr = new int [7];
		System.out.println(arr.length);
		 
		// [1] 문자 열의 길이 : length() 배열과 차이가 있다
		int size = str.length();  //소괄호!
		System.out.println(size);
		
		// [2] 문자 한개 추출(인덱싱) : charAt(index)
		char ch = str.charAt(0); //반환타입 char 
		System.out.println(ch);
		
		ch = str.charAt(3);
		System.out.println(ch);
				
		ch = str.charAt(size - 1); //마지막글자 012345 로 된다 
		System.out.println(ch);
		System.out.println();
		
		// [3] 문자열 추출(슬라이싱) : substring()
		// 3-1) substring(index1, index2) : index1 이상 index2미만까지(마지막은 포함하지 않는다)
		
		String rs = str.substring(4, 6);
		System.out.println(rs);
		
		
		// 3-2) substring(index) : index부터 끝까지
		rs = str.substring(3);
		System.out.println(rs);
		System.out.println();
		
		// [4] 구분자로 잘라내기 : split("구분자")
		
		str = "java,jsp,spring";
		String[] rsArr = str.split(",");
		System.out.println(rsArr.length);
		System.out.println(rsArr[0]);
		System.out.println(rsArr[1]);
		System.out.println(rsArr[2]);
		System.out.println();
		
		str = "java,jsp,spring,html,css,js,jquery,mysql";
		rsArr = str.split(",");
		System.out.println(rsArr.length);
		for ( int i = 0; i < rsArr.length; i++ ) {
			System.out.print(rsArr[i] + " ");			
		}
		
		System.out.println();
		System.out.println();
		
		// [5] 문자열 비교 : compareTo()

		String str1 = "a";
		String str2 = "c";
		String str3 = "a";

		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수 ( 왼쪽값이 작을경우 )
				
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수 ( 왼쪽값이 클경우 )
				
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0    ( 같을 경우 )
		
	}

}