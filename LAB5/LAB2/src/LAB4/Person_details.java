package LAB4;

public class Person_details {
	String name;
	Float age;
	public void  getName(){
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getAge() {
		System.out.println(age);
	}
	public void setAge(Float age) {
		this.age = age;
	}
	
	

}
class Account extends Person_details{
	Long accnum;
	double balance=500.0f;
	String accountholder;
	public Long getAccnum() {
		return accnum;
	}
	public void setAccnum(Long accnum) {
		this.accnum = accnum;
	}
	public void getBalance() {
		System.out.println(balance);
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void  getAccountholder() {
		System.out.println(accountholder);
	}

	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance + ", accountholder=" + accountholder + "]";
	}
	public void setAccountholder(String name) {
		this.accountholder = name;
	}
	 void deposit(double a)
	{
		
		balance=balance+a;
	}
	 void withdraw(double b)
	{
		if(balance-b>=500)
			balance=balance-b;
		else
			System.out.println("Minimum balance will reach after transaction so abort transaction");
		
	}
	
	 void getbalance()
	{
		
		System.out.println(balance);
		
		
		
	}
	
	
	
	
	
	
}


