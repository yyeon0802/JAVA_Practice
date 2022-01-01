package step8_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
	
	private UserManager() {}
	
	static private UserManager instance = new UserManager();
	
	static public UserManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	final int ACC_MAX_CNT = 3;			// 최대 개설 가능한 계좌 수
	User[] userList = null;				// 전체 회원정보
	int userCnt = 0;					// 전체 회원 수
	
	void printAllUser() {
		
		for (int i = 0; i < userCnt; i++ ) {
			System.out.print(i+1 + "ID (" + userList[i].id + ") \t PW (" + userList[i].pw + ") \t");
			for (int j = 0; j < userList[i].accCnt; j++ ) { // User클래스 안의 accCnt 
				System.out.println(userList[i].acc[j].accNumber + " : " + userList[i].acc[j].money);
			}	// Account 클래스 안의 accNumer money 
		}
	}

	boolean getCheckAcc (String account) { // AccountManager 클래스의 makeAccount 받는다
		
		boolean isDuple = false;
		for ( int i = 0; i < userCnt; i++ ) {
			for ( int j = 0; j < userList[i].accCnt; j++ ) {
				if ( account.equals(userList[i].acc[j].accNumber) ) {
					isDuple = true;
				}
			}
		}
		
		return isDuple;
		
	}
	
	int logUser() {
		
		int identifier = -1;
		
		System.out.print("[로그인] ID : ");
		String id = scan.next();
		System.out.print("[로그인] PW : ");
		String pw = scan.next();
	
		for ( int i = 0; i < userCnt; i++ ) {
			if ( id.equals(userList[i].id) && pw.equals(userList[i].pw) ) {
				identifier = i;
			}
		}
			
		return identifier;
		
	}
	
	
	boolean checkId (String id) {
		
		boolean isDuple = false;
		for ( int i = 0; i < userCnt; i++ ) {
			if ( id.equals(userList[i].id) ) {
				isDuple = true;
			}
		}
		return isDuple;
	}
	
	void joinMember() {
		
		System.out.print("[가입] ID 입력 : ");
		String id = scan.next();
		System.out.print("[가입] PW 입력 : ");
		String pw = scan.next();
		
		boolean isResult = checkId(id);
		
		if ( isResult ) {
			System.out.println("[메세지] 중복된 ID");
			return;
		}
		

		if ( userCnt == 0 ) {
			userList = new User[1];
			userList[0] = new User();
		}
		
		else {
			User[] temp = new User[userCnt];
			userList = new User[userCnt+1];
			userList[userCnt] = new User();
			
			for ( int i = 0; i < userCnt; i++ ) {
				userList[i] = temp[i];
			}
			temp = null;
		}

		userList[userCnt].id = id;
		userList[userCnt].pw = pw;
		userCnt++;
		System.out.println("[" + id + "] 님 회원가입 완료");
		
		FileManager.getInstance().save();
	}
	
	int deleteMember(int identifier) {
		
		User[] tmp = userList;
		userList = new User[userCnt - 1];
		
		int j = 0;
		for (int i=0; i<userCnt; i++) {
			if (i != identifier) {
				userList[j++] = tmp[i];
			}
		}
		
		userCnt--;
		tmp = null; //비워라ㅏ
		identifier = -1;
		
		System.out.println("[메세지]탈퇴되었습니다.");

		FileManager.getInstance().save();
		
		return identifier;
		
	}
	
	// (테스트생성용 메서드)  : 테스트 데이타 > 더미
	void setDummy() {
		
		String[] ids  = {"user1"  ,  "user2",     "user3",    "user4",    "user5"};
		String[] pws  = {"1111"   ,   "2222",      "3333",     "4444",    "5555"};
		String[] accs = {"1234567",  "2345692",  "1078912",   "2489123",  "7391234"};
		int[] moneys  = { 87000   ,     12000,    49000,        34000,     128000};
		
		userCnt = 5;
		userList = new User[userCnt];
		
		for (int i=0; i<userCnt; i++) {
			userList[i] = new User();
			userList[i].id = ids[i];
			userList[i].pw = pws[i];
			userList[i].acc[0] = new Account();
			userList[i].acc[0].accNumber = accs[i];
			userList[i].acc[0].money = moneys[i];
			userList[i].accCnt++;
		}
		
	}
	
}