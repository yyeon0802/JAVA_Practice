package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

class StudentVO {
	String id = "";
	String pw = "";
	
	void set_data(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	void print_data() {
		System.out.println("이름 : " + id + " / 비밀번호 : " + pw);
	}
	
}

class StudentManager {
	
	ArrayList<StudentVO> vec = new ArrayList<StudentVO>();
	
	void add_student (StudentVO st) {
		vec.add(st);
	}

	int check_id(StudentVO st) {
		int check = -1;
		for ( int i = 0; i < vec.size(); i++ ) {
			if ( vec.get(i).id.equals(st.id) ) {
				check = i;
				break;
			}				
		}
		return check;
	}
	
	StudentVO remove_student(int index) {
		StudentVO del_st = vec.get(index);
		vec.remove(index);
		return del_st;
	}
	
	void print_student() {
		for ( int i = 0; i < vec.size(); i++ ) {
			vec.get(i).print_data();
		}
	}

	String out_data() {
		String data = "";
		int count = vec.size();
		
		if (count == 0) {
			return data;
		}
		
		data += count;
		data += "\n";
		
		for ( int i = 0; i < count; i++ ) {
			data += vec.get(i).id;
			data += ",";
			data += vec.get(i).pw;
			if ( i != count - 1 ) {
				data += "\n";
			}
		}
		return data;
	}
	
	void load_student(ArrayList<StudentVO> temp) {
		vec = temp;
	}
	
	int get_size() {
		return vec.size();
	}
	
}

public class ClassArrayEx23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if 		(sel == 1) {
				StudentVO temp = new StudentVO();
				System.out.print("[가입] id 입력 : ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				
				if ( check == -1 ) {
					System.out.print("[가입] pw 입력 : ");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println( temp.id + " 님 가입 완료");
				}
				
				else {
					System.out.println("[메세지] 중복된 id 입니다");
				}
			}
			
			else if (sel == 2) {
				manager.print_student();
				StudentVO temp = new StudentVO();
				
				System.out.print("[탈퇴] id 입력 : ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				
				if ( check == -1 ) {
					System.out.println("[메세지] 해당하는 id X");
				}
				
				else {
					StudentVO del_st = manager.remove_student(check);
					System.out.println( del_st.id + "님 탈퇴 완료");
				}
			}
			
			else if (sel == 3) {}
			
			else if (sel == 4) {
				manager.print_student();
			}
			
			else if (sel == 5) {
				
				if ( manager.get_size() == 0 ) {
					return;
				}
					
				try {
					
					FileWriter fw = new FileWriter("student_manager_vec.txt");
					String data = manager.out_data();
					
					if ( !data.equals("") ) {
						fw.write(data);
						System.out.println(data);
					}					
					fw.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
			
			else if (sel == 6) {
				try {
					File file = new File("student_manager_vec.txt");
					
					if ( file.exists() ) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						ArrayList<StudentVO> vec = new ArrayList<StudentVO>();
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						
						for ( int i = 0; i < count; i++ ) {
							StudentVO temp = new StudentVO();
							line = br.readLine();
							String[] value = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							vec.add(temp);
						}
						fr.close();
						br.close();
						manager.load_student(vec);
						
					}
						manager.print_student();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
			
			else if (sel == 7) {
				System.out.println("[종료] 끝");
				break;
			}
			
		}

	}

}