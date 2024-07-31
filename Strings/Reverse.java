
import java.util.*;
class Reverse{
	static String reverseString(String s){
		String t=" ";
		for(int i=s.length()-1;i>=0;i--){
			t=t+s.charAt(i);
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(reverseString(s));
	}
}