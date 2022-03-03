package Day4;

  class MyThreadExample
  {
    public void test() 
    {
     for(int i=200;i<300;i++)
     System.out.println(i);
    }
  }

     public class MethodReferenceExample 
     {

       public static void main(String[] args)
       {
         // TODO Auto-generated method stub
         MyThreadExample mt = new MyThreadExample();
         Runnable r = ()->
         {
          for(int i=0;i<100;i++)
          System.out.println(i);
         };
         Runnable r1 = mt::test;
         Thread t = new Thread(r1);
         t.start();

       }

      }
