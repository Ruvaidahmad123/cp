import java.util.*;
public class Coins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            long n=sc.nextLong();
            long b=sc.nextLong();
            if(n%2==0){
                System.out.println("YES");
            }
            else if(n%b==0){
                System.out.println("YES");
            }
            else{
                if((long)(n-b)%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
