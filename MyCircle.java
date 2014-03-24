
public class MyCircle {
	
	private double radius;
	private double x;
	private double y;
	
	public void setX(double value)
	{
		x = value;
	}
	
	public void setY(double value)
	{
		y = value;
	}
	
	public void setRadius(double value)
	{
		radius = value;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return (radius * radius) * Math.PI;
	}
	
	public boolean doesOverlap(MyCircle oC)
	{
		double distance = Math.sqrt((Math.pow(x - oC.x, 2) + Math.pow(y-oC.y, 2)));
		
		if ((radius + oC.radius) > distance)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
}
