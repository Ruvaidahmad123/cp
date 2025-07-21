import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Swap_Coloumn_Find_Path {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];

            for (int i = 0; i < n; i++) {
                a1[i] = in.nextInt();
            }

            int sum = 0;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a2[i] = in.nextInt();
                if (a1[i] < a2[i]) {
                    sum += a2[i];
                    max = Math.max(max, a1[i]);
                } else {
                    sum += a1[i];
                    max = Math.max(max, a2[i]);
                }
            }

            sum += max;
            out.println(sum);
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

        int[] readIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++)
                res[i] = nextInt();
            return res;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object obj) throws IOException {
            bw.append(String.valueOf(obj));
        }

        public void println(Object obj) throws IOException {
            print(obj);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
