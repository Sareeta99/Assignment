package Day2;


class Temp
{
	String name;
	String dept;
	static String org;
	public Temp(String name,String dept)
	{
		System.out.println("inside the constructor...");
		this.name=name;
		this.dept=dept;
	}
	public void showData()
	{
		System.out.println("name:"+name+" "+"dept"+""+"org:"+org);
	}
	public static void showDetails()
	{
		System.out.println("org:"+org);
	}
	static
	{
		System.out.println("inside the static block");
	}
	{
		System.out.println("inside the non static block");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		Temp.org="NSEI Technologies Ltd";
		Temp t1=new Temp("kumar","IT");
		Temp t2=new Temp("Pavan","QA");
		Temp t3=new Temp("sunil","Finance");
        t1.showData();
        t2.showData();
        t3.showData();
        t2.org="NSEIT";
        t1.showData();
        t2.showData();
        t3.showData();
        Temp.showDetails();
	}

}

