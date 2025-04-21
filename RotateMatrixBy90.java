/* import java.util.*;

public class RotateMatrixBy90 {


    public static int[][] rotateMatrix(int[][] matrix) {

        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }

        return rotated;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (N x N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] rotated = rotateMatrix(matrix);

        System.out.println("Rotated Matrix (Brute Force):");
        for (int[] row : rotated) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/

/* Time Complexity: O(n^2)
   Space Complexity: O(n^2)
*/

import java.util.*;

public class RotateMatrixBy90{
    
    public static void rotateMatrix(int[][] matrix){

        int n = matrix.length;

        for(int i=0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
        
    }

    public static void reverseRow(int[] row){
        int left = 0;
        int right = row.length-1;

        while(left<right){
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix size (N x N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix);

        System.out.println("Rotated Matrix (In-Place):");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


/* Time Complexity: O(n^2)
   Space Complexity: O(1)
*/