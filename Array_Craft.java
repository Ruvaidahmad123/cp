import java.util.*;

public class Array_Craft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xpt = x - 1;
            int ypt = y - 1;
            int[] ans = new int[n];
            boolean has = false;
            for(int i = ypt; i <= xpt; i++) {
                ans[i] = 1;
            }
            for(int i = ypt - 1; i >= 0; i--) {
                if (has) ans[i] = 1;
                else ans[i] = -1;
                has = !has;
            }
            has = false;
            for(int i = xpt + 1; i < n; i++) {
                if (has) ans[i] = 1;
                else ans[i] = -1;
                has = !has;
            }
            for(int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
