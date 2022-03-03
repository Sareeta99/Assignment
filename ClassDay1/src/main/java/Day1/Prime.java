package Day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i=2;
		while(num>=i)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(num==i)
		{
			System.out.println("prime number"+num);
		}
		else
		{
			System.out.println(" not prime number"+num);

		}

	}

}
