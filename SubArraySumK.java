/* 
import java.util.*; 

public class SubArraySumK {

    public static int subArraySumK(int[] a, int n, int target) {

        int len = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum +=a[k];
                }

                if (sum == target){
                    len = Math.max(len , j-i+1);
                }
            }
        } 
        
        return len;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("The longest subarray for given sum is: " + subArraySumK(arr, n, target));

    }    
}

*/

/*
Time Complexity: O(n^3)
Space Complexity: O(1)
*/

/*
import java.util.*; 

public class SubArraySumK {

    public static int subArraySumK(int[] a, int n, int target) {

        int len = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                    sum +=a[j];

                    if (sum == target){
                        len = Math.max(len , j-i+1);
                    }
                }
            }

        return len;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("The longest subarray for given sum is: " + subArraySumK(arr, n, target));

    }    
}
 */

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

import java.util.*; 

public class SubArraySumK {

    public static int subArraySumK(int[] a, int n, int target) {

        HashMap<Integer, Integer> mpp = new HashMap <>();
        int sum = 0; 
        int maxLen = 0;

        for(int i=0; i<n; i++){
            sum += a[i];

            if(sum == target) {        
                maxLen = i+1;
            }

            if (mpp.containsKey(sum-target)) {
               int len = i - mpp.get(sum-target);
               maxLen = Math.max(maxLen, len);
            }

            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }            
        }
       
        return maxLen;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("The longest subarray for given sum is: " + subArraySumK(arr, n, target));

    }    
}
/*
Time Complexity: O(n)
Space Complexity: O(n)
*/