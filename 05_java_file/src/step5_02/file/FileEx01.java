package step5_02.file;

import java.io.FileWriter;

// # 파일에 입력하기(input)


public class FileEx01 {

	public static void main(String[] args) {

		// 파일이 생성되는 기본적인 위치는 현재 자바파일과 같은 프로젝트 폴더이다.(위치변경 가능)
		// 소스를 실행한 후 프로젝트를 선택한 뒤 F5(Refresh)를 누르면 생성된 파일을 확인
		
		String fileName = "ex01.txt";
		
		FileWriter fw = null;
		
		try { // 파일 입출력은 try, catch구문 없이 사용하지 못하도록 강제성 부여해 놓음 
			fw = new FileWriter(fileName); //파일을 생성하는 기능의 객체 생성
			
			// write메서드를 통해 파일에 입력이 가능
			// 1)문자열 데이터형식만 가능
			// 2)개행기능이 없기때문에 \n 의도적으로 작성 필요 
			
			fw.write("파일 저장하기 연습문제1\n"); //문자열 string만 가능
			fw.write("파일 저장하기 연습문제2\n");	// "1" 이런식만 숫자가능		
			
			String data = "파일 저장하기 연습문제3\n";
				data += "파일 저장하기 연습문제4\n";
				data += "파일 저장하기 연습문제5\n";
				
			fw.write(data);		// 3) write 메서드를 여러번 사용하지 않고
								// 데이터를 미리 += 로 만들어 놓고
								// 한번만 write 메서드 사용하는 것을 권장.
			
			
			fw.close();						// 파일 객체 종료[중요]	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}