import java.util.Scanner;

public class Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int pre[]=new int[n];
            pre[0]=0;
            for(int i=1;i<n;i++){
                if(arr[pre[i-1]]<arr[i]){
                    pre[i]=pre[i-1];
                }
                else{
                    pre[i]=i;
                }
            }
            int suff[]=new int[n];
            suff[n-1]=n-1;
            for(int i=n-2;i>=0;i--){
                if(arr[suff[i+1]]<arr[i]){
                    suff[i]=suff[i+1];
                }
                else{
                    suff[i]=i;
                }
            }
            boolean found=false;
            for(int i=1;i<n-1;i++){
                if(arr[i]>arr[pre[i-1]] && arr[i]>arr[suff[i+1]]){
                    found=true;
                    System.out.println("YES");
                    System.out.println((pre[i-1]+1)+" "+(i+1)+" "+(suff[i+1]+1));
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
