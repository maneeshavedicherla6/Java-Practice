public class StringComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "orange";
        String str3 = "apple";

        // Using equals() method
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        }

        // Using compareTo() method
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("str1 and str2 are equal (compareTo).");
        } else if (result < 0) {
            System.out.println("str1 is lexicographically less than str2.");
        } else {
            System.out.println("str1 is lexicographically greater than str2.");
        }
    }
}
