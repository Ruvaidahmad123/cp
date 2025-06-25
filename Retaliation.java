import java.io.*;
import java.util.*;

public class Retaliation {
    public static void main(String[] args) throws IOException {
        // Fast Input/Output
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] v = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                v[i] = Long.parseLong(st.nextToken());
            }

            long diff = v[1] - v[0];
            boolean bad = false;

            for (int i = 2; i < n; i++) {
                if (v[i] - v[i - 1] != diff) {
                    bad = true;
                    break;
                }
            }

            if (bad) {
                out.println("NO");
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (diff < 0) {
                    v[i] += diff * (n - i);
                } else {
                    v[i] -= diff * (i + 1);
                }
            }

            out.println((v[0] >= 0 && v[0] % (n + 1) == 0) ? "YES" : "NO");
        }

        out.flush();
    }
}