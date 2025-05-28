import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wonderful_Sticks {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int[] result = null;
            boolean found = false;
            for (int candidate = n; candidate >= 1; candidate--) {
                boolean[] used = new boolean[n + 1];
                int[] a = new int[n];
                a[0] = candidate;
                used[candidate] = true;
                int currentMin = candidate;
                int currentMax = candidate;
                boolean valid = true;
                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == '<') {
                        int x = -1;
                        for (int num = currentMin - 1; num >= 1; num--) {
                            if (!used[num]) {
                                x = num;
                                break;
                            }
                        }
                        if (x == -1) {
                            valid = false;
                            break;
                        }
                        a[i + 1] = x;
                        used[x] = true;
                        currentMin = x;
                    } else {
                        int x = -1;
                        for (int num = currentMax + 1; num <= n; num++) {
                            if (!used[num]) {
                                x = num;
                                break;
                            }
                        }
                        if (x == -1) {
                            valid = false;
                            break;
                        }
                        a[i + 1] = x;
                        used[x] = true;
                        currentMax = x;
                    }
                }
                if (valid) {
                    result = a;
                    found = true;
                    break;
                }
            }
            if (result == null) {
                result = new int[n];
                for (int i = 0; i < n; i++) {
                    result[i] = i + 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(result[i]).append(' ');
            }
            System.out.println(sb);
        }
    }

}
