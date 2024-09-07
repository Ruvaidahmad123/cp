import java.util.*;
public class Walking_Maste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b>d){
                System.out.println(-1);
            }
            else{
                if(a+d-b<c){
                    System.out.println(-1);
                }
                else{
                    System.out.println(2*(d-b)+a-c);  //pehle y cover karlo then x
                }
            }
        }
        sc.close();
    }
}
