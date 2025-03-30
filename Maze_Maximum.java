
/* 
class Maze_Maximum{
    public static boolean isPossible(int mid, int[][] arr, int n, int m) {
        boolean rowExists = false, colExists = false;
        for (int i = 0; i < n; i++) {
            boolean validRow = true;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < mid) {
                    validRow = false;
                    break;
                }
            }
            if (validRow) {
                rowExists = true;
                break;
            }
        }
        for (int j = 0; j < m; j++) {
            boolean validCol = true;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] < mid) {
                    validCol = false;
                    break;
                }
            }
            if (validCol) {
                colExists = true;
                break;
            }
        }
        return rowExists && colExists;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        int m = sc.nextInt(); // Number of columns          
        int[][] arr = new int[n][m]; // 2D array to store the maze
        int max=Integer.MIN_VALUE; // Variable to store the maximum value in the maze
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt(); // Input the maze values
                max=Math.max(max,arr[i][j]); // Update the maximum value
            }
        }
        int l=1;
        int r=max;
        int ans=0; // Variable to store the answer
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,arr,n,m)){
                ans=mid; // Update the answer if possible
                l=mid+1; // Move to the right half
            }
            else{
                r=mid-1; // Move to the left half
            }
        }
        System.out.println(ans); // Print the answer
        sc.close(); // Close the scanner
    }
}
*/
// Current Complexity:
// The isPossible() function runs in O(NM) time.

// The binary search runs for O(log M) iterations.

// So, the overall complexity is O(NM log M).



//optimized approach: Precompute min values for each row and column:

import java.util.*;

class MazeMaximum {
    public static boolean isPossible(int mid, int[] minRow, int[] minCol, int n, int m) {
        boolean rowExists = false, colExists = false;

        // Check if there's at least one row where all elements are >= mid
        for (int i = 0; i < n; i++) {
            if (minRow[i] >= mid) {
                rowExists = true;
                break;
            }
        }

        // Check if there's at least one column where all elements are >= mid
        for (int j = 0; j < m; j++) {
            if (minCol[j] >= mid) {
                colExists = true;
                break;
            }
        }

        return rowExists && colExists;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];

        int max = Integer.MIN_VALUE;
        int[] minRow = new int[n];  // Store min element in each row
        int[] minCol = new int[m];  // Store min element in each column
        Arrays.fill(minRow, Integer.MAX_VALUE);
        Arrays.fill(minCol, Integer.MAX_VALUE);

        // Read input and compute minRow, minCol, and max value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                max = Math.max(max, arr[i][j]);
                minRow[i] = Math.min(minRow[i], arr[i][j]);
                minCol[j] = Math.min(minCol[j], arr[i][j]);
            }
        }

        int l = 1, r = max, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(mid, minRow, minCol, n, m)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}


//time complexity: O(NM + O(N+M)logM)  
