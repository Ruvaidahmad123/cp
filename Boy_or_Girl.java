import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            Set<Character>set=new HashSet<>();
            String str=sc.nextLine();
            for(char ch:str.toCharArray()){
                set.add(ch);
            }
            System.out.println(set.size()%2==0?"CHAT WITH HER!":"IGNORE HIM!");
    // }
        sc.close();
    }
}
