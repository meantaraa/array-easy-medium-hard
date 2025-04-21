/* 
import java.util.*;

public class StockBuySell {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices for each day:");
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }

    public static int maxProfit(int[] arr) {
        int maxPro = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
}
*/

/*Time Complexity:O(n^2)
  Space Complexity: O(1)
 */

import java.util.*;

public class StockBuySell {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices for each day:");
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }

    public static int maxProfit(int[] arr){
        int maxPro=0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }

        return maxPro;
    }
}

/*Time Complexity:O(n)
  Space Complexity: O(1)
 */