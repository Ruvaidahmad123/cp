import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            int ans=0;
            while(a<=b){
                ans++;
                a*=3;
                b*=2;
            }
            System.out.println(ans);
        sc.close();
    }
}
