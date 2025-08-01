import java.io.*;
import java.util.*;

public class Boring_Day {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int count = 0;
            long sum = 0;
            int left = 0;

            for (int right = 0; right < n; right++) {
                sum += a[right];

                // Shrink window if sum > r
                while (sum > r && left <= right) {
                    sum -= a[left++];
                }

                // If current window sum is valid
                if (sum >= l && sum <= r) {
                    count++;
                    // Start new window after right
                    sum = 0;
                    left = right + 1;
                }
            }

            System.out.println(count);
        }
    }
}
