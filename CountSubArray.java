/*
import java.util.*;

public class CountSubArray {

    public static int countSubArray(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += nums[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        System.out.println("Count of subarrays: " + countSubArray(nums, k));
        sc.close();
    }
}
*/

/* Time Complexity: O(n^3)
   Space Complexity: O(1)
*/

/*import java.util.*;

public class CountSubArray {

    public static int countSubArray(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target sum k: ");
        int k = sc.nextInt();

        System.out.println("Count of subarrays: " + countSubArray(nums, k));
        sc.close();
    }
}
*/

/* Time Complexity: O(n^2)
   Space Complexity: O(1)
*/

import java.util.*;

public class CountSubArray{

    public static int countSubArray(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target sum k: ");
        int k = sc.nextInt();

        System.out.println("Count of subarrays (O(n)): " + countSubArray(nums, k));
        sc.close();
    }
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/