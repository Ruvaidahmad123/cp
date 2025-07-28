import java.io.*;
import java.util.*;

public class Line_Segment
 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long px = Long.parseLong(st.nextToken());
            long py = Long.parseLong(st.nextToken());
            long qx = Long.parseLong(st.nextToken());
            long qy = Long.parseLong(st.nextToken());
            
            long L = 0;       // sum of all a_i
            long M = 0;       // maximum single a_i
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                long ai = Long.parseLong(st.nextToken());
                L += ai;
                M = Math.max(M, ai);
            }
            
            long dx = qx - px;
            long dy = qy - py;
            long dist2 = dx * dx + dy * dy;

            long rest = L - M;
            long minDist = M > rest ? (M - rest) : 0;
            
            long maxDist2 = L * L;
            long minDist2 = minDist * minDist;
            
            if (dist2 <= maxDist2 && dist2 >= minDist2) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        
        System.out.print(sb);
    }
}
