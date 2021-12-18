package step8_01.atm_v1;
import java.util.Random;
import java.util.Scanner;

public class ATM {
	
	Scanner scan = new Scanner(System.in);
	Random ran   = new Random();
	UserManager userManager = new UserManager();
	int identifier = -1;
	
	void printMainMenu() {
				
		while (true) {
			
			System.out.println("\n[ MEGA ATM ]");
			System.out.print("[1.로그인] [2.로그아웃] [3.회원가입] [4.회원탈퇴] [0.종료] : ");
			int sel = scan.nextInt();
			
			if      (sel == 1) 	    login();
			else if (sel == 2) 		logout();
			else if (sel == 3) 		join();
			else if (sel == 4) 		leave();
			else if (sel == 0) 		break;
			
		}
		
		System.out.println("[메시지] 프로그램을 종료합니다.");
		
	}
	
	
	void login() {		// identifier로 확인만
		
		identifier = userManager.logUser(); // logUser : 해당 아이디 있는지 확인
		
		if (identifier != -1) {				// userManager.logUser 는 return identifier
			printAccountMenu(); 			// public class ATM 내 void
		}
		else {
			System.out.println("[메세지] 로그인실패.");
		}
		
	}
	
	
	void join() {	
		
		userManager.addUser();			// User[]에 추가
	}
	
	
	void logout() {
		
		if (identifier == -1) {
			System.out.println("[메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1; // 로그인하여 identifier=i 인 것을 -1 로그아웃 상태로 바꿈
			System.out.println("[메시지] 로그아웃 되었습니다.");
		}
		
	}
	
	
	void leave() {
		
		userManager.leave();
		
	}
	
	
	void printAccountMenu() {
		
		while (true) {
			
			System.out.print("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] : ");
			int sel = scan.nextInt();
			
			String makeAccount = Integer.toString(ran.nextInt(90001) + 10000);	// 계좌번호 생성
			 
			
			if (sel == 1) {				// public class User 안의 Account[]에 추가
				if (userManager.user[identifier].accCount == 0) { // 아무것도 X시
					userManager.user[identifier].acc = new Account[1]; // Account[] acc 배열 하나 생성
					
					//매니저.유저[1,2,3,4]
					
					//매니저.유저[3].계좌[1,2,3,4] -> 한명 명의의 다계좌
					
					userManager.user[identifier].acc[0] = new Account();	// class user안의 Account[] 1명의 new 계좌만든다
					userManager.user[identifier].acc[0].number = makeAccount;	// public class Account 의 String number
				
				}
				else { // 1명 이상
					Account[] temp = userManager.getUser(identifier).acc;	
					// public class userManager 안의 user[]의 index return 해서 temp에 해당 유저의 기존 정보배열 담을것
					int tempAccCount = userManager.getUser(identifier).accCount;
					// int accCount -> userManager 안에 있다
					
					userManager.user[identifier].acc = new Account[tempAccCount+1]; // 새로 계정추가할 Account[] 생성
					for (int i = 0; i < tempAccCount; i++) {
						userManager.user[identifier].acc[i] = temp[i];
					}	// temp에 기존 계좌정보 저장 후 새로운 Account[] 기존 정보 저장
					userManager.user[identifier].acc[tempAccCount] = new Account();
					userManager.user[identifier].acc[tempAccCount].number = makeAccount; // 새로운 계좌 저장
					
				}
				userManager.user[identifier].accCount++; // 계좌 늘었다
				System.out.println("[메시지]'"+makeAccount +"'계좌가 생성되었습니다.\n");
			} 	
			else if (sel == 2) {
				
				if (userManager.user[identifier].accCount == 0) {
					System.out.println("[메시지] 더 이상 삭제할 수 없습니다.\n");
					continue;
				}
				
				if ( userManager.user[identifier].accCount == 1) { // acc[0].number = 계좌번호
					System.out.println("[메시지] 계좌번호 :'"+ userManager.user[identifier].acc[0].number+"' 삭제 되었습니다.\n");
					userManager.user[identifier].acc = null; // 비우기
				}
				else {
					
					System.out.print("삭제 하고 싶은 계좌 번호를 입력하세요 : ");
					String deleteAccount = scan.next();
					int tempAccCount = userManager.user[identifier].accCount; //이따 삭제해서 count가 줄어들기전에 저장
					int delIdx = -1; // check
					for (int i = 0; i <tempAccCount; i++) {
						if (deleteAccount.equals(userManager.user[identifier].acc[i].number)) {
							delIdx = i;
						}
					}
					
					if ( delIdx == -1 ) {
						System.out.println("[메시지] 계좌번호를 확인하세요.\n");
						continue;
					}
					else {
						System.out.println("[메시지] 계좌번호 :'"+ userManager.user[identifier].acc[delIdx].number+"' 삭제 되었습니다.\n");
						
						Account[] temp = userManager.user[identifier].acc; // temp에 삭제전 저장
						userManager.user[identifier].acc = new Account[tempAccCount-1]; //삭제해서 줄어든 acc배열 생성
						
						
						for (int i = 0; i < delIdx; i++) {
							userManager.user[identifier].acc[i] = temp[i]; //삭제idx 전까지
						}
						for (int i = delIdx; i < tempAccCount - 1; i++) {
							userManager.user[identifier].acc[i] = temp[i+1]; // 삭제idx 후 저장
 						}
					}
					
				}
				userManager.user[identifier].accCount--; // 삭제 후 Account배열의 count--
				
			}
			
			else if (sel == 3) {
				if (userManager.user[identifier].accCount == 0) {
					System.out.println("[메시지] 생성된 계좌가 없습니다.\n");
				}
				else {
					userManager.user[identifier].printAccount(); // acc[i].printOwnAccount()
				}
			}   
			else if (sel == 0) {
				logout(); // public ATM 내 void logout method 호출
				break;
			}
			
		}
		
	}	
} 