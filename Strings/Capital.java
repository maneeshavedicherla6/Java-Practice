import java.util.*;
class Capital {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scn.nextLine();
        int upper=0;
        int lower=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65 && c<=90){
                upper++;
            }
            if(c>=97 && c<=122){
               lower++; 
            }
            if(c>=48 && c<=57){
                num++;
            }
        }
        System.out.println("upper"+" = "+upper);
        System.out.println("lower"+" = "+lower);
        System.out.println("num"+" = "+num);
    }
}