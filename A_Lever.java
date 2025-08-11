import java.io.*;
import java.util.*;

public class A_Lever {
    static final int MOD = 1000000007;

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
        int n = ni();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = ni();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) ans += a[i] - b[i];
        }
        sb.append(ans + 1).append("\n");
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
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

// Optional utility class
class Pair implements Comparable<Pair> {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public int compareTo(Pair o) {
        return Integer.compare(this.first, o.first);
    }
}
