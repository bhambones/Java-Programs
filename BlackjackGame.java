import java.util.Scanner;
import java.util.*;

public class BlackjackGame {
	
	public static void main(String[] args) {
		
		String anotherCard, playAgain = "yes", ctn;
		int nextCard, card1, card2, dCard1, dCard2;
		int cardTotal = 0, dTotal = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		Random random = new Random();
		
		// Begin dealing the players first two cards
		
		while (playAgain.equalsIgnoreCase("yes"))
		{
			//dealers first two random cards
			dCard1 = random.nextInt(10) + 1;
			dCard2 = random.nextInt(10) +1;
			
			//players first two random cards and card total
			card1 = random.nextInt(10) + 1;
			card2 = random.nextInt(10) + 1;
			cardTotal = card1 + card2;
			
			System.out.println("Dealer shows: " + dCard1);
			
			//Display players first two cards & card total
			System.out.println("Players First Cards: " + card1 + ", " + card2);
			System.out.println("Total: "+ cardTotal);
				
			System.out.print("Another Card (y/n)?: ");
			anotherCard = keyboard.nextLine();
			
			while (anotherCard.equalsIgnoreCase("y"))
			{
				nextCard = random.nextInt(10) + 1;
				cardTotal += nextCard;
				System.out.println("Next Card: " + nextCard);
				System.out.println("Player Total: " + cardTotal);
				
				if (cardTotal == 21)
				{
					anotherCard = "n";
				}
				
				if (cardTotal > 21)
				{
					System.out.println("You busted, Dealer Wins");
					System.out.println("Do you want to play again? (yes/no): ");
					playAgain = keyboard.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))					
						anotherCard = " ";
					else 
						System.exit(0);
				}
					
				if (cardTotal < 21)
				{
				
					System.out.print("Another Card (y/n)?: ");
					anotherCard = keyboard.nextLine();
					
				}
			}
				while (anotherCard.equalsIgnoreCase("n"))
				{
					System.out.println("Dealers first cards: " + dCard1 + ", " + dCard2);
					dTotal = dCard1 + dCard2;
					
					
					if (dTotal < 17)
					{
						System.out.print("Press c to continue dealers cards: ");
						ctn = keyboard.nextLine();
						while (ctn.equalsIgnoreCase("c") && dTotal < 17)
						{
							nextCard = random.nextInt(10) + 1;
							System.out.println("Dealers next card: " + nextCard);
							dTotal += nextCard;
							System.out.println("Dealer Shows: " + dTotal);
							
						}
					}
					if (dTotal > 21)
					{
						System.out.println("Dealer Busts, You Win!");
						System.out.print("Play Again? (yes/no): ");
						playAgain = keyboard.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))					
							anotherCard = "y";
						else 
							System.exit(0);
					}
					if (dTotal >= 17 && dTotal <= 21)
					{
						System.out.println();
						System.out.println("Results:");
						System.out.println("---------");
						System.out.println("Dealer Total: " + dTotal);
						System.out.println("Player Total: " + cardTotal);
						if (cardTotal > dTotal)
						{
							System.out.print("You Win, Play Again? (yes/no): ");
							playAgain = keyboard.nextLine();
							if (playAgain.equalsIgnoreCase("yes"))					
								anotherCard = "y";
							else 
								System.exit(0);
						}
						if (dTotal > cardTotal)
						{
							System.out.println("You Lose, Dealer Wins");
							System.out.print("Play Again? (yes/no): ");
							playAgain = keyboard.nextLine();
							if (playAgain.equalsIgnoreCase("yes"))					
								anotherCard = "y";
							else 
								System.exit(0);
						}
						if (dTotal == cardTotal)
						{
							System.out.println("Player Shows: " + cardTotal);
							System.out.println("Game is a push ");
							System.out.print("Play Again? (yes/no): ");
							playAgain = keyboard.nextLine();
							if (playAgain.equalsIgnoreCase("yes"))					
								anotherCard = "y";
							else 
								System.exit(0);
						}
					}
					
					
				}
			
		}
	}
}
			


