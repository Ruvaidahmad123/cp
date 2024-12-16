import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k=in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            Arrays.sort(arr);
            int j=0;
            int ans=0;
            for(int i=0;i<n;i++){
                j=Math.max(i,j);
                while(j+1<n && arr[j+1]-arr[j]<=1 && arr[j+1]-arr[i]<k){
                    j++;
                }
                ans=Math.max(ans,j-i+1);
            }
            out.println(ans);
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
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void println(Object object) throws IOException {
            bw.append("" + object).append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
