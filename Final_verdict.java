/* ------------------------------------------------------------------------ */
/*------------  A_Final_Verdict.java - Java Main Class  ----------------*/
/* ------------------------------------------------------------------------- */
import java.io.*;
import java.util.*;

public class Final_verdict {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int n = fs.nextInt();
            int x = fs.nextInt();
            double sum = 0;
            for(int i = 0; i<n; i++){
                int k = fs.nextInt();
                sum += k;
            }
            double avg = sum/n;
            if(avg == x){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        

        out.flush();
    }

    

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}
/* ------------------------------------------------------------------------ */
/* ------------------ End of A_Final_Verdict.java --------------------- */
/* ------------------------------------------------------------------------ */