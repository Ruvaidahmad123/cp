import java.io.*;
import java.util.*;

public class Kevin_and_Binary_String {

    // FastReader for fast input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // Main logic function for each test case
    public static void solve(String s, PrintWriter out) {
        int n = s.length();
        int firstZero = s.indexOf('0');

        if (firstZero == -1) {
            // All '1's case
            out.println("1 1 1 " + n);
            return;
        }

        int len = n - firstZero;
        String suffix = s.substring(n - len);
        String maxXor = null;
        int best = -1;

        for (int i = 0; i + len <= n; i++) {
            String sub = s.substring(i, i + len);
            StringBuilder xor = new StringBuilder();
            for (int j = 0; j < len; j++) {
                xor.append(suffix.charAt(j) == sub.charAt(j) ? '0' : '1');
            }
            if (maxXor == null || xor.toString().compareTo(maxXor) > 0) {
                maxXor = xor.toString();
                best = i;
            }
        }

        out.println("1 " + n + " " + (best + 1) + " " + (best + len));
    }

    public static void main(String[] args) {
        FastReader reader = new FastReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = reader.nextInt();
        while (t-- > 0) {
            String s = reader.next();
            solve(s, out);
        }

        out.flush(); // Always flush at the end
    }
}
