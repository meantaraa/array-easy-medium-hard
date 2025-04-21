/* import java.util.*;

public class MoveZerostoEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        moveZerostoEnd(arr, n);
        
        System.out.println("Array after moving zeros to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void moveZerostoEnd(int[] arr, int n) {

        ArrayList <Integer> a = new ArrayList <> ();

        for(int i=0; i<n; i++){
            if(arr[i] != 0) {
                a.add(arr[i]);
            }
        }

        int s = a.size();

        for(int i=0; i<s; i++){
            arr[i] = a.get(i);
        }

       for(int i=s; i<n; i++){
        arr[i]=0;
       }
    }
} 
*/

/*
 Time Complexity: O(n)
 Space Complexity: O(n)
 */


/* import java.util.*;

public class MoveZerostoEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        moveZerostoEnd(arr, n);
        
        System.out.println("Array after moving zeros to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZerostoEnd(int[] arr, int n) {
        int nonZeroIndex = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
}
*/

/* Point to remember that we can not skip the last loop because we are changing the values of arr[i] 
but that does not shift zeros to end */

/*
 Time Complexity: O(n)
 Space Complexity: O(1)
 */

 import java.util.*;

 public class MoveZerostoEnd {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the number of elements: ");
         int n = sc.nextInt();
         
         int[] arr = new int[n];
         
         System.out.println("Enter the elements of the array: ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
     
         moveZerostoEnd(arr, n);
         
         System.out.println("Array after moving zeros to the end: ");
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
     }
 
     public static void moveZerostoEnd(int[] arr, int n) {
         int j = 0; 
 
         for (int i = 0; i < n; i++) {
             if (arr[i] != 0) {
                 arr[j] = arr[i]; 
                 if (i != j) {
                     arr[i] = 0; 
                 }
                 j++; 
             }
         }
     }
 }
 
 /*
 Time Complexity: O(n)
 Space Complexity: O(1)
 */
