import java.util.*;
import java.io.*;
public class OlympiadDate_2091A{
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            String str="01032025";
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
            int n=in.nextInt();
            char arr[]=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=in.next().charAt(0);
            }
            boolean flag=false;
            int ans=0;
            for(int i=0;i<n;i++){
                char ch=arr[i];
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)<=0)map.remove(ch);
                if(map.size()==0){
                    flag=true;
                    ans=i;
                    break;
                }
            }
            out.println(flag?ans+1:0);
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
