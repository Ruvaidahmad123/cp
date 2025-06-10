import java.util.*;

public class Simple_Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            if(x>1 && k>1){
                System.out.println("NO");
            }else if(k==1){
                if(isPrime(x)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if(k==2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
    public static boolean isPrime(int a){
         if(a<=1){
             return false;
         }
         if(a<=3){
             return true;
         }
         if(a%2==0 || a%3==0){
             return false;
         }
         for(int i=5;i*i<=a;i= i+6){
             if(a%i==0 || a%(i+2)==0){
                 return false;
             }
         }
         return true;
    }
}