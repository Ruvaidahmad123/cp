import java.util.Scanner;

import static java.util.Collections.swap;

public class Energy_Cristals {
    private static Scanner sc = new Scanner(System.in);
    private static void solveTC() {
        long n = sc.nextLong(), steps = 0;
        long a = 0, b = 0, c = 0;
        while (a < n) {
            steps++;
            a = Math.min(n, 2 * b + 1);
            long mn = Math.min(a, Math.min(b, c));
            long mx = Math.max(a, Math.max(b, c));
            long me = a + b + c - mn - mx;
            a = mn;
            b = me;
            c = mx;
        }
        System.out.println(steps);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            solveTC();
        }
    }
}