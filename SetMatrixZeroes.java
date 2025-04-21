/*import java.util.*;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowMark = new boolean[rows];
        boolean[] colMark = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowMark[i] = true;
                    colMark[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMark[i] || colMark[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
*/

/*
Time Complexity: O(m × n)
Space Complexity: O(m + n)
 */

 import java.util.*;

public class SetMatrixZeroes {

        public static void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
    
            boolean firstRowZero = false;
            boolean firstColZero = false;
    
            // Check if first row has any zeros
            for (int j = 0; j < cols; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }
    
            // Check if first column has any zeros
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }
    
            // Use first row and column to mark zero rows/cols
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
    
            // Zero out based on markers
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
    
            // Zero first row if needed
            if (firstRowZero) {
                for (int j = 0; j < cols; j++) {
                    matrix[0][j] = 0;
                }
            }
    
            // Zero first column if needed
            if (firstColZero) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][0] = 0;
                }
          }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}