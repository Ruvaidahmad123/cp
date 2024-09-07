import java.util.*;
public class Desorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int min=Integer.MAX_VALUE;
            boolean flag=false;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(i!=0 && arr[i]<arr[i-1]){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.println(0);
                continue;
            }
            for(int i=1;i<n;i++){
                min=Math.min(min,arr[i]-arr[i-1]);
            }
            int ans=min/2 +1;
            System.out.println(ans);
        }
        sc.close();
    }
}
