import java.util.*;
public class Dont_Try_To_Count{
    public static int getAns(String str1,String str2){
        int moves=0;
        while(moves<=5){
            str1+=str1;
            moves++;
            if(str1.contains(str2)){
                return moves;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            if(str1.contains(str2))System.out.println(0);
            else{
                int ans=getAns(str1,str2);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
