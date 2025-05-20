import java.util.Arrays;
import java.util.Scanner;

public class Studying_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int cnt=0;
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]<=x){
                    x-=arr[i];
                    cnt++;
                }
            }
            System.out.println(cnt);
        // }
        sc.close();
    }
}
