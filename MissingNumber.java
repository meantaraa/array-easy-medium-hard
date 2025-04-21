/* 
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the total number of elements (n): ");
        int n = sc.nextInt();

        // Since one number is missing, we need to input n-1 elements.
        int[] arr = new int[n - 1];
        
        System.out.println("Enter " + (n - 1) + " elements from 1 to " + n + ":");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int result = missingNum(arr, n);
        if (result == -1) {
            System.out.println("No number is missing in the range.");
        } else {
            System.out.println("The missing number is: " + result);
        }

        sc.close();
    }

    public static int missingNum(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = min; i <= max; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }

        return -1;
    }
}
*/

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

/* import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = missingNumber(arr, n);
        System.out.println("Missing number: " + missing);
    }

    public static int missingNumber(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
*/

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/


/*import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = missingNumber(arr, n);
        System.out.println("Missing number: " + missing);
    }

    public static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
}
*/

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = missingNumber(arr, n);
        System.out.println("Missing number: " + missing);
    }

    public static int missingNumber(int[] arr, int n) {
        int xorRange = 0;
        int xorArray = 0;

        for (int i = 1; i <= n; i++) {
            xorRange ^= i;
        }

        for (int num : arr) {
            xorArray ^= num;
        }

        return xorRange ^ xorArray;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

