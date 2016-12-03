import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * "Class Description"
 *
 * @author Harold Agnote
 */
public class Test
{
	public static void main(String[] args)
	{
		String file = "numbers.txt";
		writeNumbers(file);
		System.out.println("Sum is " + findSum("values.txt"));
	}
	
	public static void writeNumbers(String file)
	{
		try
		{
			PrintWriter write = new PrintWriter(file);
			for (int i = 1; i <= 50; i++)
			{
				int random = (int) (Math.random()*100) + 1;
				write.println(random);
			}
			write.close();
		}
		catch (FileNotFoundException fnf)
		{
			System.out.println("Error");
		}
	}
	
	public static int findSum(String file)
	{
		int sum = 0;
		try
		{
			Scanner read = new Scanner(new File(file));
			while (read.hasNext())
			{
				sum += read.nextInt();
				//read.nextLine();
			}
		}
		catch (FileNotFoundException fnf)
		{
			System.out.println("Error");
		}
		return sum;
	}
}
