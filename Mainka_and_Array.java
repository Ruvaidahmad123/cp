import java.util.Scanner;

public class Mainka_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNumber = sc.nextInt();
        
        while (testCaseNumber-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MIN_VALUE;
            // No subarray is chosen: Answer would be an−a1 in this case.
            // Chosen subarray contains an and a1

            for (int i = 0; i < n; i++) {
                int prev = (i - 1 + n) % n;
                ans = Math.max(ans, arr[prev] - arr[i]);
            }
            // Chosen subarray doesn't contain a1
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, arr[i] - arr[0]);
            }
            // Chosen subarray doesn't contain an
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, arr[n - 1] - arr[i]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
