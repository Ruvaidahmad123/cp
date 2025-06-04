import java.util.*;

public class Cherry_Bomb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Set<Integer> s = new HashSet<>();
            int unknownCount = 0;

            for (int i = 0; i < n; i++) {
                if (b[i] != -1) {
                    s.add(a[i] + b[i]);
                    if (s.size() > 1) {
                        break;
                    }
                } else {
                    unknownCount++;
                }
            }

            if (unknownCount == n) {
                int maxA = Arrays.stream(a).max().getAsInt();
                int minA = Arrays.stream(a).min().getAsInt();
                System.out.println(k - (maxA - minA) + 1);
            } else if (s.size() > 1) {
                System.out.println(0);
            } else {
                int y = s.iterator().next(); // Only one element in the set
                int maxA = Arrays.stream(a).max().getAsInt();
                int minA = Arrays.stream(a).min().getAsInt();

                if (maxA > y || y - minA > k) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
