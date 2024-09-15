import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
public class Strict_teacher {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int tt = in.nextInt(); 
        while (tt-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int q = in.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < q; i++) {
                int x = in.nextInt();
                int right = lowerBound(arr, x);
                int left = right - 1;
                if (x>arr[m-1]) {
                    out.println((n - x) + (x - arr[left]));
                } else if (x<arr[0]) {
                    out.println(x - 1 + (arr[right] - x));
                } else {
                    int midpoint=(arr[right]+arr[left])/2;
                    out.println(Math.min(arr[right]-midpoint,midpoint-arr[left]));
                }
            }
        }
        out.close();
    }
    // Method to find the lower bound in Java
    static int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
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
