package AssignmentsDay1;

import java.util.Scanner;
public class DistanceBetPoints {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double dis;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter x2 point");
		x2=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
		
		dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println("Distancebetwen"+dis);
		

		

	}

}

