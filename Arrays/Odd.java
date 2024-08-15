import java.util.*;
class Odd{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements in array:");
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println("Elements in odd indexs:");
		for(int i=0;i<a.length;i=i+2){
			System.out.println(a[i]+" ");
		}
	}
}