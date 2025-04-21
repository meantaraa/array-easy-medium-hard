import java.util.*;

public class ChocolateDistribution {
    public static int findMinDiff(int[] arr, int m){

        int n = arr.length;
        
        if(n == 0 || m == 0 || m>n){
            return 0;
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<=n-m; i++){
            int diff = (arr[i+m-1] = arr[i]);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of packets: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter number of chocolates in each packet:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of students: ");
        int m = sc.nextInt();

        int result = findMinDiff(arr, m);
        System.out.println("Minimum difference is: " + result);
    }
}

/* Time Complexity: O(n log n)
   Space Complexity: O(n)
*/