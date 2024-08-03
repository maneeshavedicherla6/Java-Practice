
import java.util.*;
class Factors{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scn.nextInt();
		if(n>=0){
			for(int i=1;i<=n;i++){
				if(n%i==0){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		else{
			for(int i=-1;i>=n;i--){
				if(n%i==0){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}