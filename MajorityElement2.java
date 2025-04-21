import java.util.*;

public class MajorityElement2 {

    public static int majorityElement(int[] arr, int n){

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    cnt++;
                }
            }

            if(cnt> n/3){
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


/*
Time Complexity: O(n^2)
Space Complexity: O(1)
*/