import java.util.Scanner;

public class Not_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //to remove elements from array which have 1 as element as 1 divides every element
            for(int i=0;i<n;i++){
                arr[i]+=1;
            }
            for(int i=1;i<n;i++){
                if(arr[i]%arr[i-1]==0){
                    arr[i]+=1;
                }
            }
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
