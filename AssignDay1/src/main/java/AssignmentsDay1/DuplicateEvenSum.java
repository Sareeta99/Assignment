package AssignmentsDay1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		
		int[] nums=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value for index"+i);
			nums[i]=sc.nextInt();
			
		}
		System.out.println("sum of even number after removing duplicates:"+sumEven(nums,size));
		
	}
	static int sumEven(int[] nums,int size)
	{
		int sum=0;
		Arrays.parallelSort(nums);
		
		for(int i=0;i<size-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				nums[i]=-1;
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=-1 && nums[i]%2==0)
			{
				sum+=nums[i];
			}
		}
		return sum;
	}

}
