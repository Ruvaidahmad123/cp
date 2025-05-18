import java.util.Scanner;

public class Odd_queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int queries=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int pre[]=new int[n];
            pre[0]=arr[0];
            for(int i=1;i<n;i++){
                pre[i]=pre[i-1]+arr[i];
            }
            int total_sum=pre[n-1];
            // System.out.println(Arrays.toString(pre));
            for(int i=0;i<queries;i++){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int k=sc.nextInt();
                int window_sum = pre[r] - (l == 0 ? 0 : pre[l - 1]);
                int window_len=r-l+1;
                int new_sum=total_sum-window_sum+(window_len)*k;
                if(new_sum%2!=0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
