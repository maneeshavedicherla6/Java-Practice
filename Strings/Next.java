import java.util.*;
class Next{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the character:");
		char ch=scn.next().charAt(0);
		for(int i=0;i<5;i++){
			ch++;
			if(ch>'z'){
				ch='A';
				System.out.print(ch+" ");
			}
			else if(ch>'Z' && ch<'a'){
				ch='a';
				System.out.print(ch+" ");
			}
			else{
				System.out.print(ch+" ");
			}
		}
	}
}