/* import java.util.*;

public class TwoSumVar2 {

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

       System.out.println("The answer is: " + Arrays.toString(twoSumVar1(a, n, target))); 


    }

    public static int[] twoSumVar1(int[] arr, int n, int k){

        int[] ans = new int[2];
        ans[0] = -1;
        ans [1] = -1;

        for(int i=0; i<n; i++){
            for(int j=i+1; i<n; i++){
                if((arr[j] + arr[i] == k)){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }
}
*/

/*
Time Complexity: O(n^2) 
Space Complexity: O(n)
*/

import java.util.*;

public class TwoSumVar2 {

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

        System.out.println("The answer is: " + Arrays.toString(twoSumVar1(a, n, target)));

    }

    public static int[] twoSumVar1(int[] arr, int n, int k) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rem = k - arr[i];
            if (mpp.containsKey(rem)) {
                ans[0] = mpp.get(rem);
                ans[1] = i;
            }
            mpp.put(arr[i], i);
        }

        return ans;

    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */