
import java.util.*;
class Space{
	static int spaceCount(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(spaceCount(s));
	}
}