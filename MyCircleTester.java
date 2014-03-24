
public class MyCircleTester {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(1.0, 2.0, 3.0);
		Circle c4 = new Circle(1.0, 6.0, .5);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.toString());
		System.out.println(c4.toString());
		if (c1.equals(c4))
		{
			System.out.println("c1 equals c4");
		}
		else
		{
			System.out.println("c1 does not equal c4");
		}
		
		if (c1.doesOverlap(c4))
		{
			System.out.println("c1 Overlaps c4");
		}
		else
		{
			System.out.println("c1 Does Not Overlap c4");
		}
		
	}
}
