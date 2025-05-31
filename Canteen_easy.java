import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Canteen_easy {
    static final int N = 400005;
    static long[] a = new long[N * 2];
    static long[] b = new long[N];
    static int n;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tests = sc.nextInt();
        while (Tests-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
            a[i] -= b[i];
        }

        for (int i = 0; i < n; i++) {
            a[i + n] = a[i];
        }

        for (int i = 1; i < 2 * n; i++) {
            a[i] += a[i - 1];
        }

        Deque<Integer> stack = new ArrayDeque<>();
        long ans = 0;

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] > a[i]) {
                stack.pop();
            }
            if (i < n && !stack.isEmpty()) {
                ans = Math.max(ans, stack.peek() - i);
            }
            stack.push(i);
        }

        System.out.println(ans);
    }
}
