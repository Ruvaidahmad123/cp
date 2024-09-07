import java.util.*;
public class Twin_Permutations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print(n+1-arr[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
