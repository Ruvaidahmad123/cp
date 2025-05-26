import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Middle_of_The_Contest {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        // int t = in.nextInt();
        // in.nextLine(); // consume the newline after t
        // while (t-- > 0) {
            String start = in.nextLine();
            String end = in.nextLine();
            int start_hr=Integer.parseInt(start.substring(0,2));
            int end_hr=Integer.parseInt(end.substring(0,2));
            int start_min=Integer.parseInt(start.substring(3));
            int end_min=Integer.parseInt(end.substring(3));
            int total_min = (start_hr + end_hr) * 60 + start_min + end_min;
            int mid_min = total_min / 2;
            int mid_hr = mid_min / 60;
            mid_min %= 60;
            String formatted_hr = String.format("%02d", mid_hr);
            String formatted_min = String.format("%02d", mid_min);
            out.println(formatted_hr + ":" + formatted_min);
            
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
