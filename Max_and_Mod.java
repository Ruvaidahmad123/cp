import java.util.Scanner;
import java.util.Arrays;

public class Max_and_Mod {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int j = 0; j < t; j++){
            int n = s.nextInt();
            int[] arr = new int[n];

            if (n % 2 == 0)
                System.out.print(-1);
            else {
                arr[0] = n;
                for (int i = 1; i < n; i++)
                    arr[i] = i;
                for (int i = 0; i < n; i++)
                    System.out.printf("%d ", arr[i]);
            }
            System.out.println();
        }
    }
}
