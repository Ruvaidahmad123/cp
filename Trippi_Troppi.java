import java.util.Scanner;

public class Trippi_Troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tests = sc.nextInt();
        sc.nextLine();
        while (Tests-- > 0) {
            solve(sc);
        }
    }
    static void solve(Scanner sc) {
        String line = sc.nextLine();
        String[] words = line.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(word.charAt(0));
        }
        System.out.println(sb.toString());
    }
}
