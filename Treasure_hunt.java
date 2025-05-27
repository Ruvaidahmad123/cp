import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Treasure_hunt {
    static class Pair{
        int val;
        int idx;
        Pair(int v,int i){
            val=v;
            idx=i;
        }
    }
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t-- > 0) {
            int x=in.nextInt();
            int y=in.nextInt();
            int a=in.nextInt();
            // double total=0;
            // double target=a+0.5;
            // boolean little_b=true;
            // //1 2
            // while(total<=target){
            //     if(little_b){
            //         total+=x;
            //         little_b=!little_b;
            //     }
            //     else{
            //         total+=y;
            //         little_b=!little_b;
            //     }
            // }
            double bunch=(x+y);
            double target=a+0.5;
            double rem=target%bunch;
            out.println(rem-x>0?"YES":"NO");
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
