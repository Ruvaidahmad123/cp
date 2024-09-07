import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            } else {
                if (k == 1) {
                    System.out.println("NO");
                } else if (n % 2 == 0) {
                    System.out.println("YES");
                    System.out.println(n / 2);
                    for (int i = 0; i < n / 2; i++) {
                        System.out.print(2 + " ");
                    }
                    System.out.println();
                } else {
                    if (k >= 3) {
                        System.out.println("YES");
                        System.out.println((n - 3) / 2 + 1);
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println(3);
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        sc.close();
    }
}
