package study.cls.cls03.pack3;

public class Account {
	public String name;
	public String bank;
	private double rate;
	private double balance;
	
	public String getName() { //getter
		return name;
	}
	public void setName(String name) { //setter
		this.name = name;
	}
	public String getBank() { //getter
		return bank;
	}
	public void setBank(String bank) { //setter
		this.bank = bank;
	}
	public double getRate() { //getter
		return rate;
	}
	public void setRate(double rate) { //setter
		this.rate = rate;
	}
	public double getBalance() { //getter
		return balance;
	}
	public void setBalance(double balance) { //setter
		this.balance = balance;
	}
}
