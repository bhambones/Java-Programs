
public class Circle {
	private Point origin;
	private double radius;
	
	public Circle(Point o, double r)
	{
		setOrigin(o);
		setRadius(r);
	}
	
	public Circle(double xValue, double yValue, double r)
	{
		origin = new Point(xValue,yValue);
		setRadius(r);
	}
	
	public Circle()
	{
		setX(0.0);
		setY(0.0);
		setRadius(1);
	}
	
	public Circle(Circle c)
	{
		setOrigin(c.getOrigin());
		setRadius(c.getRadius());
	}
	
	Point getOrigin()
	{
		return new Point(origin);
	}
	
	public void setOrigin(Point p)
	{
		origin.setX(p.getX());
		origin.setY(p.getY());
	}
	
	public void setX(double value)
	{
		origin.setX(value);
	}
	
	public double getX()
	{
		return origin.getX();
	}
	
	public void setY(double value)
	{
		origin.setY(value);
	}
	
	public double getY()
	{
		return origin.getY();
	}
	
	public void setRadius(double value)
	{
		radius = value;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return (radius * radius) * Math.PI;
	}
	
	public String toString()
	{
		return "(" + origin.getX() + ", " + origin.getY() + ", " + radius + ")";
	}
	
	public boolean equals(Circle c)
	{
		if (origin.getX() == c.getX() && origin.getY() == c.getY() &&
		getRadius() == c.getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean doesOverlap(Circle oC)
	{
		double distance = Math.sqrt((Math.pow(getX() - oC.getX(), 2) + Math.pow(getY()-oC.getY(), 2)));
			
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