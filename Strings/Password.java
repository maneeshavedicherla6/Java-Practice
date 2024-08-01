
import java.util.*;
class Password{
	static int strong(int n, String s){
		int d=1, lc=1, uc=1, sc=1;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='0' && c<='9'){
				d=0;
			}
			else if(c>='a' && c<='z'){
				lc=0;
			}
			else if(c>='A' && c<='Z'){
				uc=0;
			}
			else{
				sc=0;
			}
		}
		if((d+lc+uc+sc)>6-n){
			return (d+lc+uc+sc);
		}
		else{
			return 6-n;
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		System.out.println("enter String");
		String s=scn.next();
		System.out.println(strong(n,s));
	}
}