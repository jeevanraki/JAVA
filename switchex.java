package prcatice;

import java.util.Scanner;

public class switchex 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		num= sc.nextInt();	
		
		switch(num)
		{
		case 1:
			System.out.println("entered number is 1");
			break;
		case 2:
			System.out.println("enetered number is 2");
			break;
		case 3:
			System.out.println("entered number is 3");
			break;
		case 4:
		    System.out.println("eneres number is 4");
		    break; 
		    		default :
		    			System.out.println("wrong number");
		}
		sc.close();		
	}

}
