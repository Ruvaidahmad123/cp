import java.util.Scanner;

public class Petr_and_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[7];
            for(int i=0;i<7;i++){
                arr[i]=sc.nextInt();
            }
            // 15 20 20 15 10 30 45
            int idx=0;
            while(n>0){
                n-=arr[idx%7];
                // System.out.println("left val: "+n+" at idx: "+idx);
                if(n<=0)break;
                idx++;
            }
            System.out.println((idx)%7+1); //to make it one-indexed
        // }

        sc.close();
    }
}
