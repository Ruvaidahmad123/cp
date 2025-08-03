import java.util.*;
import java.io.*;

public class Basil_Garden {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int tt = Integer.parseInt(br.readLine());

        while (tt-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] dp = new int[n];
            dp[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                dp[i] = Math.max(dp[i + 1] + 1, arr[i]);
            }

            pw.println(dp[0]);
        }

        pw.flush();
        pw.close();
    }
}
