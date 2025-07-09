import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Place_of_The_Olympiad {
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = nextLong();
            long m = nextLong();
            long k = nextLong();
            sb.append(search(n, m, k)).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean check(long mid, long n, long m, long k) {
        long val = (m / (mid + 1)) * mid;
        long rem = m % (mid + 1);
        long row = val + rem;
        return row * n >= k;
    }

    static long search(long n, long m, long k) {
        long l = 1, r = m;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (check(mid, n, m, k)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
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
