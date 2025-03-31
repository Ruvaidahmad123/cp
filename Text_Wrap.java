import java.util.*;
public class Text_Wrap {
    public static boolean isPossible(int[] arr, long maxWidth, int maxLines) {
        int lines = 1;
        long currentWidth = 0;

        for (int i = 0; i < arr.length; i++) {
            if (currentWidth + arr[i] <= maxWidth) {
                currentWidth += arr[i] + 1; // Adding word length + space
            } else {
                lines++;
                currentWidth = arr[i] + 1; // Start new line with the next word
            }
            if (lines > maxLines) return false; // Stop early
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0, maxWordLength = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            maxWordLength = Math.max(maxWordLength, arr[i]);
        }
        long l = maxWordLength; // Min width must fit the longest word
        long r = sum + n - 1; // Max width is if all words were on one line
        long ans = r;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isPossible(arr, mid, m)) {
                ans = mid;
                r = mid - 1; // Try to minimize width
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
