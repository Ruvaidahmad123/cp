import java.io.*;
import java.util.*;

public class Corner_Twist {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            solve();
        }

        System.out.print(sb.toString());
    }

    static void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // Read grid a
        for (int i = 0; i < n; i++) {
            String line = in.readLine().trim();
            for (int j = 0; j < m; j++) {
                a[i][j] = line.charAt(j) - '0';
            }
        }

        // Read grid b
        for (int i = 0; i < n; i++) {
            String line = in.readLine().trim();
            for (int j = 0; j < m; j++) {
                b[i][j] = line.charAt(j) - '0';
            }
        }

        // Form difference grid: d[i][j] = (b[i][j] - a[i][j] + 3) % 3
        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = (b[i][j] - a[i][j] + 3) % 3;
            }
        }

        // Check if each row and column sum is divisible by 3
        boolean ok = true;

        // Check rows
        for (int i = 0; i < n && ok; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum = (rowSum + d[i][j]) % 3;
            }
            if (rowSum != 0) {
                ok = false;
            }
        }

        // Check columns
        for (int j = 0; j < m && ok; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum = (colSum + d[i][j]) % 3;
            }
            if (colSum != 0) {
                ok = false;
            }
        }

        sb.append(ok ? "YES\n" : "NO\n");
    }
}
