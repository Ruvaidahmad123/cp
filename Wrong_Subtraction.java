import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            long n=sc.nextLong();
            int k=sc.nextInt();
            while(k-->0){
                if(n%10!=0){
                    n-=1;
                }
                else{
                    n/=10;
                }
            }
            System.out.println(n);
        sc.close();
    }
}
