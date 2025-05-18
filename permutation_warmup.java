import java.util.*;
public class permutation_warmup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            // [1,2,3,4,5..,n-2,n-1,n]  f(n)=0
            //[1,2,3,4,5,...,n-2,n,n-1] interchanging last and second last function value increases by 2
            //[1,2,3,4,5....n] here fn return max value n^2/2;
            // so a0=0 an=n^2/2 and d=2;
            //an=a0+(n-1)*d;
            //n=(an-a0)/d+1;
            //n=n^2/4+n-1
            System.out.println((n*n)/4 +1);
        }
    }
}