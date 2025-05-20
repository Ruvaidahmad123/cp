import java.util.Scanner;

public class In_Search_of_An_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            boolean hard=false;
            for(int i=0;i<n;i++){
                int difficulty_check=sc.nextInt();
                if(difficulty_check==1){
                    hard=true;
                    System.out.println("HARD");
                    break;
                }
            }
            if(!hard){
                System.out.println("EASY");
            }
        sc.close();
    }
}
