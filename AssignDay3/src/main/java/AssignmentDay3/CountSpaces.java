package AssignmentDay3;

public class CountSpaces {
    static int i,c=0,res;
    static int countspace(String s)
    {
   	 for(i=0,c=0;i<s.length();i++)
   	 {
   		 char ch=s.charAt(i);
   		 if(ch==' ')
   			 c++;
   	 }
		return c;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		res=CountSpaces.countspace("thank you");	
        System.out.println("The number of white spaces in the String are:"+res);
	}


}
