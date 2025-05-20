import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        // n, k, l, c, d, p, nl, np,
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int total_ml=k*l;
        int total_enough_toast=total_ml/nl;
        int total_enough_limes=c*d;
        int total_enough_salt=p/np;
        System.out.println(Math.min(Math.min(total_enough_salt,total_enough_limes),total_enough_toast)/n);
        // }
        sc.close();
    }
}
