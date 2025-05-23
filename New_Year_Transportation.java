import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class New_Year_Transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt(); 
            int m=sc.nextInt();  
            int arr[]=new int[n];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<ArrayList<Integer>>list=new ArrayList<>();
            for(int i=0;i<=n;i++){
                list.add(new ArrayList<>());
            }
            for(int i=0;i<n;i++){
                list.get(i+1).add(i+1+arr[i]);
            }
            boolean visited[]=new boolean[n+1];
            Queue<Integer>q=new LinkedList<>();
            q.add(1);
            visited[1]=true;
            boolean found=false;
            while(!q.isEmpty()){
                int cell=q.poll();
                for(int adjnode:list.get(cell)){
                    if(!visited[adjnode]){
                        visited[adjnode]=true;
                        q.add(adjnode);
                    }
                    if(adjnode==m){
                        found=true;
                        System.out.println("YES");
                        break;
                    }
                }
                if(found)break;
            }
            if(!found)
            System.out.println("NO");
        // }
        sc.close();
    }
}
