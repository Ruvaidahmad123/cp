import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Subsequence_Update {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();

            int[] arr = new int[n + 1];  // 1-based indexing
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }

            // Construct brr = arr[1 to l-1] + sorted(arr[l to n])
            int[] brr = new int[n + 1];
            for (int i = 1; i < l; i++) {
                brr[i] = arr[i];
            }

            int[] temp1 = new int[n - l + 1];
            for (int i = l; i <= n; i++) {
                temp1[i - l] = arr[i];
            }
            Arrays.sort(temp1);
            for (int i = l; i <= n; i++) {
                brr[i] = temp1[i - l];
            }

            // Construct crr = reversed(sorted(arr[1 to r])) + arr[r+1 to n]
            int[] crr = new int[n + 1];
            int[] temp2 = new int[r];
            for (int i = 1; i <= r; i++) {
                temp2[i - 1] = arr[i];
            }
            Arrays.sort(temp2);
            for (int i = 1; i <= r; i++) {
                crr[i] = temp2[r - i];
            }
            for (int i = r + 1; i <= n; i++) {
                crr[i] = arr[i];
            }

            // Compute sum of brr[l to r] and crr[l to r]
            long sumB = 0, sumC = 0;
            for (int i = l; i <= r; i++) {
                sumB += brr[i];
                sumC += crr[i];
            }

            out.println(Math.min(sumB, sumC));
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

        int[] readIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++)
                res[i] = nextInt();
            return res;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object obj) throws IOException {
            bw.append(String.valueOf(obj));
        }

        public void println(Object obj) throws IOException {
            print(obj);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
