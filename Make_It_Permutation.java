import java.util.Scanner;

public class Make_It_Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();                // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();            // matrix size (rows = columns)

            out.append(2L * n - 1).append('\n');   // total operations = 2n-1

            /* rows 1 … n-1 each get two reversals */
            for (int i = 1; i < n; i++) {
                out.append(i).append(' ').append(1).append(' ').append(i).append('\n');  // prefix 1…i
                out.append(i).append(' ').append(i + 1).append(' ').append(n).append('\n');  // suffix i+1…n
            }

            /* row n gets one full-row reversal */
            out.append(n).append(' ').append(1).append(' ').append(n).append('\n');
        }

        System.out.print(out);   // flush everything at once
        sc.close();
    }
}
