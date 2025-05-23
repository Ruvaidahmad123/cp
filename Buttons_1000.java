import java.util.Scanner;

public class Buttons_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt();
            long ans=0;
            for(int i=1;i<=n;i++){
                ans+=(n-i)*i+1;
            }
            System.out.println(ans);
        // }
        sc.close();
    }
}
