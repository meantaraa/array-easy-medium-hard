/*
import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] arr, int n){

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    cnt++;
                }
            }

            if(cnt> n/2){
                return arr[i];
            }
        }
     return -1;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The majority element is: " + majorityElement(arr, n));
    }
}
*/

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

/*
import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The majority element is: " + majorityElement(arr, n));
    }
}
 */

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] arr, int n) {

        int cnt = 0;
        int candidate = -1;
       
        for(int i=0; i<n; i++) {
            
            if(cnt == 0){
                candidate = arr[i];
                cnt++;
            }else if(candidate == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        
        int cnt1 = 0;

        for(int nums:arr){
            if(nums == candidate){
                cnt++;
            }
        }

        if(cnt1 > n/2){
            return candidate;
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The majority element is: " + majorityElement(arr, n));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/