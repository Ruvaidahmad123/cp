import java.util.*;

public class Cherry_Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int count = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // Read array a and track min and max
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }

            // Read array b and count -1s
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == -1) count++;
            }

            if (count == n) {
                int maxSum = min + k;
                System.out.println(maxSum - max + 1);
                continue;
            }

            int first = -1;
            for (int i = 0; i < n; i++) {
                if (b[i] != -1) {
                    first = i;
                    break;
                }
            }

            int sum = a[first] + b[first];
            boolean possible = sum <= k;

            for (int i = 0; i < n; i++) {
                if (b[i] == -1) {
                    int expected = sum - a[i];
                    if (expected < 0 || expected > k) {
                        possible = false;
                        break;
                    }
                } else if (a[i] + b[i] != sum) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? 1 : 0);
        }
    }
}
