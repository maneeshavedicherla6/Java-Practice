//write a program to check the given number is armstrong number or not

import java.util.Scanner;

class Armstrong
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=scn.nextInt();
		int temp=n;
		int count=0;
		while(n>0){
			count++;
			n/=10;
		}
		System.out.println(count);
		n=temp;
		int sum=0;
		while(n>0){
			int d=n%10;
			int pro=1;
			for(int i=1;i<=count;i++){
				pro*=d;
			}
			System.out.println(pro);
			sum+=pro;
			n/=10;
		}
		System.out.println(sum);
		if(sum==temp){
			System.out.println(temp+" is a Armstrong number");
		}
		else{
			System.out.println(temp+" is not a Armstrong number");
		}
	}
}
