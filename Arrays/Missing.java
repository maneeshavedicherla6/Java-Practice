import java.util.*;
class Missing{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println(findNumber(a,n));
	}

	public static int findNumber(int[] a,int n){
		int totalSum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum-totalSum;
	}

}