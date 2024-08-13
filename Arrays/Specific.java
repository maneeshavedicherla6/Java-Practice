//finding two numbers in an array that add up to a specific target;
import java.util.*;
class Specific{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=scn.nextInt();
		System.out.println("enter the elements in array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scn.nextInt();
		}
		System.out.println("enter the target:");
		int t=scn.nextInt();
		int[] result=findSum(a,t);
		if(result!=null){
			System.out.println("sum of "+result[0]+" and "+result[1]);
		}
		else{
			System.out.println("No two numbers add up to the target");
		}
	}

	public static int[] findSum(int[] a,int t){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++){
			int c=t-a[i];
			if(map.containsKey(c)){
				return new int[] {map.get(c),i};
			}
			map.put(a[i],i);
		}
		return null;
	}
}