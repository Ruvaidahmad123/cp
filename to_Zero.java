import java.util.*;

import static java.lang.System.in;

public class to_Zero {

    public static Scanner sc = new Scanner(in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            helper();
        }
    }

    public static void helper() {
        // Write your solution logic here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        if (n <= k) {
            System.out.println(1);
            return;
        }

        if (n % 2 == 0) {
            ans = n / (k - 1) + (n % (k - 1) == 0 ? 0 : 1);
        } else {
            ans = (n - k) / (k - 1) + 1 + ((n - k) % (k - 1) == 0 ? 0 : 1);
        }

        System.out.println(ans);
    }
}