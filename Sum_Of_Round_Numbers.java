import java.util.Scanner;

public class Sum_Of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String str=n+"";
            int arr[]=new int[str.length()+1];
            int mult=1;
            int idx=str.length();
            int cnt=0;
            while(n>0){
                int dig=n%10;
                if(dig!=0)cnt++;
                arr[idx--]=dig*mult;
                mult*=10;
                n/=10;
            }
            System.out.println(cnt);
            for(int x:arr){
                if(x!=0)
                System.out.print(x+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
