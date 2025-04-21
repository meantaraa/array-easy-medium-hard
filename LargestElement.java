/*
import java.util.*;

public class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        largestElement(a);
    }

    public static void largestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The largest element is: " + arr[arr.length - 1]);
    }
}

*/

 /* Time Complexity: O(n log n)
    Space Complexity: O(1)
*/

import java.util.*;

public class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
       
        largestElement(a, n);

    }

    public static void largestElement(int[] arr, int n) {

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element is:  " + max);
    }
    
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/