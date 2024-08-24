import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int stars=1;
		int spaces=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			stars++;
		}
	}

}
