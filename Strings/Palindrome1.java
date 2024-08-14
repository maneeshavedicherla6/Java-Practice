import java.util.Scanner;
class Palindrome1{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=scn.nextLine();
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s){
		char[] a=s.toLowerCase().toCharArray();
		int i=0,j=a.length-1;
		while(i<j){
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}