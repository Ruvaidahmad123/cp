import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Substring_and_Subsequences {
    static char[] s, t;

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int T = in.nextInt();
        while (T-- > 0) {
            s = in.next().toCharArray();
            t = in.next().toCharArray();
            out.println(solve());
        }

        out.close();
    }

    private static String solve() {
        int mx = 0;
        for (int i = 0; i < t.length; i++) {
            mx = Math.max(mx, f(s, t, i));
        }
        int ans = s.length + t.length - mx;
        return String.valueOf(ans);
    }

    static int f(char[] s, char[] t, int t_from) {
        int cnt = 0;
        for (char b : s) {
            if (t_from + cnt >= t.length) break;
            if (t[t_from + cnt] != b) continue;
            cnt++;
        }
        return cnt;
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
