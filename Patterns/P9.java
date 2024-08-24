import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}