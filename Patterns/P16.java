import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			char chRev=(char)(ch+i-1);
			if(i%2==0) 
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(chRev-- +" ");
					ch++;
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}

}
