package Day1;

import java.util.Scanner;

public class Odd {
private static Scanner sc;
	public static void main(String[] args) {
		int number,i,oddSum=0;
		sc=new Scanner(System.in);
				System.out.println("enter the number");
		number=sc.nextInt();
		for(i=0;i<number;i++)
		{
			if(i%2!=0)
			{
				oddSum=oddSum+i;
			}
		}
System.out.println("the sum of odd number"+number+ "="+oddSum);
	}

}

