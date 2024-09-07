import java.util.*;
public class Jagged_Swaps
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
