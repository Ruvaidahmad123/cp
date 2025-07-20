import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class All_Pairs_Segments {
    public static void main(String[] args) throws IOException {
        FastReader fs = new FastReader();
        FastWriter out = new FastWriter();

        int t = fs.nextInt();

        while (t-- > 0) {
            int[] inp = fs.readIntArray(2);
            int n = inp[0];
            int q = inp[1];

            int[] arr = fs.readIntArray(n);
            HashMap<Long, Integer> hm = new HashMap<>();

            for (int i = 0; i < n - 1; i++) {
                int val1 = 0;
                long val2 = (long)(n - (i + 1)) * (long)(i + 1);

                if (i == 0) {
                    val1 = arr[i + 1] - arr[i];
                    hm.put((long)(n - 1), val1);
                } else {
                    val1 = arr[i + 1] - arr[i] - 1;
                    hm.put(val2, hm.getOrDefault(val2, 0) + val1);
                }

                if ((i + 1) == (n - 1)) {
                    hm.put(val2, hm.get(val2) + 1);
                } else {
                    long val3 = (long)(n - (i + 2)) * (long)(i + 2);
                    val3 += (i + 1);
                    hm.put(val3, hm.getOrDefault(val3, 0) + 1);
                }
            }

            long[] k = fs.readLongArray(q);
            for (int i = 0; i < q; i++) {
                out.print(hm.getOrDefault(k[i], 0) + " ");
            }
            out.println("");
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int[] readIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++)
                res[i] = nextInt();
            return res;
        }

        long[] readLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++)
                res[i] = nextLong();
            return res;
        }

        String[] readStringArray(int n) {
            String[] res = new String[n];
            for (int i = 0; i < n; i++)
                res[i] = nextLine();
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
