package Day2;

public class Box2D {

	int length;
	int breadth;
	Box2D()
	{
		length=1;
		breadth=1;
	}
	Box2D(int length,int breadth)
	{
		int area;
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea()
	{
		System.out.println("the area of box2d is :"+(length*breadth));
	}

}