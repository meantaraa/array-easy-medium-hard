/* 
import java.util.*;

public class TwoSumVar1 {

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

       System.out.println("The answer is: " + twoSumVar1(a, n, target)); 


    }

    public static String twoSumVar1(int[] arr, int n, int k){

        for(int i=0; i<n; i++){
            for(int j=i+1; i<n; i++){
                if((arr[j] + arr[i] == k)){
                    return "YES";
                }
            }
        }

        return "NO";
    }
}
*/

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

/* import java.util.*;

public class TwoSumVar1 {

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

       System.out.println("The answer is: " + twoSumVar1(a, n, target)); 


    }

    public static String twoSumVar1(int[] arr, int n, int k){

        HashSet<Integer> set = new HashSet<> ();

        for(int i=0; i<n; i++){
            
            int rem = k-arr[i];

            if(set.contains(rem)){
                return "YES";
            }

            set.add(arr[i]);
        }

        return "NO";
    }
}
*/

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

/* 
import java.util.*;

public class TwoSumVar1 {

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

       System.out.println("The answer is: " + twoSumVar1(a, n, target)); 


    }

    public static String twoSumVar1(int[] arr, int n, int k){

        HashMap<Integer, Integer> mpp = new HashMap<> ();

        for(int i=0; i<n; i++){
            
            int rem = k-arr[i];

            if(mpp.containsKey(rem)){
                return "YES";
            }

            mpp.put(arr[i], i);
        }

        return "NO";
    }
}
*/

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class TwoSumVar1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        System.out.println("The answer is: " + twoSumVar1(a, n, target));

    }

    public static String twoSumVar1(int[] arr, int n, int k) {

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == k) {
                return "YES";
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return "NO";

    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
