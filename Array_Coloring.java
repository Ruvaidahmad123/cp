import java.util.*;
public class Array_Coloring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(sum%2==1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
