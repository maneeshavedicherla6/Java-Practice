
import java.util.*;
class Swap{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}