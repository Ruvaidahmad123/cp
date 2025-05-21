import java.util.ArrayList;
import java.util.Scanner;

public class Numbers_on_WhiteBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        //we know the minimum answer can be 2 cuz lets just say we merge two positive numbers, and at least one of them is 2
//  or greater, the new number is always greater than 1
//greedily keep decreasing larger number to get final result minimum
        while (t-- > 0) {
            int n=sc.nextInt();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(i+1);
            }
            // int n=list.size()-1;
            System.out.println(2);
            while(list.size()>1){
                int size=list.size();
                int a = list.remove(list.size() - 1); 
                int b = list.remove(list.size() - 1); 
                int new_val = (int) Math.ceil((a + b) / 2.0);
                list.add(new_val);
                System.out.println(a+" "+b);

            }
            
        }

        sc.close();
    }
}
