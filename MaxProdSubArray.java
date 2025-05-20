import java.util.*;

public class MaxProdSubArray {
    public static int maxProdSubArray(int[] arr) {

        int n = arr.length;

        int result = Integer.MIN_VALUE;

        int pre = 1;

        int suf = 1;

        /*
         * for(int i = 0; i<n; i++){
         * for(int j = i+1; j<n; j++){
         * int prod = 1;
         * for(int k = i; k<=j; k++){
         * prod *= arr[k];
         * }
         * result = Math.max(result, prod);
         * }
         * }
         */

        /*
         * Time Complexity: O(n^3)
         * Space Complexity: O(1)
         */

        /*
         * for(int i = 0; i<n; i++){
         * int prod = 1;
         * for(int j = i; j<n; j++){
         * prod *= arr[j];
         * result = Math.max(result, prod);
         * }
         * }
         */

        /*
         * Time Complexity: O(n^2)
         * Space Complexity: O(1)
         */
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
            pre *= arr[i];
            suf *= arr[n - i - 1];

            result = Math.max(result, Math.max(pre, suf));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = maxProdSubArray(nums);
        System.out.println("The maximum product sub array: " + ans);
    }

}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */