import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Lucky_Sum_Of_Digits {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        // Mathematical Insight: The sum of the digits of a lucky number can be expressed as 4*a + 7*b, where a is the count of digit 4 and b is the count of digit 7 in the number.
//         We need to find non-negative integers a and b such that 4*a + 7*b = n and the number formed by these digits is the smallest possible.
// Finding Valid Combinations: For each possible value of b (from the maximum possible down to 0), compute the corresponding a such that 4*a + 7*b = n.
// The first valid combination found (where a is non-negative) will give us the smallest number because we prioritize more 7s (which contribute more to the sum and thus reduce the number of digits) and
// then arrange the digits in ascending order (4s followed by 7s) to form the smallest number.
        int n = in.nextInt();
        int bestA = -1;
        int bestB = -1;
        for (int b = n / 7; b >= 0; b--) {
            int remaining = n - 7 * b;
            if (remaining >= 0 && remaining % 4 == 0) {
                int a = remaining / 4;
                bestA = a;
                bestB = b;
                break;
            }
        }
        
        if (bestA == -1 && bestB == -1) {
            out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bestA; i++) {
                sb.append('4');
            }
            for (int i = 0; i < bestB; i++) {
                sb.append('7');
            }
            out.println(sb.toString());
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
