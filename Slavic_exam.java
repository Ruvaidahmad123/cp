import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Slavic_exam {
    static BufferedReader in;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int ts = ni();
        while (ts-- > 0) {
            solve();
        }
        System.out.print(sb.toString());
    }

    static void solve() throws IOException {
        String s = nsLine();
        String t = nsLine();
        char[] sArr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (j < t.length()) {
                if (sArr[i] == '?') {
                    sArr[i] = t.charAt(j);
                    j++;
                } else if (sArr[i] == t.charAt(j)) {
                    j++;
                }
            } else {
                if (sArr[i] == '?') {
                    sArr[i] = 'a';
                }
            }
        }

        if (j == t.length()) {
            sb.append("YES\n");
            sb.append(new String(sArr)).append("\n");
        } else {
            sb.append("NO\n");
        }
    }

    // Fast input helpers
    static String ns() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }

    static String nsLine() throws IOException {
        return in.readLine();
    }

    static int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    static long nl() throws IOException {
        return Long.parseLong(ns());
    }
}
