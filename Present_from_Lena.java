import java.util.Scanner;

public class Present_from_Lena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt();
            //upper triangle
            for(int i=0;i<=n;i++){
                //spaces
                for(int j=0;j<2*(n-i);j++){
                    System.out.print(" ");
                }
                //till mid Number
                for(int k=0;k<=i;k++){
                    if(k>0)System.out.print(" ");
                    System.out.print(k);
                }
                //after mid numbers
                for(int k=i-1;k>=0;k--){
                    System.out.print(" " + k);
                }
                System.out.println();
            }
            //lower triangle
            for(int i=n-1;i>=0;i--){
                //spaces
                for(int j=0;j<2*(n-i);j++){
                    System.out.print(" ");
                }
                //till mid Number
                for(int k=0;k<=i;k++){
                    if(k > 0)System.out.print(" ");
                    System.out.print(k);
                }
                //after mid numbers
                for(int k=i-1;k>=0;k--){
                    System.out.print(" " + k);
                }
                System.out.println();
            }
        // }

        sc.close();
    }
}
