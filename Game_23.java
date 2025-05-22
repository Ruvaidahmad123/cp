import java.util.Scanner;

public class Game_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m%n!=0){
                System.out.println(-1);
            }
            else{
                int remaining=m/n;
                int cnt_two=0;
                while(remaining>0 && remaining%2==0){
                    cnt_two++;
                    remaining/=2;
                }
                int cnt_three=0;
                while(remaining>0 && remaining%3==0){
                    cnt_three++;
                    remaining/=3;
                }
                if(remaining>1){
                    System.out.println(-1);
                }
                else{
                    System.out.println(cnt_three+cnt_two);
                }
            }
        // }

        sc.close();
    }
}
