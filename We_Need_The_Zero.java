import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int ans=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(i==0){
                    ans=arr[i];
                }
                else{
                    ans=ans^arr[i];
                }
            }
            if(n%2==1){
                System.out.println(ans);
            }
            else{
                if(ans==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
        sc.close();
    }
}
