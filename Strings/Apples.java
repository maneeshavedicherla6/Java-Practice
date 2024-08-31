import java.util.*;
class Apples {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=scn.nextLine();
        char K=scn.next().charAt(0);
        char K1=scn.next().charAt(0);
        char[] c=s.toCharArray();
        int n=s.indexOf(K);
        int n1=s.indexOf(K1);
        for (int i = 0; i < c.length; i++) {
            if (c[i] == K) {
                c[i] = K1;
            } else if (c[i] == K1) {
                c[i] = K;
            }
        }
        String o=new String(c);
        System.out.println(o);
    }
}