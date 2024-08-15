import java.util.*;
class LargestNumber{
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println("Largest Number: "+largest(a,n));
	}

	public static int largest(int[] a,int n){
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[n-1];
	}
}