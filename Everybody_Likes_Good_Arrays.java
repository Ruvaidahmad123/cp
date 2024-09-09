import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;
public class Everybody_Likes_Good_Arrays {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int count=0;
            for(int i=1;i<n;i++){
                if((arr[i-1]%2==0 && arr[i]%2==0)||(arr[i-1]%2==1 && arr[i]%2==1)){
                    count++;
                }
            }
            out.println(count);
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
