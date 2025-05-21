import java.util.Scanner;

public class Repeating_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
            int n = sc.nextInt(); 
            sc.nextLine(); 
            String str = sc.nextLine();
            StringBuilder res = new StringBuilder();
            int i = 0;
            int jump = 1;
            while (i < str.length()) {
                res.append(str.charAt(i));
                i += jump;
                jump++;
            }
            System.out.println(res.toString());
        // }
        sc.close();
    }
}
