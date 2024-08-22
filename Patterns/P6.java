import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i*j<10)
				{
					System.out.print("0");
				}
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}