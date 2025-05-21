import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
            // int n = sc.nextInt(); 
            // sc.nextLine(); 
            String str = sc.nextLine();
            StringBuilder res = new StringBuilder();
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','y'));
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(!vowels.contains(Character.toLowerCase(ch))){
                    res.append('.');
                    res.append(Character.toLowerCase(ch));
                }
            }
            System.out.println(res.toString());
        // }
        sc.close();
    }
}
