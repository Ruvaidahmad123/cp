import java.util.Arrays;
import java.util.Scanner;

public class Fox_and_snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] arr = new char[m][n];
            for (char[] row : arr) Arrays.fill(row, '.');
            boolean right = true; 
            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) arr[i][j] = '#';
                } else {
                    if (right) arr[i][n - 1] = '#';
                    else arr[i][0] = '#';
                    right = !right; 
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        // }
        sc.close();
    }
}
