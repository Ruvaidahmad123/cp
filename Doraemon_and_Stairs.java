import java.util.Scanner;

public class Doraemon_and_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt(); //11
            int m=sc.nextInt();  //2
            // 2x+1*y=11
            boolean found=false;
            for(int k=m;k<=n;k+=m){
                //check if k is valid number of steps
                //x+y=k and k%m==0 and it should satisfy 2x+y=11 with x>=0 and y>=0
                //y=2k-n and x=k-y
                if(2*k-n>=0){  //check if y is valid
                    //check if x is also valid
                    if(k-(2*k-n)>=0){
                        found=true;
                        System.out.println(k);
                        break;
                    }
                }
                
            }
            if(!found)
            System.out.println(-1);
        // }
        sc.close();
    }
}
