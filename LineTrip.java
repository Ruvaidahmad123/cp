import java.util.*;
public class LineTrip
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int end = sc.nextInt();
            int arr[] = new int[n];
            int midmax=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(i>0){
                    midmax=Math.max(midmax,arr[i]-arr[i-1]);
                }
            }
            int beginmax=arr[0];
            int endmax=(end-arr[n-1])*2;
            System.out.println(Math.max(beginmax,Math.max(midmax,endmax)));
        }
        sc.close();
	}
}
