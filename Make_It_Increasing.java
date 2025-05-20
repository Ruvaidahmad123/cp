import java.util.Scanner;

public class Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=n-2;
            int ans=0;
            for(;i>=0;i--){
                if(arr[i+1]==0)break;
                while(arr[i+1]<=arr[i]){
                    arr[i]/=2;
                    ans++;
                }
            }
            if(i>=0){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
