import java.util.*;

public class Vadim_collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int[] count = new int[10];
            for (char c : s.toCharArray()) {
                count[c - '0']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int requiredMin = 10 - (i + 1);
                for (int d = requiredMin; d <= 9; d++) {
                    if (count[d] == 0) continue;
                    count[d]--;
                    if (i == 9) {
                        sb.append(d);
                        count[d]++;
                        break;
                    }
                    List<Integer> dList = new ArrayList<>();
                    for (int digit = 0; digit <= 9; digit++) {
                        for (int c = 0; c < count[digit]; c++) {
                            dList.add(digit);
                        }
                    }
                    boolean valid = true;
                    int maxK = 8 - i;
                    for (int k = 0; k <= maxK; k++) {
                        if (dList.get(k) < k) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        sb.append(d);
                        break;
                    } else {
                        count[d]++;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}