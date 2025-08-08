import java.io.*;
import java.util.*;

public class LeftMost_Below {
    static BufferedReader in;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            solve();
        }
        System.out.print(sb.toString());
    }

    static void solve() throws IOException {
        int n = Integer.parseInt(in.readLine());
        int[] p = new int[n];

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        int mn = p[0];
        for (int i = 1; i < n; i++) {
            if (p[i] >= 2 * mn) {
                sb.append("NO\n");
                return;
            }
            mn = Math.min(mn, p[i]);
        }
        sb.append("YES\n");
    }
}
