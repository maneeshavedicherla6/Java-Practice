//write a program to check the given number is 

import java.util.Scanner;
class Prime 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=scn.nextInt();
		if(n<=1){
			System.out.println(n+" is not a prime");
			return;
		}
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}
	}
}
		