import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileInput 
{
	public FileInput()
	{
		
	}
	public void Runfile(String DataSet)
	{
		File f=new File(DataSet);
		try {
			Scanner fileContents= new Scanner(f);
			getNumber(fileContents);
			fileContents.close();
		} catch (FileNotFoundException e) {
			System.out.println(f+ " was not Found in "+
					System.getProperty("user.dir"));
			e.printStackTrace();
		}
	}
	private void getNumber(Scanner data) 
	{
		int cases=data.nextInt();
		System.out.println(cases +" cases");
		alienCalculator number= new alienCalculator();
		for(int i=1; i<=cases;i++)
		{
			System.out.print("Case #"+i+": ");
			number.calculate(data.next());
			System.out.println("");
		}
	}
}

