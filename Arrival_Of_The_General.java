import java.util.Arrays;
import java.util.Scanner;

public class Arrival_Of_The_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max = Arrays.stream(arr).max().getAsInt();
            int min = Arrays.stream(arr).min().getAsInt();
            // System.out.println(max+" "+min);
            int max_idx=-1;
            int min_idx=-1;
            for(int i=0;i<n;i++){
                if(arr[i]==max && max_idx==-1){
                    max_idx=i;
                }
                else if(arr[i]==min){
                    min_idx=i;
                }
            }
            if(max_idx<min_idx){
                System.out.println(max_idx+(n-1-min_idx));
            }
            else 
            System.out.println(max_idx+(n-1-min_idx)-1);
        // }
        sc.close();
    }
}
