package AssignmentDay3;

public class RemoveSpace {
	static int removeSpaces(char[]str)
	{ 
		int count=0;
		for(int i=0;i<str.length;i++)
			if(str[i] !=' ')
				str[count++]=str[i];

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]="s a r i t a".toCharArray();
		int i=removeSpaces(str);
		System.out.println(String.valueOf(str).subSequence(0, i));


	}

}
