import java.util.*;
import java.io.*;
public class DrTc{
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            int n=in.nextInt();
            String s=in.next();
            char arr[][]=new char[n][n];
            for(int i=0;i<n;i++){
                char str[]=s.toCharArray();
                str[i] = s.charAt(i) == '0' ? '1' : '0';;
                arr[i]=str;
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                if(arr[i][j]=='1')cnt++;
            }
            out.println(cnt);
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
