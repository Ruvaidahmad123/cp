import java.util.Scanner;

public class Fix_You {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            sc.nextLine(); 
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
            int changes = 0;
            //right coloumn shouldn't have any R in it
            for(int i=0;i<n;i++){
                if(grid[i][m-1]=='R')changes++;
            }
            //bottom coloumn shouldn't have any D in it
            for(int i=0;i<m;i++){
                if(grid[n-1][i]=='D')changes++;
            }
            System.out.println(changes);
        }

        sc.close();
    }
}
