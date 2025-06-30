import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Good_Start {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        int test = sc.nextInt();
        while (test-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            boolean res;
            if (x1 <= x2) {
                res = f(x1, y1, x2, y2, a, b);
            } else {
                res = f(x2, y2, x1, y1, a, b);
            }

            out.println(res ? "YES" : "NO");
        }
        out.close();
    }

    public static boolean f(int x1, int y1, int x2, int y2, int a, int b) {
        if (x1 == x2) {
            int d = (y1 < y2) ? y2 - (y1 + b) : y1 - (y2 + b);
            return d % b == 0;
        }
        if (y1 == y2) {
            int d = (x1 < x2) ? x2 - (x1 + a) : x1 - (x2 + a);
            return d % a == 0;
        }
        int d = x2 - (x1 + a);
        if (d % a == 0) return true;

        d = (y1 < y2) ? y2 - (y1 + b) : y1 - (y2 + b);
        return d % b == 0;
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