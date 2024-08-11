import java.util.*;
class Even{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in the array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println("enter the even element:");
		for(int i=1;i<a.length;i=i+2){
			System.out.print(a[i]+" ");
		}
	}
}