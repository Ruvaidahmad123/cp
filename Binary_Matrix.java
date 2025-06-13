import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Binary_Matrix {
    static PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
    static FastReader in = new FastReader();
    public static int n;
    public static int m;
    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.next());
            }
            int[] row = new int[n];
            int[] col = new int[m];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    int l = arr.get(i).charAt(j) - '0';
                    count ^= l;
                }
                row[i] = count;
            }
            for (int i = 0; i < m; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    int l = arr.get(j).charAt(i) - '0';
                    count ^= l;
                }
                col[i] = count;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (row[i] == 1 && col[j] == 1) {
                        ans++;
                        row[i] = 0;
                        col[j] = 0;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                ans += row[i];
            }
            for (int i = 0; i < m; i++) {
                ans += col[i];
            }
            pw.println(ans);
        }
        pw.close();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
             

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}