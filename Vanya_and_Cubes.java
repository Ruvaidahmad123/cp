import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            int level=1;
            int total = 0;
            int count = 0;
            while(true){
                int cubes_on_this_level = (level * (level + 1))/2;
                if(total + cubes_on_this_level > n)break;
                total+=cubes_on_this_level;
                level++;
                count++;
            }
            System.out.println(count);
        // }
        sc.close();
    }
}
