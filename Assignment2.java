import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		do
		{
			playOneGame();
		}
			while (shouldPlayAgain());
	}
	
	public static void playOneGame()
	{
		int min = 1, max = 100;
		char response = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("GUESS YOUR NUMBER!!!");
		System.out.println("--------------------");
		System.out.println("Choose a number in your head between 1 and 100.");
		
		while (response != 'c')
		{
			int midpoint = getMidpoint(min, max);
			response = getUserResponseToGuess(midpoint);
			if (response == 'l' || response == 'L')
				max = midpoint;
			if (response == 'h' || response == 'H')
				min = midpoint;
		}
	}
	
	public static int getMidpoint(int low, int high)
	{
		int results = (high + low) / 2 ;
		return results;
	}
	
	public static char getUserResponseToGuess(int guess)
	{
		char results;
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Is it " + guess + "?" +"  (h/l/c): ");
		results = keyboard.next().charAt(0);
		return results;
	}
	
	public static boolean shouldPlayAgain()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Great! Do you want to play again? (y/n): ");
		String input = keyboard.nextLine();
		if (input.equalsIgnoreCase("y"))
			return true;
		else
			return false;
	}

}

