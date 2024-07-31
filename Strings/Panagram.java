
import java.util.*;
class Panagram{
	static boolean isPanagram(String s){
		String t="abcdefghijklmnopqrstuvwxyz";
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<t.length();i++){
			if(s.indexOf(t.charAt(i)) >=0){
				count++;
			}
			else{
				break;
			}
		}
		if(count==26){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(isPanagram(s));
	}
}