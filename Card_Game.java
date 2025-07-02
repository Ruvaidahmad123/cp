import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Card_Game {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        int t = 1;
        if (sc.hasNextInt()) t = sc.nextInt();
        while (t-- > 0) {
            solve(sc, out);
        }
        out.close();
    }
    public static int f(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    static void solve(FastReader sc, FastWriter out) throws IOException {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int ans=0;
        if (f(a, c) + f(b, d) > 0) ans++;
        if (f(a, d) + f(b, c) > 0) ans++;
        if (f(b, c) + f(a, d) > 0) ans++;
        if (f(b, d) + f(a, c) > 0) ans++;
        out.println(ans);
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

        boolean hasNextInt() {
            try {
                br.mark(1000);
                String line = br.readLine();
                if (line == null || line.isEmpty()) return false;
                st = new StringTokenizer(line);
                br.reset();
                return st.hasMoreTokens() && st.nextToken().matches("-?\\d+");
            } catch (IOException e) {
                return false;
            }
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