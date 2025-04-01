import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coins_Divide {
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            if (st == null || !st.hasMoreElements()) {
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
    }

    static boolean solve(int x, int[] coins, int[] prefixSum) {
        int left = 1, right = coins.length - 1;
        int b1 = 0, b2 = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (coins[mid] < x) {
                b1 = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = coins.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (coins[mid] > x) {
                right = mid - 1;
                b2 = mid;
            } else {
                left = mid + 1;
            }
        }

        return coins[b1] < x && coins[b2] > x && prefixSum[b1] == prefixSum[coins.length - 1] - prefixSum[b2 - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int n = scanner.nextInt();
        int[] coins = new int[n + 1];
        int[] prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            coins[i] = scanner.nextInt();
        }

        Arrays.sort(coins);

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + coins[i];
        }

        for (int x= 1; x <= 100000; x++) {
            if (solve(x, coins, prefixSum)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
