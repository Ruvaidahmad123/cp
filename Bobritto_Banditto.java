import java.util.*;

public class Bobritto_Banditto {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long l = sc.nextLong();
        long r = sc.nextLong();

        if (r > 0) {
            long st = 0, en = 0;
            long x = Math.min(m, r);
            m -= x;
            st = x;
            if (m > 0) {
                en = -m;
            }
            System.out.println(en + " " + st);
            return;
        }

        System.out.println(-m + " 0");
    }

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            solve();
        }
    }
}
