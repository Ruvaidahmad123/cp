import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Asuna_Mosquitoes {
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            int o = 0, e = 0;
            long os = 0, es = 0;
            int om = 0, em = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    e++;
                    em = Math.max(em, a[i]);
                    es += a[i];
                } else {
                    o++;
                    om = Math.max(om, a[i]);
                    os += a[i];
                }
            }
            if (o == 0 || e == 0) {
                sb.append(Math.max(em, om)).append("\n");
            } else {
                sb.append(os + es - o + 1).append("\n");
            }
        }
        System.out.println(sb);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
} 
