import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Nine_Hundred_1374B {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int cnt2=0;
            int cnt3=0;
            while(n%2==0){
                cnt2++;
                n/=2;
            }
            while(n%3==0){
                cnt3++;
                n/=3;
            }
            if(n>1 || cnt3<cnt2){
                out.println(-1);
                continue;
            }
            int to_balance_twos_and_threes=cnt3-cnt2;
            int to_make_it_one=cnt3;
            out.println(to_balance_twos_and_threes+to_make_it_one);
        }
        out.close();
    }
	
	static class PrefixSum0Based {
        private int[] prefix;

        public PrefixSum0Based(int[] input) {
            int n = input.length;
            prefix = new int[n];
            prefix[0] = input[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + input[i];
            }
        }

        public int getRangeSum(int l, int r) {
            if (l == 0) return prefix[r];
            return prefix[r] - prefix[l - 1];
        }

        public int getPrefixSum(int i) {
            return prefix[i];
        }
    }

    static class PrefixSum1Based {
        private int[] prefix;

        public PrefixSum1Based(int[] input) {
            int n = input.length;
            prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + input[i - 1];
            }
        }

        public int getRangeSum(int l, int r) {
            return prefix[r] - prefix[l - 1];
        }

        public int getPrefixSum(int i) {
            return prefix[i];
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
