//Program to counts the Digits in the number.
class CountDigits
{

	static int count =0;
	public static int countDigitofNumber(int number)
	{
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		return count;
	}
//Using  Recursion
	public static int recursiveCountDigits(int n){
	if (n==0)
		return 0;
	else	
		return 1+recursiveCountDigits(n/10);
	}
public static void main(String args[])
{
 int n=520;
 System.out.println(CountDigits.countDigitofNumber(n));
	
 System.out.println(CountDigits.recursiveCountDigits(n));

}
}