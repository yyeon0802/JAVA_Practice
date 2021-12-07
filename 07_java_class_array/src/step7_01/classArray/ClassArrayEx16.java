package step7_01.classArray;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */


class Fruit2 {
	
	String name;
	int price;
	
	// 생성자 오버로딩
	Fruit2() {
	}

	// 생성자 오버로딩
	Fruit2 ( String name ) {
		this.name = name;
		this.price = 1000;
	}
	
	
	Fruit2 ( String name, int price ) { //전에 setData 하던거 호출하던거
		this.name = name;
		this.price = price;
	}
	
	void printData () {
		System.out.println(this.name + "(" + this.price + ")");
	}
}

public class ClassArrayEx16 {

	public static void main(String[] args) {
		
		Fruit2 f1 = new Fruit2();
		Fruit2 f2 = new Fruit2("사과");
		Fruit2 f3 = new Fruit2("포도" , 50000);
		
		

	}

}