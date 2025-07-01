import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Slice_to_Survive {
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

    static void solve(FastReader sc, FastWriter out) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<int[]> rec = Arrays.asList(
            new int[]{a, m},
            new int[]{n - a + 1, m},
            new int[]{n, b},
            new int[]{n, m - b + 1}
        );

        int ans = n + m;
        for (int[] p : rec) {
            int n1 = p[0];
            int m1 = p[1];
            int res = 0;

            while (n1 > 1) {
                res++;
                n1 = (n1 + 1) / 2;
            }
            while (m1 > 1) {
                res++;
                m1 = (m1 + 1) / 2;
            }
            ans = Math.min(ans, res);
        }

        out.println(1 + ans);
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