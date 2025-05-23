import java.util.Scanner;

public class cAPS_lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // while (t-- > 0) {
            String str=sc.nextLine();
            int cnt_of_uppercase=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch)){
                    cnt_of_uppercase++;
                }
            }
            if(cnt_of_uppercase==str.length() || (cnt_of_uppercase==str.length()-1 && Character.isLowerCase(str.charAt(0)))){
                char arr[]=str.toCharArray();
                for(int i=0;i<arr.length;i++){
                    char ch=arr[i];
                    if(Character.isUpperCase(ch)){
                        ch=Character.toLowerCase(ch);
                    }
                    else{
                        ch=Character.toUpperCase(ch);
                    }
                    arr[i]=ch;
                }
                String ans=new String(arr);
                System.out.println(ans);
            }
            else{
                System.out.println(str);
            }
        // }
        sc.close();
    }
}
