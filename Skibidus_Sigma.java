import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Skibidus_Sigma {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] arr = new int[m][n];
            Pair[] pairs = new Pair[m];

            for (int i = 0; i < m; i++) {
                long rowSum = 0;
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.nextInt();
                    rowSum += arr[i][j];
                }
                pairs[i] = new Pair(rowSum, i);
            }

            Arrays.sort(pairs, (a, b) -> Long.compare(b.sum, a.sum));

            long total = 0;
            long prefix = 0;

            for (int i = 0; i < m; i++) {
                int rowIndex = pairs[i].index;
                for (int j = 0; j < n; j++) {
                    total += prefix + arr[rowIndex][j];
                    prefix += arr[rowIndex][j];
                }
            }

            out.println(total);
        }

        out.close();
    }

    static class Pair {
        long sum;
        int index;

        public Pair(long sum, int index) {
            this.sum = sum;
            this.index = index;
        }
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
