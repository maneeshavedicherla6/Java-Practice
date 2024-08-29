//write a program to print next palindrome number from the given number

import java.util.Scanner;
class Next
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number: ");
		int start=scn.nextInt();
		for(int i=start;i<=i+1;i++)
		{
			if(ispal(i))
			{
				System.out.println(i);
				break;
			}
		
		}
	}
	public static boolean ispal(int n)
	{
		int num=n;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		if(n==rev){
			return true;
		}
		else{
			return false;
		}
	}
}
		