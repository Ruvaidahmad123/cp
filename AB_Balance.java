import java.util.Scanner;

public class AB_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str=sc.next();
            //aaaaabbbbaaaaabbbbaa
            //if str[0] and str[n-1] are equal this means count of ab and ba is equal
            //if not equal then change either str0 from a to b or b to a to make it equal to last character and again property 1 will make 
            //count of ab and ba equal
            int n=str.length();
            if(n==1){
                System.out.println(str);
            }
            else if(str.charAt(0)==str.charAt(n-1)){
                System.out.println(str);
            }
            else{
                char ch=str.charAt(0);
                if(ch=='a')ch='b';
                else ch='a';
                String newstr=new String(ch+str.substring(1,n));
                System.out.println(newstr);
            }
        }
        sc.close();
    }
}
