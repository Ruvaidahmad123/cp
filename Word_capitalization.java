import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Word_capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            Set<Character>set=new HashSet<>();
            String str=sc.nextLine();
            char arr[]=str.toCharArray();
            char ch=arr[0];
            arr[0]=Character.toUpperCase(ch);
            String new_str=new String(arr);
            System.out.println(new_str);
    // }
        sc.close();
    }
}
