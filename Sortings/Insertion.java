import java.util.*;
class Insertion{
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
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a){
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}