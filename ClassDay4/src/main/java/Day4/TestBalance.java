package Day4;

public class TestBalance {
 int balance=5000;
 
 public void withdraw(int amt)
 {
	 if(amt>balance)
	 {
		 throw new InsufficientFundException ();
	 }
	 else
	 {
		 amt=balance;
		 System.out.println("successfully credited"+amt);
	 }
 }
 public void checkBalance() {
	 System.out.println("current balanace is "+balance);
 }
}
