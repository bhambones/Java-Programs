
public class NumberGuesser {
	private int min, max, midpoint, origMin, origMax;
	
	public NumberGuesser()
	{
		min = 1;
		max = 100;
	}
	public NumberGuesser(int lowerBound, int upperBound)
	{
		min = lowerBound;
		max = upperBound;
		origMin = lowerBound;
		origMax = upperBound;
	}
	
	public void higher()
	{
		min = midpoint;
	}
	
	public void lower()
	{
		max = midpoint;
	}
	
	public int getCurrentGuess()
	{
		midpoint = (max + min) /2;
		return midpoint;
	}
	
	public void reset()
	{
		min = origMin;
		max = origMax;
	}
}
