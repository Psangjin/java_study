package study.practice.practice33;

public class Account {

	private String owner;		//계좌 소유주
	private long balance;		//잔액	(int,long)
	
	
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
//				입금		(입금할 금액)
	public long deposit(long amount) {
		//계좌 잔액 5만 	3만 입금 -> 잔액 8만
		balance += amount;
	}
	
	//return		1) 입금액 	2) 입금 후 잔액
	
	
	
	
	// getter setter 메소드~
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
}
