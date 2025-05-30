import java.util.Scanner;

public class Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b >= 2 * a) {
                System.out.println(n * a);
            } else {
                int x = n % 2;
                n = n / 2;
                System.out.println(n * b + x * a);
            }
        }

        sc.close();
    }
}
