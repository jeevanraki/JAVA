package prcatice;

import java.util.Scanner;
import java.util.Timer;

class nstedif
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any number");
		num = sc.nextInt();
		if(num>0)
		{
			System.out.println("positive number");
			if(num % 2 == 0) {
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		else if(num <0)
		{
			System.out.println("negative number");
		    if(num%2==0)
		    {
		    	System.out.println("even number");
		    }
		    else 
		    {
		        System.out.println("odd number");
		    }
		}
		else
			System.out.println("zero");
		
		sc.close();
		}
	
				
		
	}


