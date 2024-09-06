public class DiagonalMatrixCheck {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 0, 0},
            {0, 5, 0},
            {0, 0, 9}
        };

        boolean isDiagonal = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if non-diagonal elements are zero
                if (i != j && matrix[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
        }

        if (isDiagonal) {
            System.out.println("The matrix is a diagonal matrix.");
        } else {
            System.out.println("The matrix is not a diagonal matrix.");
        }
    }
}
