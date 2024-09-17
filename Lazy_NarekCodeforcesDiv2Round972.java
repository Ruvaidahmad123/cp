import static java.lang.Math.max;
import java.util.*;
import java.io.*;

public class Main {
    static final String s = "narek";
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int tt = in.nextInt();
        while (tt-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.next();
            }
            int[][] dp = new int[n][5];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            out.println(f(0, 0, a, dp));
        }
        out.close();
    }
    static int f(int index, int letter, String[] a, int[][] dp) {
        if (index == a.length) {
            return -2 * letter;
        }
        if (dp[index][letter] != -1) {
            return dp[index][letter];
        }
        int notTake = f(index + 1, letter, a, dp);
        int take = 0, idx = letter;
        for (char i : a[index].toCharArray()) {
            if (i == s.charAt(idx)) {
                idx = (idx + 1) % 5;
                take++;
            } else if (i == 'n' || i == 'a' || i == 'r' || i == 'e' || i == 'k') {
                take--;
            }
        }
        take += f(index + 1, idx, a, dp);
        dp[index][letter] = max(take, notTake);
        return dp[index][letter];
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
