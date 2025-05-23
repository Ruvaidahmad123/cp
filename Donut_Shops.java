import java.util.Scanner;

public class Donut_Shops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            // a=5 b=10 c=4
                // -1  10
            
            // a=4 b=5 c=20
               // 1  -1
            // a=2 b=2 c=3
               // 1  2
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long f=-1;
            long s=-1;
            //for one donut
            if(a<c)f=1;
            //for b donuts
            if(b*a>c)s=b;
            System.out.println(f+" "+s);
        }
    }
}
