import java.util.*;
public class United_We_Stand
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            ArrayList<Integer>list1=new ArrayList<>();
            ArrayList<Integer>list2=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            list1.add(arr[0]);
            for(int i=1;i<n;i++){
                if(list1.get(list1.size()-1)%arr[i]!=0){
                    list2.add(arr[i]);
                }
                else{
                    list1.add(arr[i]);
                }
            }
            if(list1.size()==0 || list2.size()==0){
                System.out.println(-1);
                continue;
            }
            System.out.print(list1.size()+" "+list2.size());
            System.out.println();
            int[] array1 = list1.stream().mapToInt(Integer::intValue).toArray();
            int[] array2 = list2.stream().mapToInt(Integer::intValue).toArray();
            for(int x:array1){
                System.out.print(x+" ");
            }
            System.out.println();
            for(int x:array2){
                System.out.print(x+" ");
            }
        } 
        sc.close();
	}
}    
