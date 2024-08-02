import java.util.*;
class Swaptemp{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}