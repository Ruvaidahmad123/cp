import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            sc.nextLine();
            int x=0;
            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                if(str.indexOf('+')!=-1){
                    x++;
                }
                else{
                    x--;
                }
            }
            System.out.println(x);
        // }
        sc.close();
    }
}
