/*
import java.util.*;

public class Sort0s1s2s {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort0s1s2s(a, n);
        
        for(int nums: a){
            System.out.println(nums);
        }

    }

    public static void sort0s1s2s(int[] arr, int n) 

    {
        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        
       for(int i=0; i<n; i++){
        if(arr[i] == 0){
            cnt++;
        }else if(arr[i] == 1){
            cnt1++;
        }else{
            cnt2++;
        }
       }
      
       for(int i=0; i<cnt; i++){
        arr[i] = 0;
       }
    
       for(int i=cnt; i<cnt+cnt1; i++){
        arr[i] = 1;
       }

       for(int i=cnt1+cnt2; i<n; i++){
        arr[i] = 2;
       }
    }    
}
*/

/*Time Complexity:O(n+n)
  Space Complexity: O(1)
 */

 import java.util.*;

public class Sort0s1s2s {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort0s1s2s(a, n);
        
        for(int nums: a){
            System.out.println(nums);
        }

    }

    public static void sort0s1s2s(int[] arr, int n) 

    {
        int low = 0; 
        int mid = 0;
        int high = n-1;

        while(mid<=high){

            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }

            if(arr[mid] == 1){
                mid++;
            }else{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
    
                    high--;
            }
        }
    }
}    

/*Time Complexity:O(n)
  Space Complexity: O(1)
 */
