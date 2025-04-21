/*import java.util.*;

public class LongConsSeq {

    public static int longConsSeq(int[] arr, int n){

        if(arr.length == 0) return 0;

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for(int i=1; i<arr.length; i++){

            if(arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] == arr[i-1] + 1){
                count++;
            }else{
                longest = Math.max(longest, count);
                count = 1;
            }
        }

        return Math.max(longest, count);
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

        System.out.println("Longest Consequtive sequence is: " + longConsSeq(nums, n));

    }
}
*/
 
 /*Time Complexity:O(n log n)
  Space Complexity: O(1)
 */

import java.util.*;

public class LongConsSeq {

    public static int longConsSeq(int[] nums){

        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) { 
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
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

        System.out.println("Longest Consequtive sequence is: " + longConsSeq(nums));

    }
}

/*Time Complexity:O(n)
  Space Complexity: O(n)
 */