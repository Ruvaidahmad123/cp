import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String str=n+"";
            int to_num=str.charAt(0)-'0';
            int start_digit=to_num;
            int partial_sum=(to_num-1)*10;
            int additional_sum=0;
            while(to_num<=n){
                additional_sum+=(to_num+"").length();
                to_num=to_num*10+start_digit;
            }
            System.out.println(partial_sum+additional_sum);
        }
        sc.close();
    }
}
