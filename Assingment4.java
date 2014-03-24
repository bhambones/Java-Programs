// Brian Hammons

import java.util.Scanner;
import java.util.Arrays;

public class Assingment4 {

	public static void main(String[] args) {
		
		int cards = 5;
		int [] pokerHand = new int[cards];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter five numeric cards, no face cards. Use #'s 2-9\n");
		for (int i = 0; i < cards; i++)
		{
			System.out.print("Card " + (i + 1) + ": ");
			pokerHand[i] = keyboard.nextInt();
		}
		
		System.out.println();
		System.out.println("Your five card hand is: ");
		
		for (int c : pokerHand)
		{
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		if (containsPair(pokerHand))
		{
			System.out.println("Pair!");
		}
		else if (containsTwoPair(pokerHand))
		{
			System.out.println("Two Pair!");
		}
		else if (containsThreeOfaKind(pokerHand))
		{
			System.out.println("Three of a Kind!");
		}
		else if (containsStraight(pokerHand) && (containsFourOfaKind(pokerHand)) != true)
		{
			System.out.println("Straight!");
		}
		else if (containsFullHouse(pokerHand))
		{
			System.out.println("FullHouse!");
		}
		else if (containsFourOfaKind(pokerHand))
		{
			System.out.println("Four of a Kind!");
		}
		else
		{
			System.out.println("High Card!");
		}

	}
	
	public static boolean containsPair(int [] hand)
	{
		boolean pair = false;
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if (hand[i] == hand[j])
					count++;
			}
		}
		if (count == 1)
			pair = true;
		return pair;
	}
	
	public static boolean containsTwoPair(int [] hand)
	{
		boolean twoPair = false;
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if (hand[i] == hand[j])	
					count++;	
			}
		}
		if (count == 2)
			twoPair = true;
		return twoPair;
	}
	
	public static boolean containsThreeOfaKind(int [] hand)
	{
		boolean threeOfaKind = false;
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if (hand[i] == hand[j])
					count++;
			}
		}
		if (count == 3)
			threeOfaKind = true;
		return threeOfaKind;
	}
	
	public static boolean containsStraight(int [] hand)
	{
		int count = 0;
		boolean straight = false;
		
		Arrays.sort(hand);
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < hand.length; j++)
			{
				if (hand[i] == hand[j] -1)
					count++;
			}	
		}
		if (count == 4)
			straight = true;
		return straight;
	}

	public static boolean containsFullHouse(int [] hand)
	{
		boolean fullHouse = false;
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if (hand[i] == hand[j])
					count++;
			}
		}
		if (count == 4)
			fullHouse = true;
		return fullHouse;
	}
	
	public static boolean containsFourOfaKind(int [] hand)
	{
		boolean fourOfaKind = false;
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if (hand[i] == hand[j])
					count++;
			}
		}
		if (count == 6)
			fourOfaKind = true;
		return fourOfaKind;
	}
	
}
	
