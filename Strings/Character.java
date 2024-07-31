
import java.util.*;
class Character{
	static int countCharacter(String s,String t){
		int count=0;
		char key=t.charAt(0);
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==key){
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scn.nextLine();
		System.out.println("enter the character");
		String t=scn.nextLine();
		System.out.println(countCharacter(s,t));
	}
}