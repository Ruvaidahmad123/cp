import java.io.*;
import java.util.*;

public class Difficult_Contest {
    static BufferedReader in;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int t = ni();
        while (t-- > 0) {
            solve();
        }
        System.out.print(sb.toString());
    }

    static void solve() throws IOException {
        String s = ns();
        char[] c = s.toCharArray();
        Arrays.sort(c); // ascending
        StringBuilder res = new StringBuilder(s.length());
        for (int i = c.length - 1; i >= 0; i--) {
            res.append(c[i]); // append in reverse for descending order
        }
        sb.append(res).append("\n");
    }

    // ---------------- Fast Input -----------------
    static String ns() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }

    static int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    static long nl() throws IOException {
        return Long.parseLong(ns());
    }
}
