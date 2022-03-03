package Day3;




class A
{
	int a;
	int b;
	int c;
	A()
	{
		a=1;
		b=2;
		c=3;
		System.out.println("inside a constructor");
	}
	public void showData()
	{
		System.out.println("A="+a+"B="+b+"C="+c);
		
	}
}
class B extends A
{
	int a;
	int b;
	int c;
	B(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Inside B constructor");
		
	}
	public void showData()
	{
		System.out.println("A="+a+"B="+b+"C="+c);
		
	}
}
class C extends B
{
	int a;
	int b;
	int c;
	C()
	{
		super(10,20,30);
		a=100;
		b=200;
		c=300;
		System.out.println("Inside C constructor");
		
	}
	public void showData()
	{
		System.out.println("A="+super.a+"B="+b+"C="+c);
		
	}
}

public class TestConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.showData();

	}

}

