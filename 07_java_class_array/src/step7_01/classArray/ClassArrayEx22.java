package step7_01.classArray;

//# ArrayList 클래스의 기능을 직접 구현해보자!

class MyList {

	int[] arr;
	int elementCnt;

	void print() {
		
		System.out.print("[");
		for ( int i = 0; i < elementCnt; i++ ) {
			System.out.print(arr[i]);
			if ( i != elementCnt - 1 ) {
				System.out.print(", ");
			}
		}
		System.out.println("]\n");
		
	}

	// 단순값 추가
	void add (int value) {
		
		if ( elementCnt == 0 ) {
			arr = new int [elementCnt + 1];			
		}
		
		else if ( elementCnt > 0 ) {
			int[] temp = arr;
			arr = new int [ elementCnt + 1 ];
			
			int j = 0;
			for ( int i = 0; i < elementCnt; i++ ) {
				arr[i] = temp[j++];
			}
			temp = null;
		}
		
		arr[elementCnt] = value;
		elementCnt++;
		
	}

	
	void add ( int index, int value ) {
		
		if ( elementCnt == 0 ) {
			arr = new int [elementCnt + 1];
		}

		else if ( elementCnt > 0 ) {
			int[] temp = arr;
			arr = new int [elementCnt + 1];
			
			int j = 0;
			for ( int i = 0; i < elementCnt+1; i++ ) {
				if ( i != index ) {
					arr[i] = temp[j++];
				}
			}
			temp = null;
		}
		
		arr[index] = value;
		elementCnt++;
	}

	void remove (int index) {
		
		if ( elementCnt == 1 ) {
			arr = null;
		}
		
		else if ( elementCnt > 0 ) {
			int[] temp = arr;
			arr = new int [elementCnt - 1];
			
			int j = 0;
			for ( int i = 0; i < elementCnt; i++ ) {
				if ( i != index ) {
					arr[j++] = temp[i];
				}
			}
			temp = null;
		}
		elementCnt--;
	}

	
	//길이구하기
	
	int size() {
		
		return elementCnt;
	}
	
	

	int get(int index) {
		return arr[index];
	}
	
	
	//특정위치 값 수정하기
	
	void set(int index, int value) {
		arr[index] = value;
	}
	
	//지우기
	void clear() {
		arr = null;
		elementCnt = 0;
	}

}


public class ClassArrayEx22 {

	public static void main(String[] args) {

		// 직접 구현한 ArrayList
		MyList list = new MyList();

		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		
		// 삽입하기
		list.add(0, 9);
		// 출력하기
		list.print();

		// (index로)삭제하기
		list.remove(3);
		list.print();

		// 길이 구하기
		int elementCnt = list.size();
		System.out.println("elementCnt = " + elementCnt);

		// (index로)값 꺼내오기 
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(list.get(2));
			if (i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// 특정 위치의 값 수정하기
		list.set(3, 5);
		list.print();

		// 모든 데이터를 제거하기
		list.clear();
		System.out.println(list.size());

	}

}