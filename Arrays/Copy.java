
import java.util.*;
class Copy{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in the array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}