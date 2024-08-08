import java.util.*;
class Quick{
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
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a,int start,int end){
		if(start>=end) return;
		int pivot=a[(start+end)/2];
		int i=start,j=end;
		while(i<=j){
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}
}