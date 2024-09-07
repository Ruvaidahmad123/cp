import java.util.*;
public class How_Much_Does_Daytona_Cost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            int k = sc.nextInt();
            boolean flag=false;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==k)flag=true;
            }
            if(flag==true)System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
