package step7_01.classArray;


class Client {
	
	String name;
	int score;
	
	void setData ( String n , int s ) {
		
		this.name = n;
		this.score = s;
		
	}
	
	void printData() {
		System.out.println( this.name + " : " + this.score);
	}
	
}

public class ClassArrayEx03 {

	public static void main(String[] args) {
		
		Client[] st = new Client[3];
		
		for (int i = 0; i < st.length; i++) {
			st[i] = new Client();
		}

		st[0].setData("김현철", 55);
		st[1].setData("김수미", 44);
		st[2].setData("김홍", 33);
	
		for (int i = 0; i < st.length; i++) {
			st[i].printData();
		}
		
	}

} 