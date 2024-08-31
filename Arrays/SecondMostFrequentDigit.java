import java.util.Scanner;

public class SecondMostFrequentDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Read the length of the number (input, but not used in processing)
        System.out.println("Enter the length of the number:");
        int n = scn.nextInt(); // This is not used directly

        // Read the number as a string
        System.out.println("Enter the number:");
        String number = scn.next();

        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            frequency[ch - '0']++; // Increment the corresponding digit's frequency
        }

        // Find the largest and second largest frequencies
        int largest = 0;
        int secondLargest = 0;

        for (int freq : frequency) {
            if (freq > largest) {
                secondLargest = largest;
                largest = freq;
            } else if (freq > secondLargest && freq < largest) {
                secondLargest = freq;
            }
        }

        // Print the result
        if (secondLargest == 0) {
            System.out.println("No second largest frequency found.");
        } else {
            System.out.println(secondLargest);
        }

        // Close the scanner
        scn.close();
    }
}
