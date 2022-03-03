package Day2;



public class Box3D extends Box2D {


	int height;
	int length;
	Box3D()
	{
		
	height=1;
	length=5;
}
	public void calVolume()
	{
		System.out.println((super.length*breadth*height));
	}
}
