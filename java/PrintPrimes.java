public class PrintPrimes
{
	
	public static int[ ] primes = {2, 3, 5, 7};
	
	private PrintPrimes()
	{	
	}
	

	
	public static void printnow()
	{
		for (int t=0; t<primes.length; t++)
		{
			System.out.println(primes[t]); 
		}	
	}
	
	public static void main(String[] args) 
	{
		PrintPrimes.printnow();		
	}
}


