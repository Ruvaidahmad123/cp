import java.util.*;
public class GrassHopper_On_A_Line{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(x<k){
                System.out.println(1);
                System.out.println(x);
            }
            else if(x==k){
                System.out.println(2);
                System.out.print(x-1 +" "+1);
                System.out.println();
            }
            else if(x%k!=0){
                System.out.println(1);
                System.out.println(x);
            }
            else{
                System.out.println(2);
                System.out.print(x-1 +" "+1);
                System.out.println();
            }
        }
        sc.close();
    }
}
