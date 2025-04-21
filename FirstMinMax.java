/*
import java.util.*;

public class FirstMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = findMinMax(a);
        System.out.println("Smallest element: " + result[0]);
        System.out.println("Largest element: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
*/

/* Time Complexity: O(n log n)
   Space Complexity: O(1)
*/

import java.util.*;

public class FirstMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = firstMinMax(a, n);
        System.out.println("The smallest element is: " + result[0]);
        System.out.println("The largest element is: " + result[1]);

    }
    

    public static int[] firstMinMax(int[] arr, int n){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){

        max = Math.max(max, arr[i]);

        min= Math.min(min, arr[i]);
    }

    return new int[]{min, max};
    }
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/