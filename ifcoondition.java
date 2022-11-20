package prcatice;

import java.util.Scanner;

public class ifcoondition
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		num = sc.nextInt();
		if(num>0) 
		{
			System.out.println("Greater than zero");
		}
		else if(num>0)
		{
			System.out.println("lees than zero");
		}
		else {
			System.out.println("zero");
		}
		sc.close();
		
	}

}
