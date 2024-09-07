public class SecondaryDiagonalSum {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        // Summing the secondary diagonal elements
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][2 - i];
        }

        System.out.println("Sum of secondary diagonal elements: " + sum);
    }
}
