package in.pankaj.atm;

public class ATM {
	
	final String BANK_NAME = "SBI";
	
	private static Integer balance=0;
	private static Integer pin=0;
	
	
	public Integer checkBal() {
		
		return balance;
	}
	
	public void depositAmnt(Integer a) {
		this.balance=a;
	}
	
	public void withdraw(Integer amnt) {
		if(balance > amnt) {
			balance -= amnt;
			return;
		}
	}

}
