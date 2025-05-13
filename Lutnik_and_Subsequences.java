
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;
// Observation 1:
// If the array does not contain any 1, then the answer is 0 because you can't form a subsequence that sums to s - 1.
// Observation 2:
// If there are c1 ones and c0 zeroes in the array, then the number of nearly full subsequences is c1 * (2^c0).
// This is because each 1 can form a nearly full subsequence with any combination of zeroes.
// Reasoning for the Formula:
// Each zero can be included or excluded independently, creating 2^c0 possible combinations.
// We then multiply this by the number of ones (c1) because each 1 can independently act as the base of a nearly full subsequence.
public class Lutnik_and_Subsequences {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int countZero = 0, countOne = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == 0) countZero++;
                if (arr[i] == 1) countOne++;
            }
            
            // If there are no 1s, answer is 0
            if (countOne == 0) {
                out.println(0);
            } else {
                // c1 * (2^c0)
                out.println((long)countOne * (1L << countZero));
            }
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
