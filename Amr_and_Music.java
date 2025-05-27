import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Amr_and_Music {
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
        // int t = in.nextInt();
        // while (t-- > 0) {
            int n=in.nextInt();
            int arr[]=new int[n];
            int k=in.nextInt();
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            List<Pair>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new Pair(arr[i],i));
            }
            Collections.sort(list,(a,b)->{
                return a.val-b.val;
            });
            int temp=k;
            int cnt=0;
            List<Integer>ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                Pair p=list.get(i);
                if(k>=p.val){
                    k-=p.val;
                    ans.add(p.idx+1);
                }
                else{
                    break;
                }
            }
            if(temp==k){
                out.println(0);
            }
            else{
                out.println(ans.size());
                for(int x:ans){
                    out.print(x+" ");
                }
            }
        // }
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
