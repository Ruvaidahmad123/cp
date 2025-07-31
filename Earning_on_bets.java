import java.io.*;
import java.util.*;

public class Earning_on_bets {
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

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            long x = 1;

            // Calculate LCM
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                x *= arr[i] / gcd(x, arr[i]);
            }

            long[] a = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = x / arr[i];
                sum += a[i];
            }

            if (sum < x) {
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
