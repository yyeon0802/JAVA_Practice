package step8_01.atm_v1;

import java.util.Scanner;

public class UserManager {
	
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	
	void printAllUser() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	
	
	void addUser() {
		
		if(userCount == 0) {		// 새로 가입 아무도 X
			user = new User[1];
		}
		else {
			User[] temp = user;		// 기존 유저 저장
			user = new User[userCount + 1]; 	// User[] user = null; -> 새로 생성
			for(int i = 0; i < userCount; i++) {
				user[i] = temp[i];
			}
			temp = null; 	// **temp는 비워라
		}
		
		// 여기까지 user[] 생성
		
		System.out.print("[가입] 아이디를 입력하세요 : ");
		String id = scan.next();
		
		boolean isDuple = false;		// ?
		for (int i = 0; i < userCount; i++) {
			if (user[i].id.equals(id)) {
				isDuple = true;			
			}
		}
		if (!isDuple) {		// (!isDuple) > (isDuple == false) , (isDuple) > (isDuple == true)
			user[userCount] = new User(); // 배열 안에 배열
			user[userCount].id = id;
			System.out.println("[메시지] ID : '" + id+ "' 가입 되었습니다.\n");
			userCount++;
		}
		else {
			System.out.println("[메시지] '"+ id + "'은 이미 가입된 아이디 입니다.\n");
		}
		
	}
	
	
	User getUser(int idx) {		// idx를 받아서, user[] 안 idx의 정보를 return
		
		return user[idx];
	}
	
	
	int logUser() {				// identifier(-1 or i)를 돌려줄거임 -> int  atm에서 받아서 계좌로 하는 메뉴 출력
		
		int identifier = -1;	// 없는 id면 -1 그대로 감
		System.out.print("[입력] 아이디를 입력하세요 : ");
		String name = scan.next();
		
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) {
				identifier = i;
				System.out.println("[" + user[identifier].id + "] 님 로그인.\n");
			}
		}
		
		return identifier;
		
	}
	
	
	
	void leave() {
		
		System.out.print("[입력] 탈퇴할 아이디를 입력하세요 : ");
		String name = scan.next();
		int identifier = -1;
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) {
				identifier = i;			
			}
		}
		
		if(identifier == -1) {
			System.out.println("[메시지] 아이디를 다시 확인하세요.");
			return;
		}
		
		System.out.println("ID : '" +user[identifier].id + "' 가 탈퇴되었습니다.");
		
		User[] temp = user;
		user = new User[userCount - 1];
		
		for(int i = 0; i < identifier; i++) {
			user[i] = temp[i];
		}
		for(int i =identifier; i < userCount-1; i++) {
			user[i] =temp[i + 1];
		}
		
		userCount--;
		
	}
	
}