import java.util.*;
class Fibinocci{
	public static int fibinocci(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibinocci(n-1)+fibinocci(n-2);
		}
	}

	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(fibinocci(i)+" ");
		}
	}	
}