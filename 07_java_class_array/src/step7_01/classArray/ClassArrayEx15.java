package step7_01.classArray;

// # 생성자를 이용한 멤버변수 초기화

class Fruit {
	
	String name;
	int price;
	
	Fruit ( String name, int price ) { //전에 setData 하던거 호출하던거
		this.name = name;
		this.price = price;
	}
	
	void printData () {
		System.out.println(this.name + "(" + this.price + ")");
	}
}



public class ClassArrayEx15 {

	public static void main(String[] args) {

		/*
		Fruit banana = new Fruit();
		banana.setData("바나나", 2500);
		banana.printData();
		
		Fruit apple = new Fruit();
		apple.setData("사과", 800);
		apple.printData(); */
		
		Fruit banana = new Fruit("바나나", 2500);
		banana.printData();
		
		Fruit apple = new Fruit("사과", 800);
		apple.printData(); 
		
		
		
	}

}