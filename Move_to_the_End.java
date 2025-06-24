import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Move_to_the_End {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();

            StringTokenizer st = new StringTokenizer(in.nextLine());
            ArrayList<Long> sums = new ArrayList<>();
            ArrayList<Long> maxs = new ArrayList<>();
            sums.add(0L);
            maxs.add(0L);

            for (int i = 1; i <= n; i++) {
                long temp = Long.parseLong(st.nextToken());
                sums.add(temp + sums.get(i - 1));
                maxs.add(Math.max(maxs.get(i - 1), temp));
            }

            for (int k = 1; k <= n; k++) {
                out.print(sums.get(n) - sums.get(n - k + 1) + maxs.get(n - k + 1) + " ");
            }
            out.println("");
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
