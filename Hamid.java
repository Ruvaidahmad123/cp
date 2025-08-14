import java.io.*;
import java.util.*;

public class Hamid {
    static FastScanner fs = new FastScanner(System.in);
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        System.out.print(out.toString());
    }

    static void solve() throws IOException {
        int n = fs.nextInt();
        int x = fs.nextInt() - 1; // convert to 0-based
        String s = fs.next();

        int L = -1, R = n;
        for (int i = x - 1; i >= 0; --i) {
            if (s.charAt(i) == '#') {
                L = i;
                break;
            }
        }
        for (int i = x + 1; i < n; ++i) {
            if (s.charAt(i) == '#') {
                R = i;
                break;
            }
        }

        int a = Math.min(L + 2, n - x);
        int b = Math.min(x + 1, n - R + 1);
        out.append(Math.max(a, b)).append('\n');
    }

    // ---------------- FastScanner ----------------
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) { in = is; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return null;
            }
            do {
                sb.append((char) c);
            } while ((c = read()) > ' ');
            return sb.toString();
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
