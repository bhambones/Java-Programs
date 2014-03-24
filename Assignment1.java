import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		int count;
		char restart = 'y';
		
		Scanner input = new Scanner(System.in);
		
		while (restart !='n')
		{
			System.out.print("How man astericks should i print? ");
			count = input.nextInt();
			for (int i = 0; i < count; i++)
			{
				System.out.println("*");
			}
			System.out.println();
			System.out.print("Restart test? (y/n): ");
			restart = input.next().charAt(0);
		}
	}
}

