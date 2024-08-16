import java.util.*;
class Reverse{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Reversed array:");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}