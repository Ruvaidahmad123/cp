import java.util.Scanner;

public class Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n == 0) {
                System.out.println(1);
                continue;
            }
            int maxRun = 1;
            int currentRun = 1;
            // Reusing Values: At points where the operator changes, we can reuse values to minimize distinct elements
            // The correct approach involves identifying the longest consecutive sequence of '<' or '>' in the string and
            // then calculating the minimum cost as the length of this sequence plus one. 
            // This ensures that the array meets the compatibility requirements with the fewest distinct elements possible.
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentRun++;
                    maxRun = Math.max(maxRun, currentRun);
                } else {
                    currentRun = 1;
                }
            }
            System.out.println(maxRun + 1);
        }
        sc.close();
    }
}
