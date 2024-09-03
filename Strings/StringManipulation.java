public class StringManipulation {
    public static void main(String[] args) {
        String str = "Java programming language";

        // Extract substring
        String substring = str.substring(5, 16);
        System.out.println("Substring from index 5 to 15: " + substring);

        // Replace a substring
        String replacedStr = str.replace("Java", "Python");
        System.out.println("Replaced String: " + replacedStr);
    }
}
