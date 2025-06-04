import java.util.*;

public class Cherry_Bomb {

    static final int MOD = (int)1e9 + 7;

    public static void solsh(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int countUnknowns = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = -1;
        boolean checked = false;
        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();

            if (b[i] != -1) {
                int sum = a[i] + b[i];
                if (target != -1 && sum != target) {
                    checked = true;
                }
                target = sum;
            } else {
                countUnknowns++;
                minA = Math.min(minA, a[i]);
                maxA = Math.max(maxA, a[i]);
            }
        }

        if (checked) {
            System.out.println(0);
        } else if (target != -1) {
            if ((target - minA) <= k && (target - maxA) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (countUnknowns == n) {
            int ans = k - (maxA - minA) + 1;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solsh(sc);
        }
    }
}
