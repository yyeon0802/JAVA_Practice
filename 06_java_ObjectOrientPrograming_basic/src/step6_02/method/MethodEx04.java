package step6_02.method;

// # this = 인스턴스 변수 자신

class Zealot{
	
	int shield = 60;
	int hp = 100;
	int attack =16;
	
	void showStatus() {
		System.out.println("this : " + this);
		System.out.println("shield : " + this.shield);
		System.out.println("hp : " + this.hp);
		System.out.println("attack : " + this.attack);
		System.out.println();
		
		
		// this는 생략가능하지만 가독성 향상을 위해 this를 붙인다.
//		System.out.println("shield : " + shield);
//		System.out.println("hp : " + hp);
//		System.out.println("attack : " + attack);
//		System.out.println();
		
	}
}


public class MethodEx04 {

	public static void main(String[] args) {

		Zealot z1 = new Zealot();
		System.out.println(z1);
		z1.shield = 0;
		z1.showStatus();
		
		Zealot z2 = new Zealot();
		System.out.println(z2);
		z2.shield = 0;
		z2.hp = 0;
		z2.showStatus();
		
		Zealot z3 = new Zealot();
		System.out.println(z3);
		z3.showStatus();
	}

}