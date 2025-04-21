import java.util.*;

public class RearrangeArrPosNeg {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array (even number): ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter " + n + " integers (equal number of positive and negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] rearranged = rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for (int num : rearranged) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}


/*Time Complexity:O(n)
  Space Complexity: O(n)
 */