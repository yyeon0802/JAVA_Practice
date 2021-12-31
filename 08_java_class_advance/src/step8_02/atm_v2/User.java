package step8_02.atm_v2;

public class User {
	
	// user안에 acc accCnt
	
	Account[] acc = new Account[UserManager.getInstance().ACC_MAX_CNT];	
	int accCnt;	

	String id;											
	String pw;											
	
}
