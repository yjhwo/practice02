package prob3;

public class Account {
	private String accountNo;	// 계좌 번호
	private int balance;		// 잔고
	
	public Account(){ }
	
	public Account(String accountNo){
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int balance) {	// 입금
		this.balance += balance;
		System.out.println(accountNo+" 계좌에 "+balance+"만원이 입금되었습니다.");
	}
	
	public void deposit(int balance){	// 출금
		this.balance -= balance;
		System.out.println(accountNo+" 계좌에 "+balance+"만원이 출금되었습니다.");
	}
	
	
}
