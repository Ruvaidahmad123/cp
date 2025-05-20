import java.util.*;
public class Nearly_Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            long n=sc.nextLong();
            long lucky_dig=0;
            while(n>0){
                long dig=n%10;
                if(dig==4 || dig==7)lucky_dig++;
                n/=10;
            }
            System.out.println(lucky_dig==4 || lucky_dig==7?"YES":"NO");
        sc.close();
    }
}
