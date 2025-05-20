import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            String str=sc.nextLine();
            char arr[]=str.toCharArray();
            int n=arr.length;
            for(int i=n-1;i>=0;i--){
                int digit = arr[i] - '0';
                int inverted = 9 - digit;
                if (inverted < digit) {
                    if (i == 0 && inverted == 0) {
                        continue; 
                    }
                    arr[i] = (char)(inverted + '0');
                }
            }
            System.out.println(new String(arr));
        // }
        sc.close();
    }
}
