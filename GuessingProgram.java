import java.util.*;
public class GuessingProgram {
	public static void main(String[] args) {
		do
		{
			playOneGame();
		}
			while (shouldPlayAgain());
	}
		
	public static void playOneGame()
	{
		
		char input = 0;
		Scanner keyboard = new Scanner(System.in);
		
		NumberGuesser game = new NumberGuesser(1,100);
		
		System.out.println("NUMBER GUESSER GAME");
		System.out.println("-------------------");
		System.out.println("Think of a number between 1 and 100");
		
		while (input != 'c')
		{
			System.out.print("Is your number " + game.getCurrentGuess() + "?" + 
			" (h/l/c): ");
			input = keyboard.next().charAt(0);
			if (input == 'h' || input == 'H')
				game.higher();
			else if (input == 'l' || input == 'L')
				game.lower();
			else if (input == 'c' || input == 'C')
				game.reset();
				
		}
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
