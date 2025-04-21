import java.util.*;

public class MaxConsecutive1s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the binary array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the binary array (only 0s and 1s): ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive ones: " + result);

        sc.close();
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}


/*
Time Complexity: O(n)
Space Complexity: O(1)
*/