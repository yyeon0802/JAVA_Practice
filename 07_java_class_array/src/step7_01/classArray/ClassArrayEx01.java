package step7_01.classArray;


class Product {
	
	String name;
	int price;
	
}

public class ClassArrayEx01 {

	public static void main(String[] args) {
			
		// 클래스 배열 생성 방법
		// 클래스명[] 객체명 = new 클래스명[배열의 크기];
		
		Product[] arr= new Product[3];
		
		arr[0] = new Product();
		arr[1] = new Product();
		arr[2] = new Product();
	
		arr[0].name = "기계식 키보드";
		arr[0].price = 45000;
		
		arr[1].name = "무소음 마우스";
		arr[1].price = 35000;
		
		arr[2].name = "장패드";
		arr[2].price = 10000;
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("name : " + arr[i].name);
			System.out.println("price : " + arr[i].price);
			System.out.println();
		}
		
		// [응용] 특정 객체를 대입 후 출력( 자료형 확인[중요] )
		
//		arr[0] = 
//				1) name( = arr[0].name)
//				2) price( = arr[0].price)
//				3) 주소(링크) !!! 
		
//		? temp = arr[1]  
//		1) Product !! 정답 : 자료형
//		2) Product []
//		3) Product[1] X
		
		Product temp = arr[1];
		
		System.out.println(arr[1]);
		System.out.println(temp);
		System.out.println(temp.name);
		System.out.println(arr[1].name);
		
		
		
	}

}