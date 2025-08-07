import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Draw_SQuare {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            solve();
        }
        System.out.print(sb.toString());
    }

    static void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());

        if (l > 0 && r > 0 && d > 0 && u > 0) {
            double lu = Math.sqrt(l * l + u * u);
            double ur = Math.sqrt(u * u + r * r);
            double rd = Math.sqrt(r * r + d * d);
            double dl = Math.sqrt(d * d + l * l);
            double lr = Math.sqrt(l * l + r * r);
            double du = Math.sqrt(d * d + u * u);

            if (equal(lu, ur) && equal(ur, rd) && equal(rd, dl) && equal(lr, du)) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        } else {
            sb.append("No\n");
        }
    }

    // Helper method to compare doubles with tolerance
    static boolean equal(double a, double b) {
        final double EPS = 1e-6;
        return Math.abs(a - b) < EPS;
    }
}
