package prcatice;

public class classpractice extends another
{
	int salary;
	public static void main(String[] args)
	{
		classpractice obj = new classpractice();
		obj.salary=40000;
		obj.name="Jeevan";
		System.out.println("name "+obj.name);
	    System.out.println("salary "+obj.salary);
	  
		
		
	}

}
class another
{
	String name;
}