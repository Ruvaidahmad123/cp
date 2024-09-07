import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            int l=0;
            int r=n-1;
            while(l<=r && str.charAt(l)!=str.charAt(r)){
                l++;
                r--;
            }
            System.out.println(r-l+1);
        }
        sc.close();
    }
}
