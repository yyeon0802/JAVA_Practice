package step7_01.classArray;

import java.util.HashMap;

public class ClassArrayEx20 {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
//		HashMap<String, Integer> hmap2 = new HashMap<>(); // new 뒷쪽 제네릭 생략가능
	
		// put(key, value) : key에 value를 할당한다.
		hmap.put("data1", 1000);
		hmap.put("data2", 2000);
		hmap.put("data3", 3000);
		System.out.println(hmap); //순서를 신경안쓰는 코드..
		System.out.println();
		
		// put()메서드는 존재하지 않는 key를 넣어주면 데이터가 새로 입력되고,
		// 존재하는 key에 데이터를 넣어주면 기존값이 수정 된다.
		hmap.put("data1", 10000);
		hmap.put("data2", 20000);
		hmap.put("data3", 30000);
		System.out.println(hmap); 
		System.out.println();
		
		// size() : 데이터의 개수를 반환한다.
		System.out.println(hmap.size());
		System.out.println();
		
		// get(key) : key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println();
		
		
		// keySet() : 전체 key값을 얻어온다. 키값만 뽑아옴
		System.out.println(hmap.keySet());
		
		for (String key : hmap.keySet()) { //for reach문
 			System.out.print(hmap.get(key) + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// remove(key) : key에 해당되는 값을 제거한다.
		hmap.remove("data2");
		hmap.remove("data3");
		System.out.println(hmap);
		System.out.println();
		
		// clear() 
		hmap.clear();
		System.out.println(hmap);
		
	}

}