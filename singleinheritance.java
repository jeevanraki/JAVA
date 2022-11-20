package prcatice;

public class singleinheritance
{
	public static void main(String[] args)
	{
		salary obj = new salary();
		obj.nameMethod();
		obj.callingMethod();
     }
}
	class salary extends name
	{
		public void callingMethod()
		{
			System.out.println("calling the calling method");
		}
		
	}
	class name
	{
		public void nameMethod()
		{
			System.out.println("calling the name method");
		}
		
	}

