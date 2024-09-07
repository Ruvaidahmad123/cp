import java.util.*;
public class Unit_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int freqneg=0;
            int freqpos=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0){
                    freqneg++;
                }
                else{
                    freqpos++;
                }
            }
            if(freqpos>freqneg){
                if(freqneg%2==0){
                    System.out.println(0);
                    continue;
                }
                else{
                    System.out.println(1);
                    continue;
                }
            }
            else{
                int toremove=freqneg-n/2;
                if((n/2)%2==1){
                    toremove++;
                    System.out.println(toremove);
                }
                else{
                    System.out.println(toremove);
                }
                
            }
        }
        sc.close();
    }
}
