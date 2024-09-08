import java.util.Scanner;
class Great{
    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The greatest of three numbers is: " + greatest);
    }
}