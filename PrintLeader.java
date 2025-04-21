/*
import java.util.*;

public class PrintLeader {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        printLeaders(nums);
        
        scanner.close();  
    }
}
*/

/*Time Complexity:O(n^2)
  Space Complexity: O(1)
 */

 import java.util.*;

 public class PrintLeader {
     public static void printLeaders(int[] arr) {
         int n = arr.length;
         int maxFromRight = arr[n - 1];
         System.out.print(maxFromRight + " "); 
 
         for (int i = n - 2; i >= 0; i--) {
             if (arr[i] > maxFromRight) {
                 maxFromRight = arr[i];
                 System.out.print(maxFromRight + " ");
             }
         }
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Enter the length of the array: ");
         int n = scanner.nextInt();
         
         int[] nums = new int[n];
         
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < n; i++) {
             nums[i] = scanner.nextInt();
         }
 
         printLeaders(nums);
         
         scanner.close();
     }
 }
 
 /*Time Complexity:O(n)
  Space Complexity: O(1)
 */
