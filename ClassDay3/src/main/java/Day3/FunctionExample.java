package Day3;

import java.util.function.Function;
public class FunctionExample 
{

 public static void main(String[] args) 
 {

   Function<Integer,Double> f = radius-> 3.141*radius*radius;
   Function<Integer,Integer> f1 = side->side*side*side;
   System.out.println("The area of circle"+f.apply(5));
   System.out.println("The volume of cube :"+f1.apply(3));

  }

}

