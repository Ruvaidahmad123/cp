import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        int row=-1;
        int col=-1;
            int arr[][]=new int[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    arr[i][j]=sc.nextInt();
                    if(arr[i][j]==1){
                        row=i;
                        col=j;
                    }
                }
            }
            int mid_row=2;
            int mid_col=2;
            System.out.println(Math.abs(mid_row-row)+Math.abs(mid_col-col));
        // }
        sc.close();
    }
}
