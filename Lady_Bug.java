import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Lady_Bug {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String a = in.next(), b = in.next();
            if (n == 1) {
                out.println(a.charAt(0) == '0' ? "YES" : "NO");
                continue;
            }
            int sum1 = 0, sum2 = 0;
            for (int i = 1; i <= n; i++) {
                char ca = a.charAt(i - 1), cb = b.charAt(i - 1);
                if ((i & 1) == 1) {
                    if (ca == '1') sum1++;
                    if (cb == '1') sum2++;
                } else {
                    if (cb == '1') sum1++;
                    if (ca == '1') sum2++;
                }
            }
            int cap1 = n / 2;
            int cap2 = (n + 1) / 2;
            out.println((sum1 <= cap1 && sum2 <= cap2) ? "YES" : "NO");
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