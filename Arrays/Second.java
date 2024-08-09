import java.util.*;
class Second{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in the array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		int s=a[0];
		int s1=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]==s) continue;
			if(a[i]<s){
				s1=s;
				s=a[i];
			}
			else if(s==s1||a[i]<s1){
				s1=a[i];
			}
		}
		System.out.println(s1);
	}
}