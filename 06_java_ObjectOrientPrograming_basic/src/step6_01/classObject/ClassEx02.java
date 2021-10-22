package step6_01.classObject;

/* # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능
 * 			(구체적 접근제어자는 객체지향 기법에서 공부)
 *   
 */

class Student{
	
	String name;
	int score;
}


public class ClassEx02 {

	public static void main(String[] args) {

		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능.
		// (접근 제어자는 후에 공부)
		// public은 클래스당 하나만 가능

		Ex01 e = new Ex01();
		Character c = new Character();
		
		Student std = new Student();
	}

}