import java.util.*;
public class k_string {
    static class Pair{
        char ch;
        int cnt;
        Pair(char ch,int cnt){
            this.ch=ch;
            this.cnt=cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            char arr[]=str.toCharArray();
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                char ch=arr[i];
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            ArrayList<Pair>list=new ArrayList<>();
            for(Map.Entry<Character,Integer>entry:map.entrySet()){
                if(entry.getValue()<n ||entry.getValue()%n!=0){
                    System.out.println(-1);
                    return;
                }
                //each segment of string would have freq[ch]/k elements in each string
                list.add(new Pair(entry.getKey(),entry.getValue()/n));
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                for(Pair p : list){
                    for(int j=0;j<p.cnt;j++){
                        sb.append(p.ch);
                    }
                }
            }
            System.out.println(sb.toString());
        // }

        sc.close();
    }
}
