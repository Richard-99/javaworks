import java.util.*;
class num
{
	public static void main(String []args)
	{
		Random r = new Random();
		int numberoftries = 0;
		int numbertoguess = r.nextInt(100);
		boolean f = false;
		int guess;
		Scanner sc = new Scanner(System.in);
		try
		{
			while(f == false)
			{
				System.out.println("Guess number between 1-100:");
				guess = sc.nextInt();
				numberoftries++;
				if(guess > 1 && guess < 100)
				{
					if(guess == numbertoguess)
					{
						f = true;
					}
					else if(guess > numbertoguess)
					{
						System.out.println("Guess is too high !");
					}
					else if (guess < numbertoguess)
					{
						System.out.println("Guess is too low !");
					}
				}
				else
				{
					throw new Exception();
				}
			}
			System.out.println("You win !");
			System.out.println("Number was :" + numbertoguess);
			System.out.println("Number of tries :" + numberoftries);
		}
		catch(Exception e)
		{
			System.out.println("Number is out of range (1-100) !");
		}
	}
}
