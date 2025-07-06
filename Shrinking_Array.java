import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Shrinking_Array {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = sc.nextIntArray(n);

            if (n == 2) {
                int d = arr[1] - arr[0];
                if (d == 0 || d == 1 || d == -1) {
                    out.println(0);
                    continue;
                } else {
                    out.println(-1);
                    continue;
                }
            }

            boolean hasAdjacent = false;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(arr[i + 1] - arr[i]) <= 1) {
                    hasAdjacent = true;
                    break;
                }
            }
            if (hasAdjacent) {
                out.println(0);
                continue;
            }

            boolean allIncreasing = true;
            boolean allDecreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] < 0) {
                    allIncreasing = false;
                }
                if (arr[i + 1] - arr[i] > 0) {
                    allDecreasing = false;
                }
            }

            if ((allIncreasing && !allDecreasing) || (allDecreasing && !allIncreasing)) {
                out.println(-1);
            } else {
                out.println(1);
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

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("").append(String.valueOf(object));
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
