import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Right_Left_Wrong {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            String b = in.next();

            // Compute prefix sums
            for (int i = 1; i < n; i++) {
                a[i] += a[i - 1];
            }

            int i = 0, j = n - 1;
            long s = 0;

            while (i < j) {
                while (i < j && b.charAt(i) != 'L') i++;
                while (i < j && b.charAt(j) != 'R') j--;

                if (i < j) {
                    s += a[j] - (i > 0 ? a[i - 1] : 0);
                }

                i++;
                j--;
            }

            out.println(s);
        }

        out.close();
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
