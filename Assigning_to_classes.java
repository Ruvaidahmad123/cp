import java.util.Arrays;
import java.util.Scanner;

public class Assigning_to_classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[2*n+1];
            for(int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n+1]-arr[n]);
        }

        sc.close();
    }
}
