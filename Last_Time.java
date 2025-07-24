import static java.lang.Math.*;
import java.util.*;
import java.io.*;

public class Last_Time {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();

            Casino[] casinos = new Casino[n];
            for (int i = 0; i < n; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                int x = in.nextInt();
                casinos[i] = new Casino(l, r, x);
            }

            Arrays.sort(casinos, Comparator.comparingInt(c -> c.l));

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int idx = 0;

            while (true) {
                while (idx < n && casinos[idx].l <= k) {
                    if (casinos[idx].r >= k) {
                        pq.offer(casinos[idx].x);
                    }
                    idx++;
                }

                if (pq.isEmpty() || pq.peek() <= k) break;
                k = pq.poll();
            }

            out.println(k);
        }

        out.close();
    }

    static class Casino {
        int l, r, x;
        Casino(int l, int r, int x) {
            this.l = l;
            this.r = r;
            this.x = x;
        }
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
