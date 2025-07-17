import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Uninteresting_Number {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = Integer.parseInt(in.nextLine()); // Read number of test cases

        for (int i = 0; i < t; i++) {
            String line = in.nextLine().trim();
            int sum = 0;
            int count2 = 0;
            int count3 = 0;

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                int num = c - '0';
                sum += num;
                if (num == 2) count2++;
                if (num == 3) count3++;
            }

            boolean found = false;
            for (int delete2 = 0; delete2 <= 10 && delete2 <= count2; delete2++) {
                for (int delete3 = 0; delete3 <= 10 && delete3 <= count3; delete3++) {
                    if ((sum + delete2 * 2 + delete3 * 6) % 9 == 0) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            out.println(found ? "YES" : "NO");
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
