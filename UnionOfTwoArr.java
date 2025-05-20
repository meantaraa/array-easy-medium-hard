/* import java.util.*;

public class UnionOfTwoArr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        unionOfTwoArr(a, b);

    }

    public static void unionOfTwoArr(int[] a, int[] b){

        HashMap<Integer, Integer> mpp = new HashMap <> ();

        for(int i=0; i<a.length; i++){
            mpp.put(a[i], mpp.getOrDefault(a[i], 0)+1);
        }

        for(int i=0; i<b.length; i++){
            mpp.put(b[i], mpp.getOrDefault(b[i], 0)+1);
        }

        System.out.println("Union using HashMap is: ");
        for(int key : mpp.keySet()){
            System.out.println(key + " ");
        }
    }
}
*/

/*
Time Complexity: O(n1 + n2) 
Space Complexity: O(n1 + n2)
*/

/* import java.util.*;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        unionOfTwoArr(a, b);

        sc.close();  
    }

    public static void unionOfTwoArr(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        System.out.print("Union using Two Pointer approach is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
*/

/*
Time Complexity: O(n1 + n2) 
Space Complexity: O(n1 + n2)
*/

import java.util.*;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        unionOfTwoArr(a, b);

    }

    public static void unionOfTwoArr(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        System.out.println("Union using HashSet:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Time Complexity: O(n1 + n2)
 * Space Complexity: O(n1 + n2)
 */
