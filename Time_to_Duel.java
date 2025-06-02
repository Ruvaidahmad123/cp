import java.util.Scanner;
public class Time_to_Duel {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int prev = 1;
        int f = 1;
        int book = 1;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            f &= a;
            if (a == 0 && prev == 0) {
                book = 0;
            }
            prev = a;
        }
        if (f == 1) book = 0;
        if (book == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            solve(sc);
        }
    }
}
