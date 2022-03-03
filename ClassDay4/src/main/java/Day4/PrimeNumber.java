package Day4;

public class PrimeNumber {
	public void checkPrimeNum(int num)
	{
		int i=2;
		while (num>i)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(num==i)
		{
			System.out.println("prime number" +num);
		}
		else
		{
			System.out.println("not prime numeber" +num);
		}
	}

	

}
