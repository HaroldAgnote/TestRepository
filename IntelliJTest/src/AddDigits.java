import java.util.Scanner;

/**
 * "This class adds digits the digits of a number inputted into the program."
 *
 * @author Harold Agnote
 */
public class AddDigits
{
	public static void main(String[]args)
	{
		while (true)
		{
			System.out.println("Input Number");
			int number = getInt();
			
			int sum = addDigits(number);
			
			System.out.println("The sum of all the digits in " + number + " is " + sum);
		}
	}
	
	/**
	 * This method is called when the user needs to input an Integer value (i.e.
	 * 5). The method assures the value inputted is a Integer and not a String
	 * and then returns the value to the program it was called.
	 *
	 * @return A Integer value inputted by the user
	 */
	public static int getInt()
	{
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		int validNum = 0;
		while (!valid)
		{
			if (in.hasNextInt())
			{
				validNum = in.nextInt();
				valid = true;
			}
			else
			{
				String blank = in.nextLine();
				if (blank.trim().isEmpty())
				{
					validNum = 0;
					valid = true;
				}
				else
				{
					in.next();
					System.out.println("Invalid");
				}
			}
		}
		return validNum;
	}
	
	public static int addDigits(int num)
	{
		int sum = 0;
		if (num > 10)
		{
			sum += num%10;
			sum += addDigits(num/10);
		}
		else
		{
			sum += num;
		}
		
		return sum;
	}
	
}
