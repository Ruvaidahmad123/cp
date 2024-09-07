import java.util.*;
public class Sequence_Game
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            list.add(arr[0]);
            for(int i=1;i<n;i++){
                if(arr[i]>=arr[i-1]){
                    list.add(arr[i]);
                }
                else{
                    list.add(arr[i]);
                    list.add(arr[i]);
                }
            }
            System.out.println(list.size());
            int[] array = list.stream().mapToInt(Integer::intValue).toArray();
            for(int x:array){
                System.out.print(x+" ");
            }
        }
        sc.close();
	}
}
