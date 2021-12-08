package step7_01.classArray;

/*
 * 
 * 접근제어자 : public , private + getter/setter
 *
 */

class PrivateTest {
	
	private int a;
	public int b;
	
	
	// private변수를 외부로 꺼내주는 메서드 getter
	int getA() {
		return this.a;
	}
	
	// 외부에서 private변수의 값을 수정하는 메서드 setter
	void setA(int a) {
		this.a = a;
	}
}


public class ClassArrayEx17 {

	public static void main(String[] args) {

		PrivateTest obj = new PrivateTest();
		// obj.a // 접근불가
	
		obj.b = 1000;
				
		System.out.println(obj.b);
		
	obj.setA(777);						// setter 이용해서 값 대입
	System.out.println(obj.getA());		// getter 이용해서 값을 꺼내옴
	
	}

}