import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int space=5;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n) 
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
