import java.io.*;
import java.util.*;

public class Brightness_Begin {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = input();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long k = in.nextLong();
        // k = n - sqrt(n)
        // We need to find the smallest n such that n - sqrt(n) >= k

        long l = 1, r = (long) 2e18;
        while (r - l > 1) {
            long mid = l + (r - l) / 2;
            long sqrt = integerSqrt(mid);
            long nonPerfect = mid - sqrt;
            if (nonPerfect >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        System.out.println(r);
    }

    public static long integerSqrt(long x) {
        long l = 0, r = (long) 1e9 + 1;
        while (l <= r) {
            long m = l + (r - l) / 2;
            if (m * m <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    public static int input() {
        return in.nextInt();
    }
}

class Pair {
    int first;
    int second;

    public Pair(int f, int s) {
        this.first = f;
        this.second = s;
    }
}
