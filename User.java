import java.util.Scanner;


public class User 
{
	public User()
	{
		
	}
	public void runMessage()
	{
		Scanner crypticMessage= new Scanner(System.in);
		String alien;
		alienCalculator a=new alienCalculator();
		
		System.out.println("Enter the alien number");
		alien=crypticMessage.next();
		System.out.print("You have ");
		a.calculate(alien);
		System.out.println(" seconds to live");
		crypticMessage.close();
	}
}

