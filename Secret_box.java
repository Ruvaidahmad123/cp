import java.io.*;
import java.util.*;

public class Secret_box {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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

        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens())
                    str = st.nextToken("\n");
                else
                    str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = in.nextInt();

        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            long k = in.nextLong();

            solve(x, y, z, k, out);
        }

        out.flush();
    }

    public static void solve(int x, int y, int z, long k, BufferedWriter out) throws IOException {
        long ans = Long.MIN_VALUE;

        for (int a = 1; a <= x; a++) {
            if (k % a == 0) {
                long rem = k / a;

                for (int b = 1; b <= y; b++) {
                    if (rem % b == 0) {
                        long c = rem / b;
                        if (c >= 1 && c <= z) {
                            ans = Math.max(ans, 1L * (x - a + 1) * (y - b + 1) * (z - (int)c + 1));
                        }
                    }
                }
            }
        }

        out.write((ans == Long.MIN_VALUE ? 0 : ans) + "\n");
    }
}
