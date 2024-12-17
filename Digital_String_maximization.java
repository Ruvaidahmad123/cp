import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void swap(int i, int j, StringBuilder s) {
        char t = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, t);
    }

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t-- > 0) {
            StringBuilder s = new StringBuilder(in.nextLine());
            for (int i = 0; i < s.length(); i++) {
                int best = s.charAt(i) - '0', pos = i;
                for (int j = i; j < Math.min(i + 10, s.length()); j++) {
                    if (s.charAt(j) - '0' - (j - i) > best) {
                        best = s.charAt(j) - '0' - (j - i);
                        pos = j;
                    }
                }
                while (pos > i) {
                    swap(pos, pos - 1, s);
                    pos--;
                }
                s.setCharAt(i, (char) (best + '0'));
            }
            out.println(s);
        }
        out.close();
    }

    static class PrefixSum0Based {
        private int[] prefix;

        public PrefixSum0Based(int[] input) {
            int n = input.length;
            prefix = new int[n];
            prefix[0] = input[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + input[i];
            }
        }

        public int getRangeSum(int l, int r) {
            if (l == 0) return prefix[r];
            return prefix[r] - prefix[l - 1];
        }

        public int getPrefixSum(int i) {
            return prefix[i];
        }
    }

    static class PrefixSum1Based {
        private int[] prefix;

        public PrefixSum1Based(int[] input) {
            int n = input.length;
            prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + input[i - 1];
            }
        }

        public int getRangeSum(int l, int r) {
            return prefix[r] - prefix[l - 1];
        }

        public int getPrefixSum(int i) {
            return prefix[i];
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
