package prcatice;
class mulinheritance 
{
	public static void main(String[] args)
	{
		jeevan obj = new jeevan();
		obj.gowdaMethod();
		obj.nithiMethod();
		obj.data();
	}
}
class jeevan extends gowda
{
	public void gowdaMethod()
	{
		System.out.println("calling gowda method");
	}
}
class gowda extends data
{
	public void nithiMethod()
	{
		System.out.println("calling nithi matod");
	}
}
class data
{
	public void data()
	{
		System.out.println("calling data method");
	}
}
