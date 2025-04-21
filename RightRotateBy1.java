/* 
import java.util.*;

public class RightRotateBy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

       rightRotate(a, n); 

    }


    public static void rightRotate(int[] arr, int n){

        int[] temp = new int[n];

        for(int i=n-1; i>0; i--) {

            temp[i] = arr[i-1];

        }

        temp[0] = arr[n-1];

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

public class RightRotateBy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
    }

       rightRotateBy1(a, n); 

}


    public static void rightRotateBy1(int[] arr, int n){

        int temp = arr[n-1];

        for(int i=n-1; i>0; i--) {

            arr[i] = arr[i-1];

        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
          }

    }
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/