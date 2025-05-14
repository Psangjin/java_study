package study.practice.practice33;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ATM
		Account a1= new Account("나", 50000);
		long intsetMoney = 30000;
//		long result  = a1.deposit(30000);
//		System.out.println("입금액 : "+ result);
//		System.out.println("입금 후 잔액 : " a1.getBalance());
//		
		//return amount 입금액 케이스
		long result  = a1.deposit(insertMoney);
		System.out.println("입금액 : "+ result);
		System.out.println("입금 후 잔액 : " a1.getBalance());
		
	}

}
