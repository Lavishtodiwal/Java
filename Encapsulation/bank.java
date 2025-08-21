class Bank{
	String accountHolder;
	double balance;
	//parametrized constructor
	Bank(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	void getAccountInfo(){
		System.out.println(this.accountHolder);
		System.out.println(this.balance);
	}
	void deposit(double amount){
		if(balance > 0){
			balance = balance + amount;
		}
	}
	void withdraw(double amount){
		if(balance > 0 && amount<=balance){
			balance = balance - amount;
		}
	}
	
	public static void main(String... s){
		Bank b1 = new Bank("Ekta", 1000);
		//b1.getAccountInfo();
		b1.deposit(1000);
		//b1.getAccountInfo();
		b1.withdraw(500);
		b1.deposit(2000);
		b1.getAccountInfo();	
	}
}