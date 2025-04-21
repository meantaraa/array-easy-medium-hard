/*
import java.util.*;

public class SmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        findSmallestBySorting(a);
    }

    public static void findSmallestBySorting(int[] arr) {
        Arrays.sort(arr); 
        System.out.println("The smallest element is: " + arr[0]); // First element is the smallest
    }
}
*/

/* Time Complexity: O(n log n)
   Space Complexity: O(1)
*/

import java.util.*;

public class SmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        smallestElement(a, n);

    }

    public static void smallestElement(int[] arr, int n) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The smallest element is:  " + min);
    }

}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/
