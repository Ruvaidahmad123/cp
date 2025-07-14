import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class CountingPairs {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        for (int testNo = 0; testNo < t; testNo++) {
            int n = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            long[] a = new long[n];
            long S = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                S += a[i];
            }

            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n - 1; i++) {
                long low = (S - y) - a[i];
                long high = (S - x) - a[i];
                int l = lowerBound(a, i + 1, n, low);
                int r = upperBound(a, i + 1, n, high);
                ans += r - l;
            }
            out.println(ans);
        }

        out.close();
    }

    static int lowerBound(long[] a, int lo, int hi, long value) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(long[] a, int lo, int hi, long value) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
