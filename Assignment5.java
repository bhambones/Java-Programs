import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		initialize(names, scores);
		sort(names, scores);
		display(names, scores);
	
	}
	
	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores)
	{
		String input;
		int value;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter five names and their corresponding scores\n");
		for(int i = 0; i < 5; i++)
		{
		System.out.print("Enter the name for score #" + (i + 1) + ":" );
		input = keyboard.nextLine();
		names.add(input);
		System.out.print("Enter the score for score #" + (i+ 1) + ":" );
		value = keyboard.nextInt();
		scores.add(value);
		keyboard.nextLine();
		}
		
	}
	
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
	{
		int startScan, index, minIndex, minValue;
		String move;
		for (startScan = 0; startScan < scores.size() -1; startScan++)
		{
			minIndex = startScan;
			minValue = scores.get(startScan);
			move = names.get(startScan);
			for (index = startScan + 1; index < scores.size(); index++)
			{
				if (scores.get(index) < minValue)
				{
					minValue = scores.get(index);
					move = names.get(index);
					minIndex = index;
				}
			}
			scores.set(minIndex, scores.get(startScan));
			scores.set(startScan, minValue);
			names.set(minIndex, names.get(startScan));
			names.set(startScan, move);
		}
	}
	
	public static void display(ArrayList<String> names, ArrayList<Integer> scores)
	{
		System.out.println();
		System.out.println("Top Scorers:");
		System.out.println("------------");
		for(int i = 4; i >= 0; i--)
		{
			System.out.println(names.get(i) + ": " + scores.get(i));
		}
			
	}
}
