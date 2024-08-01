import java.util.*;
public class VowelDup{
	private static int vowels(String s){
		boolean[] seen=new boolean[5];
		int count=0;
		for(int i=0;i<s.length();i++){
			char c = Character.toLowerCase(s.charAt(i));
			if (c =='a' && !seen[0]){
				seen[0]=true;
				count++;
			}
			else if (c =='e' && !seen[1]){
				seen[1]=true;
				count++;
			}
			else if (c =='i' && !seen[2]){
				seen[2]=true;
				count++;
			}
			else if (c =='o' && !seen[3]){
				seen[3]=true;
				count++;
			}
			else if (c =='u' && !seen[4]){
				seen[4]=true;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scn.nextLine();
		int n=vowels(s);
		System.out.println(n);
	}
}