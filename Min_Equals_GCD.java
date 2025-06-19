import java.util.*;

public class Min_Equals_GCD {
  private static long gcd(long a,long b){
    if(a==0)return b;
    return gcd(b%a,a);
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0; i<n; i++)a[i]=sc.nextLong();
        
        int minId=0;
        for(int i=1; i<n; i++){
          if(a[i]<a[minId]){
            minId=i;
          }
        }
        
        long g=0;
        for(int i=0; i<n; i++){
          if(i!=minId && a[i]%a[minId]==0){
            g=gcd(g,a[i]);
          }
        }
        
        if(g==a[minId])System.out.println("YES");
        else System.out.println("NO");
      }
  }
}