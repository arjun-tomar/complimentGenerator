//Arjun Tomar
//2/27/2023
//Gives the user a big compliment to brighten up their day. Compliment can be random or be chosen in categories
import java.util.*;
import static java.lang.Math.;

public class complimentGenerator
{
	public static void main(String args[])
	{
		int number = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Would you like to choose a type of compliment? (Y/N)");
		String request = s.nextLine();
		if(request == 'Y' || request == 'y')
		{
			System.out.println("What type of compliment would you like? Respond with the corresponding numbers.\n 1. Heartwarming \n 2. Friendly \n 3. Extremely Positive");
			number = s.nextLine();
		}
		else
		{
			if(request == 'N' || request == 'n')
			{
				System.out.println("Alright, printing out a random compliment for you!");
			}
			else
			{
				System.out.println("Sorry, I could not understand what you said, so I will assume you said N.");
			}
		}
		//I am aiming for 100ish compliments, 25 random, 25 Heartwarming, 25 Friendly, and 25 Extremely positive
		for(int i = 0; i < request; i++)
		{
			if (number != 1 || number != 2 || number != 3)
			{
				Random random = new Random();
  				int randomizer = randomNum.nextInt(100);
			}
		}
	}
}
