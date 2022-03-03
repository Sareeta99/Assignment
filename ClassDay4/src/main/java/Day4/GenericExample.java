package Day4;

   class Gen<T>
  {
    T ob;
    Gen(T y)
    {
     ob=y;
    }
     T getOb() 
     {
     return ob;
     }
     
    void showType() 
    {
     System.out.println("Type of Object is " + ob.getClass().getName());
    }

   }

    public class GenericExample
    {
     public static void main(String args[])
     {
       Gen<String> g = new Gen("Hello");
       g.showType();
     }

    }
