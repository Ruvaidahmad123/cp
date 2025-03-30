import java.util.*;
public class Longest_Subsequence_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long[] sum = new long[n];
            sum[0] = a[0];
            for (int i = 1; i < n; i++) {
                sum[i] = sum[i - 1] + a[i];
            }
            while (q-- > 0) {
                long k = sc.nextLong();
                int l = 0, r = n - 1, ans = 0;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (sum[mid] < k) {
                        ans = mid + 1;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}

