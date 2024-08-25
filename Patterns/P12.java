import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=i*(i+1)/2;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count-j+1);
				if(j<=i-1) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

	}

}