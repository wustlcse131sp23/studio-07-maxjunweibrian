package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
private double width;

	public static void main(String[] args) {
	Rectangle R1 = new Rectangle(.5,.6);
	R1.DrawRectangle();
	System.out.print(R1.getArea());
	}

	public double getlength()
	{
		return length;
	}
	
	public double getwidth()
	{
		return width;
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*length+2*width;
	}
	public boolean isSquare()
	{
	if (length == width)
		{
		return true;
		}
	else return false;
	}
	
	public void DrawRectangle()
	{
		StdDraw.rectangle(.5, .5, width/2, length/2);
	}
	
	
}
