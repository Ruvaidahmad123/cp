import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            int ans=0;
            int total_capacity=0;
            for(int i=0;i<n;i++){
                int exit=sc.nextInt();
                int entry=sc.nextInt();
                total_capacity-=exit;
                total_capacity+=entry;
                ans=Math.max(ans,total_capacity);
            }
            System.out.println(ans);
        sc.close();
    }
}
