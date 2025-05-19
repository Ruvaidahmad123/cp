import java.util.Scanner;

public class Deletive_Editing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNumber = Integer.parseInt(sc.nextLine());
        while (testCaseNumber-- > 0) {
            String[] words = sc.nextLine().split(" ");
            String s = words[0];
            String t = words[1];
            if (s.equals(t)) {
                System.out.println("YES");
                continue;
            }
            if (t.length() > s.length()) {
                System.out.println("NO");
                continue;
            }
            int[] freqS = new int[26];
            int[] freqT = new int[26];
            for (char c : s.toCharArray()) {
                freqS[c - 'A']++;
            }
            for (char c : t.toCharArray()) {
                freqT[c - 'A']++;
            }
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (freqT[i] > freqS[i]) {
                    possible = false;
                    break;
                }
            }
            if (!possible) {
                System.out.println("NO");
                continue;
            }
            if (!isSubsequence(s, t)) {
                System.out.println("NO");
                continue;
            }
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < 26; i++) {
                int removeCount = freqS[i] - freqT[i];
                for (int j = 0; j < removeCount; j++) {
                    int index = sb.indexOf(String.valueOf((char)('A' + i)));
                    if (index != -1) {
                        sb.deleteCharAt(index);
                    }
                }
            }
            if (sb.toString().equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    private static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (tIndex < t.length() && sIndex < s.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        return tIndex == t.length();
    }
}
