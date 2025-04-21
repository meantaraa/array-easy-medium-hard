/*
import java.util.*;

public class GetSingleElement {

    public static int getSingleElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSingleElement(arr, n);

        if (result != -1) {
            System.out.println("The single element is: " + result);
        } else {
            System.out.println("No single element found.");
        }

        sc.close();
    }
}
*/

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

/* import java.util.*;

public class GetSingleElement {

    public static int getSingleElement(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSingleElement(arr, n);

        if (result != -1) {
            System.out.println("The single element is: " + result);
        } else {
            System.out.println("No single element found.");
        }

        sc.close();
    }
}
*/
/*Time Complexity: O(n)
Space Complexity: O(n)
*/


import java.util.*;

public class GetSingleElement {

    public static int getSingleElement(int[] arr, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= arr[i]; 
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSingleElement(arr, n);

        System.out.println("The single element is: " + result);

        sc.close();
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/