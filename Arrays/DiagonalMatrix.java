public class DiagonalMatrix {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Main diagonal elements:");
        // Main diagonal (top-left to bottom-right)
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\nSecondary diagonal elements:");
        // Secondary diagonal (top-right to bottom-left)
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }
    }
}
