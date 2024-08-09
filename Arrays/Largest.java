import java.util.*;
class Largest{
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		int l=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>l){
				l=a[i];
			}
		}
		System.out.println(l);
	}
}