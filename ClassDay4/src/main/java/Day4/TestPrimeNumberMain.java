package Day4;
import java.util.Scanner;
public class TestPrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		PrimeNumber prime=new PrimeNumber();
		try
		{
			prime.checkPrimeNum(num);
		}
		catch(PrimeNumberException p)
		{
			System.out.println(p);
		}
		
		

	}

}
