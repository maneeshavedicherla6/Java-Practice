import java.util.*;
class Substring1{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=scn.nextLine();
		for(int i=0;i<s.length()-1;i++){
			for(int j=i+1;j<s.length();j++){
				if(isPalindrome(s,i,j)){
					System.out.println(s.substring(i,j+1));
				}
			}
		}
	}

	public static boolean isPalindrome(String s,int start,int end){
		int i=start,j=end;
		while(i<j){
			if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}