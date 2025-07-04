import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Creating_Keys {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            solve(n, x, out);
        }
        out.close();
    }

    public static void solve(int n, int x, FastWriter out) throws IOException {
        int[] a = new int[n];
        int or = 0;
        int ind = 0;
        for (int i = 0; i <= Math.min(n - 1, x); i++) {
            if ((i | x) == x) {
                a[ind] = i;
                or |= a[ind];
                ind++;
            }
        }
        if (or != x) a[n - 1] = x;
        for (int j : a) out.print(j + " ");
        out.println("");
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
