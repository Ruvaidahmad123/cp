import java.util.*;

public class Sort {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {

        int n = in.nextInt();
        int q = in.nextInt();

        String a = in.next();
        String b = in.next();

        int freqA[][] = new int[26][n + 1];
        int freqB[][] = new int[26][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {

                freqA[j][i + 1] = freqA[j][i]; // carrying it forward
                freqB[j][i + 1] = freqB[j][i];
            }

            freqA[a.charAt(i) - 'a'][i + 1]++; // that's how prefix works right ?
            freqB[b.charAt(i) - 'a'][i + 1]++;
        }

        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            int count = 0;

            for (int j = 0; j < 26; j++) { // checking for each character's count

                int countA = freqA[j][r] - freqA[j][l - 1];
                int countB = freqB[j][r] - freqB[j][l - 1];

                if(countA < countB) count += countB - countA;
            }
            System.out.println(count);
        }
    }
}
