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
public static void main(String args[])
{
 int n=520;
 System.out.println(CountDigits.countDigitofNumber(n));



}
}