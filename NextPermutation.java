import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] arr, int n){

        int pivot = -1;

        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }

        for(int i= n-1; i>pivot; i--){
            if(arr[i]>arr[pivot]){
                swap(arr, pivot, i);
                break;
            }
        }

        reverse(arr, pivot+1, n-1);
    }

    public static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end ){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
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

        nextPermutation(nums, n);
        
        
        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

 
 /*Time Complexity:O(n)
  Space Complexity: O(1)
 */

