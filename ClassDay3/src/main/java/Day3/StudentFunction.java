package Day3;

import java.util.Scanner;
import java.util.function.Function;
   
     class Student
     {
      String name;
      int marks;
      
      public Student(String name, int marks) 
      {
        super();
        this.name = name;
        this.marks= marks;
      }

	public void printstud() {
		// TODO Auto-generated method stub
		
	};

     }
    
     public class StudentFunction 
     {

	    public static void main(String[] args) 
	    {
		// TODO Auto-generated method stub

           Scanner sc = new Scanner(System.in);
           Function<Student,String> f = stud-> {
	       String result=null;
           if(stud.marks>=80 )
	       System.out.println("distinction");
           
           else if(stud.marks>=60 && stud.marks<80 )
	result=("first class");
else if(stud.marks>=50 && stud.marks<60 )
	result=("second class");
else result ="fail";
return null;
};
System.out.println("Enter name");
String name = sc.next();

System.out.println("Enter marks...");
int marks= sc.nextInt();

Student temp = new Student(name,marks);
temp.printstud();

String result= f.apply(temp);
System.out.println("result is"+result);

	}

}

