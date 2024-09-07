import java.util.Scanner;
public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        for (int test = 0; test < t; test++) {
            int ans = 0;
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        int minDistToEdge = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        ans += minDistToEdge + 1;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
