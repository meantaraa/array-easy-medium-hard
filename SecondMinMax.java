/*  
import java.util.*;

public class SecondMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = secondMinMax(a);
        System.out.println("The second smallest element is: " + result[0]);
        System.out.println("The second largest element is: " + result[1]);
    }

    public static int[] secondMinMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[1], arr[arr.length - 2]};
    }
}
*/

/* Time Complexity: O(n log n)
   Space Complexity: O(1)
*/


import java.util.*;

public class SecondMinMax{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = secondMinMax(a, n);
        System.out.println("The second smallest element is: " + result[0]);
        System.out.println("The second largest element is: " + result[1]);
    }

    public static int[] secondMinMax(int[] arr, int n){

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;


        for(int i=0; i<n; i++){

            if(arr[i] < min) {
               /*Second min should be updated first */
               second_min = min;
               min = arr[i];
            }else if(arr[i] < second_min && arr[i] != min){
                second_min = arr[i];
            }
        }

        for(int i=0; i<n; i++){

            if(arr[i] > max) {
                /*Second max should be updated first */
                second_max = max;
                max = arr[i];
            }else if(arr[i] < second_max && arr[i] != max){
                second_max = arr[i];
            }
        }

        return new int[]{second_min, second_max};
    }
}

/* Time Complexity: O(n)
   Space Complexity: O(1)
*/


