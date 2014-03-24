
public class ArrayMethods {
	public static void main(String[] args) {
		boolean results;
		int [] array = {1, 2, -3, 4, 5};
		
		results = noNegatives(array);
		if (results == false)
			System.out.println("No negative numbers in array");
		else
			System.out.println("There are negative numbers in the array");
	}

	public static boolean noNegatives(int a[])
	{
		int index;
		boolean negative = false;
		for (index = 0; index < a.length; index++)
		{
			if (a[index] < 0)
				negative = true;
		}
		return negative;
		
	}
}
