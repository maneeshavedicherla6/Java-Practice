
import java.util.*;
class Palindrome{
	static boolean palindrome(String s){
		int i=0;
		int j=s.length()-1;
		while(i<=j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(palindrome(s));
	}
}