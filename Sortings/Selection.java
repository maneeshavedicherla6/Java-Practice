
import java.util.*;
class Selection{
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
		for(int i=0;i<a.length-1;i++){
			int index=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[index]) index=j;
			}
			if(i!=index){
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}	
	}
}