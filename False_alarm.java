import java.io.*;
import java.util.*;

public class False_alarm {
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
        int x = ni();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();

        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                ind = i;
                break;
            }
        }

        for (int i = ind + x; i < n; i++) {
            if (a[i] == 1) {
                sb.append("NO\n");
                return;
            }
        }
        sb.append("YES\n");
    }

    // Fast Input Methods
    static String ns() throws IOException {
        while (st == null || !st.hasMoreElements()) {
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
