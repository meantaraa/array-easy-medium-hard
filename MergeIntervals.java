import java.util.*;

public class MergeIntervals {

    // public static List<int[]> mergeIntervals(int[][] arr) {
    public static int mergeIntervals(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        /*
         * int n = arr.length;
         * Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
         * List<int[]> res = new ArrayList<>();
         * 
         * for (int i = 0; i < n; i++) {
         * int start = arr[i][0];
         * int end = arr[i][1];
         * 
         * if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
         * continue;
         * }
         * 
         * for (int j = i + 1; j < n; j++) {
         * if (arr[j][0] <= end) {
         * end = Math.max(end, arr[j][1]);
         * }
         * }
         * 
         * res.add(new int[] { start, end });
         * }
         * return res;
         */

        /*
         * Time Complexity: O(n^2)
         * Space Complexity: O(n)
         */

        /*
         * int n = arr.length;
         * Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
         * List<int[]> res = new ArrayList<>();
         * 
         * res.add(new int[]{arr[0][0], arr[0][1]});
         * 
         * for(int i = 1; i<arr.length; i++){
         * int[] last = res.get(res.size() - 1);
         * int[] curr = arr[i];
         * 
         * if(curr[0] <= last[1])
         * last[1] = Math.max(last[1], curr[1]);
         * else res.add(new int[]{curr[0], curr[1]});
         * }
         * return res;
         */
        /*
         * Time Complexity: O(nlogn)
         * Space Complexity: O(n)
         */
        int resIdx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[resIdx][1] >= arr[i][0])
                arr[resIdx][1] = Math.max(arr[resIdx][1], arr[i][1]);
            else {
                resIdx++;
                arr[resIdx] = arr[i];
            }
        }

        return (resIdx + 1);
    }

    public static void main(String[] args) {

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.print("Enter the nuber of intervals: ");
         * int n = sc.nextInt();
         * 
         * int[][] intervals = new int[n][2];
         * 
         * System.out.print("Enter intervals (start end): ");
         * for(int i = 0; i<n; i++){
         * intervals[i][0] = sc.nextInt();
         * intervals[i][1] = sc.nextInt();
         * }
         * 
         * List<int[]> merged = mergeIntervals(intervals);
         * System.out.println("Merged intervals: ");
         * for(int[] interval : merged) {
         * System.out.println(interval[0] + " " + interval[1]);
         * }
         * sc.close();
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.print("Enter intervals (start end): ");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int mergedSize = mergeIntervals(intervals); // returns new size

        System.out.println("Merged intervals: ");
        for (int i = 0; i < mergedSize; i++) {
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }

        sc.close();

    }
}
/*
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 */