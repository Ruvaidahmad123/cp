import java.util.*;
import java.io.*;
// if from l to r they are divisor of n then from 1 to r-l+1 there should be atleast one multiple in between l to r
// 990990  divisors 9,10,11
// now 9,10,11 segment has length of 3 so there can be another segment as well which has length of 3
// say s1 s2 s3 now if s1 divides 9 then s1 divides n as well
//sly s2 and s3
//lets just say s1 is 1 so s2 and s3 will be 2 and 3 respectively.
//[l l+1 l+2 l+3 .......r-2 r-1 r]
// if 2 divides l and leaves remainder 1 then 2 will definitely divide l+1 
//therefore we should start with 1 only until n%i condition is satisfied
public class Make_It_Zero896A {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long i=1;
            while(n%i==0){
                i++;
            }
            out.println(i-1);
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
