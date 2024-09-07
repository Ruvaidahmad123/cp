import java.util.*;
public class Goals_of_Victory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println(-sum);
        }
        sc.close();
    }
}
