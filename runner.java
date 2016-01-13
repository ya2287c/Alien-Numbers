import java.util.Scanner;


public class runner 
{
	public static void main(String[] args) 
	{
		Boolean taskDone=false;
		Scanner s= new Scanner(System.in);
		System.out.println("User or File?");
		do{
			if(s.hasNext("User")||s.hasNext("user"))
			{
				User u= new User();
				u.runMessage();
				taskDone=true;
			}
			else if(s.hasNext("File")||s.hasNext("file"))
			{
				System.out.println("Run small inputs or large input?");
				s.next();
				FileInput f= new FileInput();
				do{
					if(s.hasNext("Small")||s.hasNext("small"))
					{
						f.Runfile("A-small-practice.in");
						taskDone=true;
					}
					else if(s.hasNext("Large")||s.hasNext("large"))
					{
						f.Runfile("A-large-practice.in");
						taskDone=true;
					}
					else
					{
						System.out.println("Please enter: 'small or large'");
						s.next();
					}
				}while((!s.hasNext("Small")||!s.hasNext("small")||
					   !s.hasNext("Large")||!s.hasNext("large"))&&
					   !taskDone);
			}
			else
			{
				System.out.println("Please enter: 'User or File'");
				s.next();
			}
			
		}while ((!s.hasNext("User")||!s.hasNext("user")||
				!s.hasNext("File")||!s.hasNext("file"))&&
				!taskDone);
		s.close();
    }
}

