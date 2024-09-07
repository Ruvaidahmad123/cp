import java.util.*;
public class Blank_Space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int max=0;
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    count++;
                }
                else{
                    count=0;
                }
                max=Math.max(max,count);
            }
            System.out.println(max);
        }
        sc.close();
    }
}
