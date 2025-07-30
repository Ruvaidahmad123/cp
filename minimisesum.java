import java.util.*;
public class minimisesum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Add logic to compute the minimum adjacent pair sum
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                minSum = Math.min(minSum, arr[i] + arr[i + 1]);
            }

            System.out.println(minSum);
        }
    }
}
