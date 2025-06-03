import java.util.*;

public class Three_Decks {
   static class Pair{
    int val;
    int ind;
    Pair(int val, int ind){
      this.val = val;
      this.ind = ind;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1 ; k <= t ; k++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long diff1 = b-a;
            if(c-diff1 < b){
              System.out.println("NO");
            }else 
            if(c-diff1 == b)
            System.out.println("YES");
            else{
              long diff2 = c-diff1-b;
                if(diff2%3 != 0)
              System.out.println("NO");
              else 
              System.out.println("YES");
              }
            }
        }
    }

