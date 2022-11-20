package prcatice;

class hinheritance 
{
	public static void main(String[] args)
	{
		chethu obj = new chethu();
		
		obj.chethuMethod();
		obj.parentMethod();
		
	}

}
class Mallesh 
{
	public void parentMethod()
	{
		System.out.println("calling the parent     method");
	}
}
class chethu extends Mallesh
{
	public void chethuMethod()
	{
		System.out.println("calling the chandu method");
		
	}
	
}
class chandu extends Mallesh
{
	public void chanduMethod()
	{
		System.out.println("calling chandu method");
	}
	
}