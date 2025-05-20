import java.util.Scanner;

public class Soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int k=sc.nextInt();
            long n=sc.nextInt();
            int w=sc.nextInt();
            //Computes the total cost as k * (1 + 2 + ... + w) = k * (w * (w + 1) / 2)
            long total_required_money = (long) k * w * (w + 1) / 2;
            if(n>=total_required_money){
                System.out.println(0);
            }
            else
            System.out.println(total_required_money-n);
        sc.close();
    }
}
