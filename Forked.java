import java.util.*;
public class Forked {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int xk = in.nextInt();
            int yk = in.nextInt();
            int xq = in.nextInt();
            int yq = in.nextInt();
            int[][] moves = {
                {a, b}, {a, -b}, {-a, b}, {-a, -b},
                {b, a}, {b, -a}, {-b, a}, {-b, -a}
            };
            Set<String> kingAttackPositions = new HashSet<>();
            Set<String> queenAttackPositions = new HashSet<>();
            for (int[] move : moves) {
                int newX = xk + move[0];
                int newY = yk + move[1];
                kingAttackPositions.add(newX + "," + newY);
            }
            for (int[] move : moves) {
                int newX = xq + move[0];
                int newY = yq + move[1];
                queenAttackPositions.add(newX + "," + newY);
            }
            int result = 0;
            for (String pos : kingAttackPositions) {
                if (queenAttackPositions.contains(pos)) {
                    result++;
                }
            }
            System.out.println(result);
        }
        
        in.close();
    }
}
