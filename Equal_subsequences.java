
import java.util.Scanner;

public class Equal_subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            solve(scanner);
            t--;
        }
        scanner.close();
    }

    static void solve(Scanner scanner){
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i = 0; i < k; i++){
            System.out.print('1');
        }
        for(int i = k; i < n; i++){
            System.out.print('0');
        }

        System.out.println();
    }

} 