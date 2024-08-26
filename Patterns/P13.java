import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		//int ch=97;for small a
		int ch=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ch+" ");
			}
			ch++;
			System.out.println();
		}

	}

}