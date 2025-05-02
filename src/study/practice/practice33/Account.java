package study.practice.practice33;

public class Account {

	private String owner; //계좌 소유주
	private long balance; //잔액   (int,long)
	
	public Account() {
		owner = null;
		balance = 0;
	}
	public Account(String owner) {
		this.owner=owner;
		balance=0;
	}
	public Account(long balance) {
		owner=null;
		this.balance=balance;
	}
	public Account(String owner,long balance) {
		this.owner=owner;
		this.balance=balance;
	}
	public Account(long balance,String owner) {
		this.owner=owner;
		this.balance=balance;
	}
	
	//getter, setter 메소드
	public String getOwner() { //getter
		return owner;
	}
	public void setOwner(String owner) { //setter
		this.owner = owner;
	}
	public long getBalance() { //getter
		return balance;
	}
	public void setBalance(long balance) { //setter
		this.balance = balance;
	}
	
	// 			입금 		(입금할 금액)
	public long deposit(long amount) {
		 //메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
		balance+=amount;
		
		return balance;	
	}
	//			인출		   인출할 금액
	public long withdraw(long amount) {
		//Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
//		인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
//		출하려는 메소드를 호출하여 출력
		//8만원 -> 10만원 인출!! XX
		
		//1) 인출 불가 ! 금액 다시 입력
		//2) 가능한 최대금액인 8만원 인출
		if(amount > balance) {
			return 0;
		}
		balance-=amount;
		//return 실제 인출한 금액
		return amount;
	}
}
