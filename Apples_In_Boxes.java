import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Apples_In_Boxes {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];

            int mn = Integer.MAX_VALUE;
            int mx = -1;
            long sum = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                mx = Math.max(mx, a[i]);
                mn = Math.min(mn, a[i]);
                sum += a[i];
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }

            if (mx - mn > k + 1 || (mx - mn >= k + 1 && map.get(mx) > 1)) {
                out.println("Jerry");
            } else if (sum % 2 == 0) {
                out.println("Jerry");
            } else {
                out.println("Tom");
            }
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
