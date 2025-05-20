import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            String str=sc.nextLine();
            String words[]=str.split("\\+");
            Arrays.sort(words);
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                sb.append(words[i]);
                if(i != words.length - 1){
                    sb.append('+');
                }
            }
            System.out.println(sb.toString());
    // }
        sc.close();
    }
}
