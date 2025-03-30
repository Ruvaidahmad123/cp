import java.util.*;
import java.io.*;
public class Black_Cells {
    public static boolean check(long k, long[] arr, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(i+1==n)cnt++;
            else{
                if(arr[i+1]-arr[i]<=k)i++;
                else cnt++;
            }
        }
        return cnt <= 1;
    }
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            long l = 1; 
            long r = arr[n - 1] - arr[0]; 
            long ans = l;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                if (check(mid, arr, n)) {
                    ans = mid;
                    r = mid - 1; 
                } else {
                    l = mid + 1; 
                }
            }
            out.println(ans);
        }

        out.close();
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
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void println(Object object) throws IOException {
            bw.append("" + object).append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
