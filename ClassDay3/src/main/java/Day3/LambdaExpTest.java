package Day3;


@functionalInterface
interface Square{
	public double areaSquare(int length);
}
@functionalInterface
interface Triangle
{
	public double areaTriangle(int length,int height);
}
public class LambdaExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=(length) ->length*length;

	}

}

