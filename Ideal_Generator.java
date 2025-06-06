import java.util.*;

public class Ideal_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> results = new ArrayList<>();

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a % 2 == 1) {
                results.add("yes");
            } else {
                results.add("no");
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
