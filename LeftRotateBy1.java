/* 
import java.util.*;

public class LeftRotateBy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

       leftRotateBy1(a, n); 

    }


    public static void leftRotateBy1(int[] arr, int n){

        int[] temp = new int[n];

        for(int i=0; i<n-1; i++) {

            temp[i] = arr[i+1];

        }

        temp[n-1] = arr[0];

        for (int i = 0; i < n; i++) {
        System.out.print(temp[i]+" ");
    }
  } 
}
*/

/* Time Complexity: O(n)
   Space Complexity: O(n)
*/

import java.util.*;

public class LeftRotateBy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

       leftRotateBy1(a, n); 

    }


    public static void leftRotateBy1(int[] arr, int n){

        int temp = arr[0];

        for(int i=0; i<n-1; i++) {

            arr[i] = arr[i+1];

        }

        arr[n-1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
          }

    }
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/