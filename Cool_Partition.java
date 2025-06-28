import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Cool_Partition {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            HashMap<Integer, Boolean> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(in.nextLine());

            int answer = 0;
            int counter = 0;
            int counter1 = 0;

            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (!map.containsKey(value)) {
                    counter++;
                    map.put(value, false);
                } else if (map.get(value)) {
                    counter1--;
                    map.put(value, false);
                } else {
                    map.put(value, false);
                }
                if (counter1 == 0) {
                    counter1 = counter;
                    map.replaceAll((key, oldValue) -> true);
                    answer++;
                }
            }
            out.println(answer);
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