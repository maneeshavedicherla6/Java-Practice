
import java.util.*;
class Factorial{
	static int factorial(int n){
		if(n==0){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scn.nextInt();
		System.out.println("factorial of "+n+" is : "+factorial(n));
	}
}