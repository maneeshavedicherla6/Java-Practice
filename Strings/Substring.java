
import java.util.*;
class Substring{
	static void subString(String st){
		int n=st.length();
		for(int a=1;a<n;a++){
			for(int b=0;b<=(n-a);b++){
				for(int c=b;c<=(b+a)-1;c++){
					System.out.print(st.charAt(c));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String d=scn.nextLine();
		subString(d);
	}
}