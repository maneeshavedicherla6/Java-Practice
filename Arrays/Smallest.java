import java.util.*;
class Smallest{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scn.nextInt();
		System.out.println("enter the array:");
		int[] a=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++){
			a[i]=scn.nextInt();
		}
		System.out.println("The Smallest element in the array is:");
		int s=a[0];
		for(int i=1;i<size;i++){
			if(a[i]<s){
				s=a[i];
			}
		}
		System.out.println(s);
	}
}