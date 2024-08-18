import java.util.Scanner;
class Zero{
	public static void zeroToEnd(int a[],int n){
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				a[count++]=a[i];
			}
		}
		while(count<n){
			a[count++]=0;
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		zeroToEnd(a,n);
		System.out.println("array after pushing the elements:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}

	}
}