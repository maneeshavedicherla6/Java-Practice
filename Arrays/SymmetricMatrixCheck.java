public class SymmetricMatrixCheck {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean isSymmetric = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if the matrix is equal to its transpose
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
