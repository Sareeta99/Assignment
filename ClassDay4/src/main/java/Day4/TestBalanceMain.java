package Day4;
import java.util.Scanner;
public class TestBalanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mode of operation\n 1 withdraw \n2 check balance");
		int choice=sc.nextInt();
		TestBalance t=new TestBalance();
		
		switch(choice)
		{
		case 1:
		System.out.println("enter withdraw amt");
		int amt=sc.nextInt();
		
		try
		{
			t.withdraw(amt);
		}
		catch(InsufficientFundException  e)
		{
			System.out.println(e);
		}
		break;
		
		case 2:
			t.checkBalance();
			break;
			
			default:
				System.out.println("thank you");
		}
	}

}
