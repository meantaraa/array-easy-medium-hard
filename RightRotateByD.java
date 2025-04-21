/* 
import java.util.*;

public class RightRotateByD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate by: ");
        int d = sc.nextInt();

        d = d % n;

        for (int i = 0; i < d; i++) {
            rightRotateByOne(arr, n);
        }

        System.out.println("Array after right rotation by " + d + " positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rightRotateByOne(int[] arr, int n) {
        int temp = arr[n-1];
        for (int i=n-1; i>0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
*/

/* Time Complexity: O(n*d)
   Space Complexity: O(1)
*/


import java.util.*;

public class RightRotateByD {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate by: ");
        int d = sc.nextInt();

        rightRotateByD(arr, n, d);

        System.out.println("Array after right rotation by " + d + " positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
}


    public static void reverse(int[] arr, int start, int end) {
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rightRotateByD(int[] arr, int n, int d) {

        d = d%n;

        if (d>n){
            return;
        }

        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, d-1);
        reverse(arr, 0, n-1);
    }
    
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/