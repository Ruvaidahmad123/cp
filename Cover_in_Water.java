import java.util.*;
public class Main
{
    public static int getAns(String row){
        int count=0;
        int ans=0;
        int flag=-1;
        for(int i=0;i<row.length();i++){
            char ch=row.charAt(i);
            if(ch=='#'){
                ans+=count;
                count=0;
            }
            else{
                count++;
                if(count>=3){
                    flag=1;
                    break;
                }
            } 
        }
        ans+=count;
        if(flag==1)return 2;
        else return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t = sc.nextInt();  
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            String row=sc.next();
            int ans=getAns(row);
            System.out.println(ans);
        }
        sc.close();
	}
}
