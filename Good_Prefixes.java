import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Good_Prefixes {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        int t = 1;
        if (sc.hasNextInt()) t = sc.nextInt();
        while (t-- > 0) {
            solve(sc, out);
        }
        out.close();
    }
    static void solve(FastReader sc, FastWriter out) throws IOException {
        int n = sc.nextInt();
        int[] a = new int[n];
    
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    
        long sum = 0;
        int max = 0, ans = 0;
    
        for (int i = 0; i < n; i++) {
            sum += a[i];
            max = Math.max(max, a[i]);
            if (sum - max == max) {
                ans++;
            }
        }
    
        out.println(ans);
    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }

        boolean hasNextInt() {
            try {
                br.mark(1000);
                String line = br.readLine();
                if (line == null || line.isEmpty()) return false;
                st = new StringTokenizer(line);
                br.reset();
                return st.hasMoreTokens() && st.nextToken().matches("-?\\d+");
            } catch (IOException e) {
                return false;
            }
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}