import java.util.Scanner;

public class Third_Side {
    public static int theThirdSide(int n, int[] a){
        int sum = 0;
        for(int num : a){
            sum+=num;
        }
        return sum-n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(theThirdSide(n, a));
        }
    }
}
