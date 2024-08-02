import java.util.*;
class Frequency{
	public static int find(String s, char c){
		int count=0;
		int i=0;
		while(i<s.length()){
			if(s.charAt(i)==c){
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=scn.nextLine();
		System.out.println("enter the char:");
		char c=scn.next().charAt(0);
		System.out.println("The frequency of "+ c +" in the string "+ s +" is "+ find(s,c));
	}
}