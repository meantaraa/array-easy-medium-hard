/* 
import java.util.*;

public class CheckIfSorted {

    public static boolean checkIfSorted(int[] arr, int n) {
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<n; j++){
                if(arr[j]<arr[i]){ //don't arr[j]>arr[i]
                    return false;
                }
            }
        }
     return true;
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(checkIfSorted(a, n));

    }
    
}
*/

/* Time Complexity: O(n^2)
   Space Complexity: O(1)
 */

import java.util.*;

public class CheckIfSorted {

    public static boolean checkIfSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(checkIfSorted(a, n));

    }

}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */