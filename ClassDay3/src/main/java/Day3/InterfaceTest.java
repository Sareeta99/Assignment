package Day3;

import javamavenproject.Drawable;
import javamavenproject.Rectangle;
import javamavenproject.circle;

nterface Drawable
{
	void draw();
	
	void area();
	
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	public void area()
	{
		System.out.println("area of rectangle");
	}
	
}
 class circle implements Drawable
{
public void draw()
{
	System.out.println("drawing circle");
}
public void area()
{
	System.out.println("area of circle");
}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Drawable d1=new Rectangle();
		d1.draw();
		d1.area();
		
		Drawable d2=new circle();
		d2.draw();
		d2.area();

	}

}
