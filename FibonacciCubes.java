import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciCubes {
    private static final int[] s = {
        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    };

    static class Cube {
        int w;
        int l;
        int h;

        Cube(int w, int l, int h) {
            this.w = w;
            this.l = l;
            this.h = h;
        }
    }

    private static void answer(String x) {
        System.out.println(x);
    }

    private static void solve(int n, List<Cube> c) {
        int m = c.size();
        StringBuilder p = new StringBuilder("0".repeat(m));

        for (int i = 0; i < m; i++) {
            if (s[n] > c.get(i).w || s[n] > c.get(i).l || s[n] > c.get(i).h) {
                continue;
            }

            if (s[n + 1] <= c.get(i).w || s[n + 1] <= c.get(i).l || s[n + 1] <= c.get(i).h) {
                p.setCharAt(i, '1');
            }
        }

        answer(p.toString());
    }

    private static void testCase(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Cube> c = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            c.add(new Cube(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        solve(n, c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            testCase(scanner);
        }
        
        scanner.close();
    }
}
