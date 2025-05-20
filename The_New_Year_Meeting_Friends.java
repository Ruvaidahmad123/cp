import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        Arrays.sort(x);
        //closest distance would be median
        // a=min(x 1,x 2 ,x 3) 
        // b=median(x 1,x 2,x 3) 
        // c=max(x 1,x 2,x 3)
        // If the friends meet at b, the total distance is: ∣a−b∣+∣b−b∣+∣c−b∣=(b−a)+0+(c−b)=c−a That is the minimal possible total distance.
        int median=x[1];
        int total_dist_to_Travel=Math.abs(x[1]-x[0])+Math.abs(x[1]-x[1])+Math.abs(x[1]-x[2]);
        System.out.println(total_dist_to_Travel);
        // }
        sc.close();
    }
}
