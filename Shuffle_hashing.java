import java.util.HashMap;
import java.util.Scanner;

public class Shuffle_hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            String p = sc.nextLine();
            String h = sc.nextLine();
            if (h.length() < p.length()) {
                System.out.println("NO");
                continue;
            }
            HashMap<Character, Integer> pCount = new HashMap<>();
            for (char c : p.toCharArray()) {
                pCount.put(c, pCount.getOrDefault(c, 0) + 1);
            }
            HashMap<Character, Integer> hCount = new HashMap<>();
            for (char c : h.toCharArray()) {
                hCount.put(c, hCount.getOrDefault(c, 0) + 1);
            }
            boolean possible = true;
            for (char c : pCount.keySet()) {
                if (hCount.getOrDefault(c, 0) < pCount.get(c)) {
                    possible = false;
                    break;
                }
            }
            if (!possible) {
                System.out.println("NO");
                continue;
            }
            int lenP = p.length();
            HashMap<Character, Integer> windowCount = new HashMap<>();
            for (int i = 0; i < lenP; i++) {
                char c = h.charAt(i);
                windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
            }
            if (windowCount.equals(pCount)) {
                System.out.println("YES");
                continue;
            }
            boolean found = false;
            for (int i = lenP; i < h.length(); i++) {
                char leftChar = h.charAt(i - lenP);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (windowCount.get(leftChar) == 0) {
                    windowCount.remove(leftChar);
                }
                char newChar = h.charAt(i);
                windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);
                if (windowCount.equals(pCount)) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}