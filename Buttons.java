import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]+arr[2]==arr[1]+arr[2]){
                if(arr[2]%2==1){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }
            }
            else{
                if(arr[0]+arr[2]>arr[1]+arr[2]){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }
            }
        }
        sc.close();
    }
}
