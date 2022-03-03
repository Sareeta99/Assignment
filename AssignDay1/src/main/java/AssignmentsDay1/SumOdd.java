package AssignmentsDay1;

import java.util.Scanner;
public class SumOdd {


	public static void main(String[] args) {
	int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		while(number>=0)
		{
			if(number%2!=0)
			{
				sum+=number;
			}
			number--;
		}
		System.out.println("the sum of odd number"+sum);
		
	}
}
