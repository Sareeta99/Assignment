package Day1;

import java.util.Scanner;
public class PositiveReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number:");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int dig=num%10;
			rev=(rev*10)+dig;
			num=num/10;
		}
System.out.println("reverse"+rev);
	}

}
