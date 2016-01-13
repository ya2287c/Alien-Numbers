import java.math.BigInteger;
import java.util.ArrayList;

public class alienCalculator 
{
	public alienCalculator()
	{
		
	}
	public void calculate(String AlienWriting)
	{
		ArrayList<Character> charSet=uniqueChars(AlienWriting);
		if(AlienWriting.length()<15)
		{
			long timeTillDeath=getSeconds(AlienWriting,charSet);
			System.out.print(timeTillDeath);
		}
		else
		{
			BigInteger timeTillapocalypse= new BigInteger("0");
			timeTillapocalypse=timeTillapocalypse.add(getBigTime(AlienWriting,charSet));
			System.out.print(timeTillapocalypse);
		}
		
	}
	private BigInteger getBigTime(String alienWriting,
			ArrayList<Character> charSet) 
	{
		BigInteger timeLeft=new BigInteger("0");
		char c;
		for(int i=0;i< alienWriting.length();i++)
		{
			c= alienWriting.charAt(i);
			if(charSet.indexOf(c)==0)
			{
				int number=(charSet.indexOf(c)+1);
				BigInteger base=new BigInteger(Integer.toString(number));
				BigInteger exponent = new BigInteger("0");
				exponent=exponent.add(getPower(charSet.size(), alienWriting.length()-1-i));
				timeLeft=timeLeft.add(base.multiply(exponent));
			}
			else if(charSet.indexOf(c)!=1)
			{
				int number=(charSet.indexOf(c));
				BigInteger base=new BigInteger(Integer.toString(number));
				BigInteger exponent = new BigInteger("0");
				exponent=exponent.add(getPower(charSet.size(), alienWriting.length()-1-i));
				timeLeft=timeLeft.add(base.multiply(exponent));
			}
		}
		
		return timeLeft;
	}
	
	private BigInteger getPower(int base, int expo) 
	{
		BigInteger bigBase=new BigInteger(Integer.toString(base));
		BigInteger result=new BigInteger("1");
		for(int i=0;i<expo;i++)
		{
			result=result.multiply(bigBase);
		}
		return result;
	}
	private long getSeconds(String message,ArrayList<Character> charList) 
	{
		long seconds=0;
		char c;
		for(int i=0;i< message.length();i++)
		{
			c= message.charAt(i);
			if(charList.indexOf(c)==0)
			{
				seconds=seconds+(charList.indexOf(c)+1)*(long) Math.pow(charList.size(), message.length()-1-i);
			}
			else if(charList.indexOf(c)!=1)
			{
				seconds=seconds+(charList.indexOf(c))*(long) Math.pow(charList.size(), message.length()-1-i);
			}
		}
		return seconds;
	}
	private ArrayList<Character> uniqueChars(String writingOnWall) 
	{
		ArrayList<Character> uniqueList = new ArrayList<Character>();
		char c;
		
		for(int i =0; i<writingOnWall.length();i++)
		{
			c=writingOnWall.charAt(i);
			if(!uniqueList.contains(c))
			{
				uniqueList.add(c);
			}
		}
		
		return uniqueList;
	}
}

