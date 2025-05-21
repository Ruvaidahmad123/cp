import java.util.Scanner;

public class Erasing_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str=sc.nextLine();
            int start=str.indexOf('1');
            int end=str.lastIndexOf('1');
            int cnt=0;
            // System.out.println("----"+start+"---"+end);
            for(int i=start+1;i<=end-1;i++){
                if(str.charAt(i)=='0')cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
