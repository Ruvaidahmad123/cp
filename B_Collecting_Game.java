import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;
public class B_Collecting_Game {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = in.nextInt();
            }
            int[] B = Arrays.copyOf(A, n);
            Arrays.sort(B);
            long[] prefix = new long[n];
            prefix[0] = B[0];
            for(int i=1;i<n;i++){
                prefix[i] = prefix[i-1]+B[i];
            }
            Map<Integer, Integer> map = new HashMap<>();
            map.put(B[n-1],n-1);
            for(int i = n-2;i>=0;i--){
                if(map.containsKey(B[i])) continue;
                if(prefix[i]>=B[i+1]) map.put(B[i],map.get(B[i+1]));
                else map.put(B[i],i);
            }
            for(int a : A){
                out.print(map.get(a) + " ");
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
        //https://github.com/dr0nser/fast-io-java
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
