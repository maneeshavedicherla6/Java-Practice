public class P7 {

	public static void main(String[] args) {
		int space=5;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			star++;
			space--;
			
		}
	}

}
